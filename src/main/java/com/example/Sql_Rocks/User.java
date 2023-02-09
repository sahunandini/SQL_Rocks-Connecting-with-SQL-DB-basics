package com.example.Sql_Rocks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // So hibernate can identify whose attributes to pick for table creation
@Table(name = "user_info") // This is just for the giving table name , by default : tableName === className
public class User {

    @Id // It is written on that attributes which has to become the primary key
    @Column(unique = true)
    private int id; // id is the primary key :

    @Column(unique = true)
    private String email;

    private String name;

    private String age;

    private String mobNo;

    @Column(name = "country_name")
    private String country;

    // always create the default constructor
    public User () {

    }

    // good practice is to create all args constructor
    public User(int id, String name, String age, String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    // creating getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
