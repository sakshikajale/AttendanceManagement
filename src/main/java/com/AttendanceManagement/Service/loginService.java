package com.AttendanceManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AttendanceManagement.Model.Emp;
import com.AttendanceManagement.Repository.loginRepository;

@Service
public class loginService {

    @Autowired
    private loginRepository loginRepository;

    //register
    public Emp registerEmp(Emp emp) {
     return loginRepository.save(emp);
    }
    
    //login

    public boolean authenticateEmp(String email, String password) {
        Emp emp = loginRepository.findByEmail(email);
        return emp != null && emp.getPassword().equals(password);
    }
}
