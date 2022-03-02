package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//@ContextConfiguration("classpath:spring-aop.xml")
//@ContextConfiguration("classpath:spring-aop2.xml")
@ContextConfiguration("classpath:spring-aop3.xml")
public class TestUserServiceImpl {

    @Autowired
    private UserService us;

    @Autowired
    private ApplicationContext context;

    @Test
    public void testAdd(){
        us.add();

        context.getBeanDefinitionNames();
    }
}
