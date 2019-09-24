package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person
{
    private int id;
    private String FirstName;
    private String LastName;
    private Date birthDate;
    private String gender;

    public Person(int id)
    {
        this.id = id;
    }

    public Person(int id, String firstName, String lastName, LocalDate birthDate, String gender) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        birthDate = birthDate;
        this.gender = gender;
    }

    public int getId()
    {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Date getbirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setbirthDate(Date birthdate) {
        birthDate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract void display();
 public void print()
 {
     System.out.println("print() from student");
 }
}
