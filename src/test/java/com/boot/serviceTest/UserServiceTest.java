package com.boot.serviceTest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.boot.baseTest.SpringTestCase;
import com.boot.domain.User;
import com.boot.service.UserService;

public class UserServiceTest extends SpringTestCase{
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired  
    private UserService userService; 
	@Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10);  
        logger.info("查找结果" + user);  
    }  

}
