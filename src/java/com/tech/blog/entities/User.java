/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tech.blog.entities;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class User { 
    private int id; 
    private String name; 
    private String email; 
    private String passsword; 
    private String gender; 
    private Timestamp datetime;
    private String about; 

    public User(int id, String name, String email, String passsword, String gender, Timestamp datetime, String about) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passsword = passsword;
        this.gender = gender;
        this.datetime = datetime;
        this.about = about;
    }

    public User() {
    }

    public User(String name, String email, String passsword, String gender,  String about) {
        this.name = name;
        this.email = email;
        this.passsword = passsword;
        this.gender = gender;
       
        this.about = about;
    }
     
    //getters and setters 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
    
    
    
}
