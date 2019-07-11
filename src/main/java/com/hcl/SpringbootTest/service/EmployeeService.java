package com.hcl.SpringbootTest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.SpringbootTest.entity.Employee;
import com.hcl.SpringbootTest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void registeremployee(Employee employee) {
		
		employeeRepository.save(employee);
		
	}

	public Optional<Employee> getEmployee(Long id) {
		// TODO Auto-generated method stub
		
		return employeeRepository.findById(id);
		
	}

	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		
		 employeeRepository.deleteById(id);;
	}

	public void updateEmployee(Long id,Employee employee) {
		// TODO Auto-generated method stub
		Employee employee1=employeeRepository.findById(id).get();
		employee1.setEmployeeName(employee.getEmployeeName());
		employee1.setEmployeeSurname(employee.getEmployeeSurname());
		employee1.setAge(employee.getAge());
		
		employeeRepository.save(employee1);
	//	Optional<Employee> employee=employeeRepository.findById(id);
				
		
		
	}

	/*
	 * public void getEmployeeByQuery() { // TODO Auto-generated method stub
	 * employeeRepository }
	 */

}
