package com.demo.TestService.service;

import com.demo.TestService.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TestService {

    Map<Integer,Employee> employees = new HashMap<>();

    public Map<Integer, Employee> getEmployeeData(){
        employees.put(1001,new Employee(1001,"Sandeep"));
        employees.put(1002,new Employee(1002,"Test"));
        return employees;
    }

    public String createEmployee(Employee employee) {
        System.out.println(employee.getId());
        employees.put(employee.getId(),employee);
        return "success";
    }

    public String updateEmployee(Employee employee) {
        employees.put(employee.getId(),employee);
        return "updated";
    }

    public String deleteEmployee(Integer employeeId) {
        employees.remove(employeeId);
        return "Deleted";
    }
}
