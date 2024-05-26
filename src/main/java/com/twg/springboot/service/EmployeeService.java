package com.twg.springboot.service;

import java.util.List;

import com.twg.springboot.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findById(long id);
	public List<Employee> findAll();

}
