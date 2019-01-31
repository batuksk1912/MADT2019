package com.lambton;

public class Student extends Person {

    private String courseName;
    private String result;

    public Student() {
        super();
        this.courseName = null;
        this.result = null;
    }

    public Student(int id, String firstName, String gender, String lastName, String city, String courseName, String result) {
        super(id, firstName, gender, lastName, city);
        this.courseName = courseName;
        this.result = result;
    }

    public Student(Student student) {
        this.courseName = student.courseName;
        this.result = student.result;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + getId() + '\'' +
                "First Name='" + getFirstName() + '\'' +
                "Gender='" + getGender() + '\'' +
                "Last Name='" + getLastName() + '\'' +
                "City='" + getCity() + '\'' + '\'' +
                "courseName='" + courseName + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
