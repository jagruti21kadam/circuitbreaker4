package com.example.springbreaker.controller;

import com.example.springbreaker.model.Employee;
import com.example.springbreaker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class BreakerController {

    @Autowired
    private EmployeeService employeeService;

    // Fetch all employees
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    // Add new employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
