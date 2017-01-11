package com.bootexample.fetchr.controller;

import static org.junit.Assert.assertFalse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestService 
{
	@RequestMapping(value="/hello", method= RequestMethod.GET)
	public String hello(@RequestParam(value= "name", required=false) String name)
	{
		if ((name == null) || (name.isEmpty()))
		{
			return "Hello World, NO NAME";
		}
		else
			
			return "hello world " + name;
	}
}
