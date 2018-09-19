package com.scp.hibernate.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernateApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Yogesh","Latur",10000);
		Employee e2 = new Employee(2,"Amit","Latur",15000);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.flush();
		tr.commit();
	}
	
}
