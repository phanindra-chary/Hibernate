package com.virtusa.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

import com.virtusa.hibernate.model.Employee;

public class EmployeeDAO {

	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	public void saveEmployee(Employee employee){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();

	}
	
	public void updateEmployee(Employee employee) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(employee);
		transaction.commit();
		session.close();
		
	}
}
