package cs.dao;

import org.hibernate.SessionFactory;

/**
 * Management User and DataBase
 * @author olife
 */
public class DAO
{	
	private SessionFactory mySessionFactory;
	public SessionFactory getMySessionFactory() {
		return mySessionFactory;
	}
	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.mySessionFactory = mySessionFactory;
	}
}
