package com.capg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.model.Employee2;

@SpringBootApplication
public class Employee3Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object obj = context.getBean("emp2");
		Employee2 employee = (Employee2) obj;
		System.out.println(employee);
	}

}
