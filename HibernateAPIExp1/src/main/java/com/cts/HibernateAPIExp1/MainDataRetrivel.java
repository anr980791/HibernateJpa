package com.cts.HibernateAPIExp1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDataRetrivel {
	
	public static void main(String[] args){
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		

		for(int i=1;i<3;i++)
		{
		Employee emp=(Employee)session.load(Employee.class, 100+i);
		System.out.println(emp);
		}

}
}
