package com.demo.TestService.controller;

import com.demo.TestService.dto.Employee;
import com.demo.TestService.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    TestService service;

    @GetMapping("/employee")
    public List<Employee> getEmpData(){
        return service.getEmployeeData().values().stream().collect(Collectors.toList());
    }

    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee){
        return service.createEmployee(employee);
    }
    @PutMapping("/employee")
    public String updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployee(@PathVariable Integer employeeId){
        return service.deleteEmployee(employeeId);
    }

}
