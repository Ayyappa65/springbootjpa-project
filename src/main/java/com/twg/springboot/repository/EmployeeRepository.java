package com.twg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springboot.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
