package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Supplier {
@Id
    private Long supplierId;
    private String name;
    private String contactPerson;
    private String contactNumber;
    private String email;
    private String address;
    protected Supplier(){}
       private Supplier (Builder builder){

        this.supplierId=builder.supplierId;
        this.name=builder.name;
        this.contactNumber=builder.contactNumber;
        this.contactPerson=builder.contactPerson;
        this.email=builder.email;
        this.address=builder.address;

    }


    public Long getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier supplier)) return false;
        return supplierId == supplier.supplierId && Objects.equals(name, supplier.name) && Objects.equals(contactPerson, supplier.contactPerson) && Objects.equals(contactNumber, supplier.contactNumber) && Objects.equals(email, supplier.email) && Objects.equals(address, supplier.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, name, contactPerson, contactNumber, email, address);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static class Builder{

        private Long supplierId;
        private String name;
        private String contactPerson;
        private String contactNumber;
        private String email;
        private String address;

        public Builder setSupplierId(Long supplierId) {
            this.supplierId = supplierId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;        }

        public Builder setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;}

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;  }

        public Builder setEmail(String email) {
            this.email = email;
            return this;  }

        public Builder setAddress(String address) {
            this.address = address;
            return this; }

        public Builder copy(Supplier supplier){

            this.supplierId=supplier.supplierId;
            this.name=supplier.name;
            this.contactNumber=supplier.contactNumber;
            this.contactPerson=supplier.contactPerson;
            this.email=supplier.email;
            this.address=supplier.address;
            return this;
        }
        public Supplier build(){
            return new Supplier(this);
        }

        }
}
