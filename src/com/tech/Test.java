package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");
		
		Student s11= (Student) ctx.getBean("s1");
		System.out.println(s11);
		
		Student s12=(Student) ctx.getBean("s2");
		System.out.println(s12);
		
		Student s13=(Student) ctx.getBean("s3");
		System.out.println(s13);

	}

}
