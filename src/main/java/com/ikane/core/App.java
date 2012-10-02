package com.ikane.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
        
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloBean");
    	
    	helloWorld.printHello();
    }
}
