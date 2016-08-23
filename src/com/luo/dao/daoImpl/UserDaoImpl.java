package com.luo.dao.daoImpl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.luo.bean.User;
import com.luo.dao.UserDao;

@Component(value="ud")
public class UserDaoImpl implements UserDao {

	/**
	 * @author Diamond
	 * 使用HibernateTemplate
	 */
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
/*	
 * 由于在hibernateTemplate的bean中已经注入了SessionFactory,这里就不用注入了
 * private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	*/
	/*public DataSource getDataSource() {
		return dataSource;
	}

	@Resource(name="dataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
*/
	@Override
	public void save(User user) {
		
		user.setName("王麻子6");
		hibernateTemplate.save(user);
		
		
		/*Session session = sessionFactory.getCurrentSession();
	
		user.setName("王麻子5");
		session.save(user);

		throw new HibernateException("error");*/
		//System.out.println("I am saved!");
	}
	@Override
	public void getUserAll() {
		// TODO Auto-generated method stub
		/*Session session = sessionFactory.getCurrentSession();
		String hql = "from User u";
		List<User> us = session.createQuery(hql).list();
		System.out.println(us.size());*/
		
	}

}
