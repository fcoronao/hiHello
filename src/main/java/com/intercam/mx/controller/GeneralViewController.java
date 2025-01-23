package com.intercam.mx.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcoronao
 *
 */
@RestController
public class GeneralViewController {
	
	private static final Logger log = Logger.getLogger(GeneralViewController.class);

	@GetMapping("/hola")
	public String respuestas() {	
		
		String response = "A huevo perro!!";
		
		return response;
	}
	
}
