package com.example.usersignupappusingfirebase;

public class Holder
{
    String name, email, course, profileimage;

    public Holder(String name, String email, String course, String profileimage)
    {
        this.name = name;
        this.email = email;
        this.course = course;
        this.profileimage = profileimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getProfileimage() {
        return profileimage;
    }

    public void setProfileimage(String profileimage) {
        this.profileimage = profileimage;
    }
}
