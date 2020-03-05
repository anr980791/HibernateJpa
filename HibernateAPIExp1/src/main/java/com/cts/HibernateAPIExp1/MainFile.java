package com.cts.HibernateAPIExp1;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainFile { 
	public static void main(String[] args) {    
	        
		/*
		 * StandardServiceRegistry ssr = new
		 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		 *SessionFactory factory = meta.getSessionFactoryBuilder().build(); */
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sessionFactory=conf.buildSessionFactory();
	Session session = sessionFactory.openSession();  
	  
	            
	    Employee e1=new Employee();    
	    e1.setId(102);    
	    e1.setFirstName("Karan");    
	    e1.setLastName("Chawla");    
	        
	    session.save(e1);  
	    
	    Transaction t = session.beginTransaction(); 
	    t.commit();  
	    System.out.println("successfully saved");    
	   sessionFactory.close();  
	    session.close();    
	        
	}

}
