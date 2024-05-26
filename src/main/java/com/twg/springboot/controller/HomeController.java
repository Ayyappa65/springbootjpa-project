package com.twg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.twg.springboot.entity.Employee;
import com.twg.springboot.service.EmployeeService;

//if you use @RestController annotation it did not support jsp views ,so that we are using @Controller annotation 
@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String insertEmployee(Model model) {
		
		Employee employee = new Employee();
		employee.setName("kishore");
		employee.setDesignation("Mnager");
		employee.setExp(30);
		employee.setDepartment("Accounts");
		
		Employee emp = employeeService.saveEmployee(employee);
		
		String msg =  "Employee" +emp.getName()+" with id "+emp.getId()+" is saved successfully";
		
		model.addAttribute("employee", emp);
		model.addAttribute("message", msg);
		return "home";
		
	}

}
