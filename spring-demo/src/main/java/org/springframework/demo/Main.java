package org.springframework.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.demo.service.AService;

/**
 * @description TODO
 * @classname ${NAME}
 * @date ${DATE} ${TIME}
 * @author: Ivan
 */
public class Main {

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		// 		"org.springframework.demo.service");
		// AService aService = (AService)context.getBean("AService");
		// aService.printA();
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

	}
}