package lab1;

import java.io.Serializable;
import java.time.LocalDate;

public class Document implements Serializable {
    private String documentNumber;
    private String documentSerialNumber;
    private int documentType;
    private LocalDate issueDate;
    private String issuedBy;
    private String subdivisionCode;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentSerialNumber() {
        return documentSerialNumber;
    }

    public void setDocumentSerialNumber(String documentSerialNumber) {
        this.documentSerialNumber = documentSerialNumber;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentNumber='" + documentNumber + '\'' +
                ", documentSerialNumber='" + documentSerialNumber + '\'' +
                ", documentType=" + documentType +
                ", issueDate=" + issueDate +
                ", issuedBy='" + issuedBy + '\'' +
                ", subdivisionCode='" + subdivisionCode + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (documentType != document.documentType) return false;
        if (documentNumber != null ? !documentNumber.equals(document.documentNumber) : document.documentNumber != null)
            return false;
        if (documentSerialNumber != null ? !documentSerialNumber.equals(document.documentSerialNumber) : document.documentSerialNumber != null)
            return false;
        if (issueDate != null ? !issueDate.equals(document.issueDate) : document.issueDate != null) return false;
        if (issuedBy != null ? !issuedBy.equals(document.issuedBy) : document.issuedBy != null) return false;
        return subdivisionCode != null ? subdivisionCode.equals(document.subdivisionCode) : document.subdivisionCode == null;
    }

    @Override
    public int hashCode() {
        int result = documentNumber != null ? documentNumber.hashCode() : 0;
        result = 31 * result + (documentSerialNumber != null ? documentSerialNumber.hashCode() : 0);
        result = 31 * result + documentType;
        result = 31 * result + (issueDate != null ? issueDate.hashCode() : 0);
        result = 31 * result + (issuedBy != null ? issuedBy.hashCode() : 0);
        result = 31 * result + (subdivisionCode != null ? subdivisionCode.hashCode() : 0);
        return result;
    }
}
