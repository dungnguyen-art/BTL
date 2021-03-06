package qlns.service;

import java.util.List;

import qlns.model.Employee;

public interface EmployeeService {
	 Employee getEmployeeById(long id);
	 List<Employee> getAllEmployees();
	 void saveEmployee(Employee employee);
	 void deleteEmployeeById(long id);
}
