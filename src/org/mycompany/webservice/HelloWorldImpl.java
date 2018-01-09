package org.mycompany.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="org.mycompany.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String helloWorld(String name) {
		return "Hello World from "+name;
	}

}
