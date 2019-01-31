package com.lambton;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String city;

    public Person() {
        this.id = -1;
        this.firstName = null;
        this.gender = null;
        this.lastName = null;
        this.city = null;
    }

    public Person(int id, String firstName, String gender, String lastName, String city) {
        this.id = id;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.city = city;
    }

    public Person(Person person) {
        this.id = person.id;
        this.firstName = person.firstName;
        this.gender = person.gender;
        this.lastName = person.lastName;
        this.city = person.city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
