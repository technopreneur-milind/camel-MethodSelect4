package com.example.JavaFileCopier;

import org.apache.camel.Handler;

public class MyBean {

	public String test(String name) {
		String result = "Hello " + name;
		System.out.println(result);
		return result;
	}

	
	public String test2(Integer value) {
		System.out.println("Hello2 "+value);
		return "Hello";
	}

}
