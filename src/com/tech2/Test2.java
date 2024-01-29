package com.tech2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean2.xml");
		Student ss1= (Student) ctx.getBean("sss1");
		
		System.out.println(ss1);

	}

}
