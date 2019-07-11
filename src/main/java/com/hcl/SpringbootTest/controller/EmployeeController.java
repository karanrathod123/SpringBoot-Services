package com.hcl.SpringbootTest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.SpringbootTest.entity.Employee;
import com.hcl.SpringbootTest.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/login")
	public String getEmplyee() {
		return "success";

	}

	@PostMapping("/register")
	public void registeremployee(@RequestBody Employee employee) {

		employeeService.registeremployee(employee);

	}

	@GetMapping("/{id}")
	public Optional<Employee> getEmployee(@PathVariable Long id) {

		return employeeService.getEmployee(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Long id) {

		employeeService.deleteEmployee(id);

	}

	@PutMapping("/update/{id}")
	public void updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {

		employeeService.updateEmployee(id, employee);

	}
	
	/*
	 * @GetMapping("/getEmployeeList") public void getEmployeeByQuery() {
	 * employeeService.getEmployeeByQuery(); }
	 */
	

}
