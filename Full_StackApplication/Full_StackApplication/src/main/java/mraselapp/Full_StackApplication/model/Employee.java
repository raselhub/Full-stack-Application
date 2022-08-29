package mraselapp.Full_StackApplication.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable =false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable =false)
    private String employeeCode;

    public Employee() {

    }


    public Employee(Long id, String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Employee id(Long id) {
        setId(id);
        return this;
    }

    public Employee name(String name) {
        setName(name);
        return this;
    }

    public Employee email(String email) {
        setEmail(email);
        return this;
    }

    public Employee jobTitle(String jobTitle) {
        setJobTitle(jobTitle);
        return this;
    }

    public Employee phone(String phone) {
        setPhone(phone);
        return this;
    }

    public Employee imageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    public Employee employeeCode(String employeeCode) {
        setEmployeeCode(employeeCode);
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Employee)) {
    //         return false;
    //     }
    //     Employee employee = (Employee) o;
    //     return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(email, employee.email) && Objects.equals(jobTitle, employee.jobTitle) && Objects.equals(phone, employee.phone) && Objects.equals(imageUrl, employee.imageUrl) && Objects.equals(employeeCode, employee.employeeCode);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(id, name, email, jobTitle, phone, imageUrl, employeeCode);
    // }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", jobTitle='" + getJobTitle() + "'" +
            ", phone='" + getPhone() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            ", employeeCode='" + getEmployeeCode() + "'" +
            "}";
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    



}
