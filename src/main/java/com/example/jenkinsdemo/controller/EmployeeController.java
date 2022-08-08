package com.example.jenkinsdemo.controller;

import com.example.jenkinsdemo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/{id}")
    public Employee getEmployees(@PathVariable String id){
        Employee employee = new Employee("biniam","12",33);
        return employee;
    }
}
