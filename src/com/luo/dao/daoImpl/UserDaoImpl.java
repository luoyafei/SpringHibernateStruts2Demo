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
	
	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}
	@Override
	public void getUserAll() {
	}

}
