package com.CJCakpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CJCakpro.model.Student1;
import com.CJCakpro.service.CJCakproServiceI;

@RestController
public class homecontroller {

	@Autowired
	CJCakproServiceI cs;

	//get data - yogita1
	@GetMapping("/getProduce/{addr}")
	public List getStudent(@PathVariable("addr") String addr)
	{
		System.out.println("inside get");
		      List l= cs.getData(addr); 
		      return l;
	}
	
	@PostMapping("/postProduce")
	public String postData(@RequestBody Student1 s)
	{
		      cs.postData(s); 
		      return "updated";
	}
	@PutMapping("/putProduct")
	public String putData(@RequestBody Student1 s)
	{
		      cs.postData(s); 
		      return "updates put";
	}
	
	@DeleteMapping("/deleteProduce/{rollno}")
	public String putData(@PathVariable int rollno)
	{
		      cs.deleteData(rollno); 
		      return "updates put";
	}
	
}
