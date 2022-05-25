package com.company;

public class Record {

    private String name;
    private int idNumber;
    private int contactNumber;

    public Record(){
    }

    public Record(String name, int idNumber, int contactNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
