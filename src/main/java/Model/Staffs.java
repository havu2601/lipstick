package Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Staffs {
    private int id;
    private String name;
    private String genter;
    private Date dob;
    private String phonenumber;
    private String email;
    private String address;
    private String cccd;
    private String status;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "genter")
    public String getGenter() {
        return genter;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }

    @Basic
    @Column(name = "dob")
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "cccd")
    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staffs staffs = (Staffs) o;

        if (id != staffs.id) return false;
        if (name != null ? !name.equals(staffs.name) : staffs.name != null) return false;
        if (genter != null ? !genter.equals(staffs.genter) : staffs.genter != null) return false;
        if (dob != null ? !dob.equals(staffs.dob) : staffs.dob != null) return false;
        if (phonenumber != null ? !phonenumber.equals(staffs.phonenumber) : staffs.phonenumber != null) return false;
        if (email != null ? !email.equals(staffs.email) : staffs.email != null) return false;
        if (address != null ? !address.equals(staffs.address) : staffs.address != null) return false;
        if (cccd != null ? !cccd.equals(staffs.cccd) : staffs.cccd != null) return false;
        if (status != null ? !status.equals(staffs.status) : staffs.status != null) return false;
        if (createdDate != null ? !createdDate.equals(staffs.createdDate) : staffs.createdDate != null) return false;
        if (updatedDate != null ? !updatedDate.equals(staffs.updatedDate) : staffs.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (genter != null ? genter.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (phonenumber != null ? phonenumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (cccd != null ? cccd.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
