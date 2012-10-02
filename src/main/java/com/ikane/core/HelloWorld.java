/**
 * 
 */
package com.ikane.core;

/**
 * Spring BEAN
 * 
 * @author IKANE
 *
 */
public class HelloWorld {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Spring 3: hello ! " + name);
	}
}
