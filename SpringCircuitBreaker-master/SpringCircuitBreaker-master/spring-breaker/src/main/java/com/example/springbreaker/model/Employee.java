package com.example.springbreaker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
   // Account application for storing employee name and department 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String department;

    // Constructors
    public Employee() {}

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
