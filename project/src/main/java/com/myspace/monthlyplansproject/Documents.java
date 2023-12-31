package com.myspace.monthlyplansproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Documents implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "DOCUMENTS_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "DOCUMENTS_ID_SEQ", name = "DOCUMENTS_ID_GENERATOR")
	@org.kie.api.definition.type.Label("id")
	private String id;

	@org.kie.api.definition.type.Label("Document Business Type Id")
	private java.lang.String documentBusinessTypeId;

	@org.kie.api.definition.type.Label(value = "documentCreatedAt")
	private java.util.Date documentCreatedAt;

	@org.kie.api.definition.type.Label(value = "Created By")
	private java.lang.String documentCreatedBy;

	@org.kie.api.definition.type.Label(value = "Document Name")
	private java.lang.String documentName;

	@org.kie.api.definition.type.Label(value = "Document Path")
	private java.lang.String documentPath;

	@org.kie.api.definition.type.Label(value = "Parent Id")
	private java.lang.String documentRelatedToId;

	@org.kie.api.definition.type.Label(value = "Parent Type")
	private java.lang.String documentRelatedToParent;

	@org.kie.api.definition.type.Label(value = "Document Type")
	private java.lang.String documentType;

	@org.kie.api.definition.type.Label(value = "Updated At")
	private java.util.Date documentUpdatedAt;

	@org.kie.api.definition.type.Label(value = "Updated By")
	private java.lang.String documentUpdatedBy;

	@org.kie.api.definition.type.Label(value = "Deleted")
	private java.lang.Integer deleted;

	public Documents() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getDocumentBusinessTypeId() {
		return this.documentBusinessTypeId;
	}

	public void setDocumentBusinessTypeId(
			java.lang.String documentBusinessTypeId) {
		this.documentBusinessTypeId = documentBusinessTypeId;
	}

	public java.util.Date getDocumentCreatedAt() {
		return this.documentCreatedAt;
	}

	public void setDocumentCreatedAt(java.util.Date documentCreatedAt) {
		this.documentCreatedAt = documentCreatedAt;
	}

	public java.lang.String getDocumentCreatedBy() {
		return this.documentCreatedBy;
	}

	public void setDocumentCreatedBy(java.lang.String documentCreatedBy) {
		this.documentCreatedBy = documentCreatedBy;
	}

	public java.lang.String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(java.lang.String documentName) {
		this.documentName = documentName;
	}

	public java.lang.String getDocumentPath() {
		return this.documentPath;
	}

	public void setDocumentPath(java.lang.String documentPath) {
		this.documentPath = documentPath;
	}

	public java.lang.String getDocumentRelatedToId() {
		return this.documentRelatedToId;
	}

	public void setDocumentRelatedToId(java.lang.String documentRelatedToId) {
		this.documentRelatedToId = documentRelatedToId;
	}

	public java.lang.String getDocumentRelatedToParent() {
		return this.documentRelatedToParent;
	}

	public void setDocumentRelatedToParent(
			java.lang.String documentRelatedToParent) {
		this.documentRelatedToParent = documentRelatedToParent;
	}

	public java.lang.String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(java.lang.String documentType) {
		this.documentType = documentType;
	}

	public java.util.Date getDocumentUpdatedAt() {
		return this.documentUpdatedAt;
	}

	public void setDocumentUpdatedAt(java.util.Date documentUpdatedAt) {
		this.documentUpdatedAt = documentUpdatedAt;
	}

	public java.lang.String getDocumentUpdatedBy() {
		return this.documentUpdatedBy;
	}

	public void setDocumentUpdatedBy(java.lang.String documentUpdatedBy) {
		this.documentUpdatedBy = documentUpdatedBy;
	}

	public java.lang.Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(java.lang.Integer deleted) {
		this.deleted = deleted;
	}

	public Documents(java.lang.String id,
			java.lang.String documentBusinessTypeId,
			java.util.Date documentCreatedAt,
			java.lang.String documentCreatedBy, java.lang.String documentName,
			java.lang.String documentPath,
			java.lang.String documentRelatedToId,
			java.lang.String documentRelatedToParent,
			java.lang.String documentType, java.util.Date documentUpdatedAt,
			java.lang.String documentUpdatedBy, java.lang.Integer deleted) {
		this.id = id;
		this.documentBusinessTypeId = documentBusinessTypeId;
		this.documentCreatedAt = documentCreatedAt;
		this.documentCreatedBy = documentCreatedBy;
		this.documentName = documentName;
		this.documentPath = documentPath;
		this.documentRelatedToId = documentRelatedToId;
		this.documentRelatedToParent = documentRelatedToParent;
		this.documentType = documentType;
		this.documentUpdatedAt = documentUpdatedAt;
		this.documentUpdatedBy = documentUpdatedBy;
		this.deleted = deleted;
	}

}