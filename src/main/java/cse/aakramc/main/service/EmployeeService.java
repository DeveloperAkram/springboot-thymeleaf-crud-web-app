package cse.aakramc.main.service;

import java.util.List;

import cse.aakramc.main.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees ();
	void saveEmployee (Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);

}