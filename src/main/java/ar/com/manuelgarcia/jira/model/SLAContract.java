package ar.com.manuelgarcia.jira.model;

import java.io.Serializable;

/**
 * TODO Documentame Raton
 * 
 * @author <a href="mailto:mg@manuelgarcia.com.ar">Manuel Garcia</a> Aug 10,
 *         2010 12:14:52 AM
 */
public class SLAContract implements Serializable {

	private static final long serialVersionUID = 15156287915499600L;

	private Long projectId;
	private String issueTypeId;
	private String priorityId;
	private Integer agreementHours;

	public Long getProjectId() {
		return projectId;
	}

	public String getIssueTypeId() {
		return issueTypeId;
	}

	public String getPriorityId() {
		return priorityId;
	}

	/**
	 * @return the agreementHours
	 */
	public Integer getAgreementHours() {
		return agreementHours;
	}

	/**
	 * @param agreementHours
	 *            the agreementHours to set
	 */
	public void setAgreementHours(Integer agreementHours) {
		this.agreementHours = agreementHours;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	/**
	 * @param issueTypeId
	 *            the issueTypeId to set
	 */
	public void setIssueTypeId(String issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	/**
	 * @param priorityId
	 *            the priorityId to set
	 */
	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SLAContract [agreementHours=" + agreementHours
				+ ", issueTypeId=" + issueTypeId + ", priorityId=" + priorityId
				+ ", projectId=" + projectId + "]";
	}

	
}
