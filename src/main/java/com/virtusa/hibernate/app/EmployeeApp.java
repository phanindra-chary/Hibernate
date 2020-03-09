package com.virtusa.hibernate.app;

import com.virtusa.hibernate.dao.EmployeeDAO;
import com.virtusa.hibernate.model.Employee;

public class EmployeeApp {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmpId(1);
		employee.setFirstName("Phanindra");
		employee.setLastName("Sheksha");
		employee.setSalary(5.2);
		
		Employee employee1=new Employee();
		employee1.setEmpId(4);
		employee1.setFirstName("Vishal");
		employee1.setLastName("Yash");
		employee1.setSalary(8.0);
		EmployeeDAO employeeDAO=new EmployeeDAO();
		//employeeDAO.saveEmployee(employee);
		//employeeDAO.saveEmployee(employee1);
		employeeDAO.updateEmployee(employee1);
		employeeDAO.updateEmployee(employee);
		/*Employee employee2=new Employee();
		employee2.setEmpId(3);
		employee2.setFirstName("Vishal");
		employee2.setLastName("phani");
		employee2.setSalary(4.0);
		employeeDAO.updateEmployee(employee1);*/
		
		
	}
	

		
	
}
