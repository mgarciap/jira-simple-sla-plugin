package ar.com.manuelgarcia.jira.dao;

import ar.com.manuelgarcia.jira.model.SLAContract;


/**
 * TODO Documentame Raton
 * @author <a href="mailto:mg@manuelgarcia.com.ar">Manuel Garcia</a> 
 * Aug 10, 2010 12:26:05 AM
 */
public class SLAContractDao extends GenericDao {

	/**
	 * @param projectId
	 * @param issueTypeId
	 * @param priorityId
	 * @return
	 */
	public SLAContract getSLAContract(Long projectId, String issueTypeId,
			String priorityId) {
		// TODO Auto-generated method stub
		SLAContract contract = new SLAContract();
		contract.setPriorityId(priorityId);
		contract.setAgreementHours(3);
		contract.setIssueTypeId(issueTypeId);
		contract.setPriorityId(priorityId);
		return contract;
	}

}
