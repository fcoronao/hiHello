package com.intercam.mx;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService(serviceName = "hi-world")
public class ConstaciasFideicomisosWs {

	private static final Logger log = Logger.getLogger(ConstaciasFideicomisosWs.class);

	
	
	@WebMethod
	public String hola(
			)
			throws IOException {
		
		String response = "Hola mundo";
				
		return response;	
	}
	
	
	
}