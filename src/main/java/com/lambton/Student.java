package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person
{
     private String coursename;
    private int currentSemester;





    public Student(int id)
    {
        super(id);

    }

    public Student(int id, String firstName, String lastName, LocalDate birthDate, String gender, String coursename, int currentSemester)
    {
        super(id, firstName, lastName, birthDate, gender);
        this.coursename = coursename;
        this.currentSemester = currentSemester;
    }

    public String getCoursename() {
        return coursename;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCoursename(String courseame) {
        this.coursename = courseame;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    @Override
    public void display(){

        System.out.println("Student ID : " + getId());
        System.out.println("Student FirstName : " + getFirstName());
        System.out.println("Student LastName : " + getLastName());
        System.out.println("Student BirthDate : " + getbirthDate());
        System.out.println("Student Gender : " + getGender());
        System.out.println("Student courseName : " + this.coursename);
        System.out.println("Student currentSemester  : " + this.currentSemester);

    }
    }
