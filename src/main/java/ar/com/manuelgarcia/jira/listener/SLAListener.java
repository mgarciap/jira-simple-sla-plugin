package ar.com.manuelgarcia.jira.listener;

import org.apache.log4j.Logger;

import ar.com.manuelgarcia.jira.manager.SLAManager;
import ar.com.manuelgarcia.jira.model.SLAContract;

import com.atlassian.jira.ComponentManager;
import com.atlassian.jira.event.issue.AbstractIssueEventListener;
import com.atlassian.jira.event.issue.IssueEvent;
import com.atlassian.jira.issue.Issue;
import com.opensymphony.user.User;


/**
 * TODO Documentame Raton
 * @author <a href="mailto:mg@manuelgarcia.com.ar">Manuel Garcia</a> 
 * Aug 9, 2010 11:33:20 PM
 */
public class SLAListener extends AbstractIssueEventListener {
	
	private static final Logger logger = Logger.getLogger(SLAListener.class);
	/**
	 * Calcular el DueDate al crearse el issue
	 * @see com.atlassian.jira.event.issue.AbstractIssueEventListener#issueCreated(com.atlassian.jira.event.issue.IssueEvent)
	 */
	@Override
	public void issueCreated(IssueEvent event) {
		Issue issue = event.getIssue();
		SLAContract slaContract = SLAManager.getInstance().getSLAContract(issue);
		User user = ComponentManager.getInstance().getJiraAuthenticationContext().getUser();
		ComponentManager.getInstance().getCommentManager().create(issue, user.getFullName(), slaContract.toString(), true);
		
		logger.debug(slaContract);
	}


	/* (non-Javadoc)
	 * @see com.atlassian.jira.event.issue.AbstractIssueEventListener#workflowEvent(com.atlassian.jira.event.issue.IssueEvent)
	 */
	@Override
	public void workflowEvent(IssueEvent event) {
		// TODO Auto-generated method stub
		super.workflowEvent(event);
		logger.debug("workflow Event not implemented yet");
	}

}
