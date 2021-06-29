package exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Candidate candidate = new Candidate();
		candidate.setName("candidate1");
		candidate.setTotalPoints(3+3);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(candidate);
		
		session.getTransaction().commit();
		
		session.close();
		
		sessionFactory.close();
	}

}
