package com.example.test;


import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    private String name;

    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
