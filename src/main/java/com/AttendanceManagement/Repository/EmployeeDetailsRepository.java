package com.AttendanceManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AttendanceManagement.Model.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Long> {

	Optional<EmployeeDetails> findById(int id);
    // You can define additional methods if required

	EmployeeDetails findByName(String name);

	void deleteById(int id);
}
