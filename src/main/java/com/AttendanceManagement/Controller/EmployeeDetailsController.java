package com.AttendanceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendanceManagement.Model.EmployeeDetails;
import com.AttendanceManagement.Service.EmployeeDetailsService;

import java.util.List;
@RestController
@RequestMapping("/emp")
public class EmployeeDetailsController {

    @Autowired
    private EmployeeDetailsService employeedetailsservice;

    @PostMapping("/add")
    public EmployeeDetails addProduct(@RequestBody EmployeeDetails EmployeeDetails) {
        return employeedetailsservice.saveEmployeeDetails(EmployeeDetails);
    }


    @GetMapping("/{id}")
    public EmployeeDetails findById(@PathVariable int id) {
        return employeedetailsservice.getById(id);
    }

    @GetMapping("/{name}")
    public EmployeeDetails findEmployeeByName(@PathVariable String name) {
        return employeedetailsservice.getEmployeeByName(name);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeDetails(@PathVariable int id) {
        return employeedetailsservice.deleteEmployeeDetails(id);
    }
}