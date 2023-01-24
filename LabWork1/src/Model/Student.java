/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nishipancholi
 */
public class Student {
    private int nuid;
    private String firstName;
    private String lastName;
    private String collegeName;
    Contact officeContact;
    Contact personalContact;
    Address localAddress;
    Address permanentAddress;
    
    public Student(){
        this.nuid=000000;
        this.firstName="";
        this.lastName="";
        this.collegeName="";
        this.officeContact= new Contact();
        this.personalContact= new Contact();
        this.localAddress=new Address();
        this.permanentAddress= new Address();
    }

    public int getNuid() {
        return nuid;
    }

    public void setNuid(int nuid) {
        this.nuid = nuid;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Address getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(Address localAddress) {
        this.localAddress = localAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
}
