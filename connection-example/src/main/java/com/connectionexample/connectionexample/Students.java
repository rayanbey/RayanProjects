package com.connectionexample.connectionexample;


import javax.persistence.*;

@Entity
@Table(name="Students",catalog = "school")
public class Students {
    @Id
    private Integer id;
    @Column(name="Studentname")
    private String name;
    @Column(name="Studentgrade")
    private String grade;


    public Students() {

    }

    public Students(Integer id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
