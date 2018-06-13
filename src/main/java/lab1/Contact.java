package lab1;

import java.io.Serializable;

public class Contact implements Serializable {
    private String contactType;
    private String contactValue;

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactType='" + contactType + '\'' +
                ", contactValue='" + contactValue + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (contactType != null ? !contactType.equals(contact.contactType) : contact.contactType != null) return false;
        return contactValue != null ? contactValue.equals(contact.contactValue) : contact.contactValue == null;
    }

    @Override
    public int hashCode() {
        int result = contactType != null ? contactType.hashCode() : 0;
        result = 31 * result + (contactValue != null ? contactValue.hashCode() : 0);
        return result;
    }
}
