package com.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserDao;
import com.boot.domain.User;
import com.boot.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired  
	private UserDao userDao;  
	
	@Override
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);  
	}

}
