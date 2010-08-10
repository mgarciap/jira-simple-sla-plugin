package ar.com.manuelgarcia.jira.manager;

import ar.com.manuelgarcia.jira.dao.SLAContractDao;
import ar.com.manuelgarcia.jira.model.SLAContract;

import com.atlassian.jira.issue.Issue;
import com.atlassian.scheduler.SchedulerLauncher;

/**
 * TODO Documentame Raton
 * @author <a href="mailto:mg@manuelgarcia.com.ar">Manuel Garcia</a> 
 * Aug 10, 2010 12:15:55 AM
 */
public class SLAManager {
	
	private static SLAManager instance;
	
	/**
	 * Singleton
	 */
	@SuppressWarnings("unused")
	private void SLAManager () {	
	}
	
	public static SLAManager getInstance() {
		if (instance == null) {
			instance = new SLAManager();
		}
		return instance;
	}

	/**
	 * @param issue
	 * @return
	 */
	public SLAContract getSLAContract(Issue issue) {
		SLAContractDao dao = new SLAContractDao();
		Long projectId = issue.getProjectObject().getId();
		String issueTypeId = issue.getIssueTypeObject().getId();
		String priorityId = issue.getPriorityObject().getId();
		return dao.getSLAContract(projectId, issueTypeId, priorityId);
	}

}
