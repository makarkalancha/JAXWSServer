package org.mycompany.webservice;

import javax.xml.ws.Endpoint;

public class HelloWorldWSPublisher {
	//http://localhost:8080/WS/HelloWorld?wsdl
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/HelloWorld", new HelloWorldImpl());
	}
}
