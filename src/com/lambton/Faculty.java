package com.lambton;

public class Faculty extends Person {

    private String designation;
    private String specialization;
    private float  salary;

    public Faculty() {
        super();
        this.designation = null;
        this.specialization = null;
        this.salary = 0.0f;
    }

    public Faculty(int id, String firstName, String gender, String lastName, String city, String designation, String specialization, float salary) {
        super(id, firstName, gender, lastName, city);
        this.designation = designation;
        this.specialization = specialization;
        this.salary = salary;
    }

    public Faculty(Faculty faculty) {
        this.designation = faculty.designation;
        this.specialization = faculty.specialization;
        this.salary = faculty.salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "ID='" + getId() + '\'' +
                "First Name='" + getFirstName() + '\'' +
                "Gender='" + getGender() + '\'' +
                "Last Name='" + getLastName() + '\'' +
                "City='" + getCity() + '\'' + '\'' +
                "designation='" + designation + '\'' +
                ", specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
