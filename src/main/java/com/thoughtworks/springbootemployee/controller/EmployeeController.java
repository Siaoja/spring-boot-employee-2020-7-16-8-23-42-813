package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping
    public List<Employee> getAllEmployees(){
        List<Employee> employees = createNewEmployees();
        return employees;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        List<Employee> employees = createNewEmployees();
        for(Employee employee : employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }


    private List<Employee> createNewEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "alibaba1", 20, "male"));
        employees.add(new Employee(2, "tengxun2", 19, "female"));
        employees.add(new Employee(3, "alibaba3", 19, "male"));
        employees.add(new Employee(4, "alibaba4", 20, "male"));
        employees.add(new Employee(5, "tengxun5", 19, "female"));
        employees.add(new Employee(6, "alibaba6", 19, "male"));
        employees.add(new Employee(7, "alibaba7", 19, "male"));
        return employees;
    }
}
