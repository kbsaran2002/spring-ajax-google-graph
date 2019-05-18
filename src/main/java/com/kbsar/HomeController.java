package com.kbsar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String callHome() {
		
		System.out.println("calling home page");
		return "HomePage.jsp";
		
	}
	
	@RequestMapping("graph")
	public String callGraph() {
		
		System.out.println("calling graph page");
		return "Graph.jsp";
		
	}
	
	@RequestMapping("fromcsv")
	public String callCSV() {
		
		System.out.println("calling csv graph page");
		return "index.html";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
