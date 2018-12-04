package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.boot.domain.User;
@Mapper
public interface UserDao {  
    public User selectUserById(Integer userId);  
  
}  
