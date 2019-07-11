package com.hcl.SpringbootTest.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.SpringbootTest.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/*
	 * void findAllUsers(Sort sort);
	 */
}
