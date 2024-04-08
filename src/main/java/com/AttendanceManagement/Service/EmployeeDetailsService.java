package com.AttendanceManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.EmployeeDetails;
import com.AttendanceManagement.Repository.EmployeeDetailsRepository;


@Service
public class EmployeeDetailsService {
    @Autowired
    private EmployeeDetailsRepository employeedetailsrepository;

    public EmployeeDetails saveEmployeeDetails(EmployeeDetails EmployeeDetails) {
        return employeedetailsrepository.save(EmployeeDetails);
    }


    public EmployeeDetails getById(int id) {
        return employeedetailsrepository.findById(id).orElse(null);
    }

    public EmployeeDetails getEmployeeByName(String name) {
        return employeedetailsrepository.findByName(name);
    }

    public String deleteEmployeeDetails(int id) {
        employeedetailsrepository.deleteById(id);
        return "removed !! " + id;
    }


	
}
