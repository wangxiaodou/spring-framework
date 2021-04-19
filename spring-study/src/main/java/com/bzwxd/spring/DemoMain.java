package com.bzwxd.spring;

import com.bzwxd.spring.bean.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

  public static void main(String[] args) {

	  ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-demo.xml");

	  Teacher teacher = (Teacher) applicationContext.getBean("teacher");
      System.out.printf("teacher = {}",teacher);
  }
}
