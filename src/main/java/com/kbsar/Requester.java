package com.kbsar;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Requester {
	
	@RequestMapping("getcar")
	public List<Car> get(){
		
		System.out.println("getting cars .....");
		
		Car c1 = new Car();
		c1.Name = "Octavia";
		c1.Make = "Skoda";
		
		Car c2 = new Car();
		c2.Name = "I20";
		c2.Make = "Hyundai";
		
		List<Car> l1 = new ArrayList<>();
		l1.add(c1);
		l1.add(c2);
		
		return l1;
		
		
		
	}
	
	

}
