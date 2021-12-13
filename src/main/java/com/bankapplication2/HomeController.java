package com.bankapplication2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	   @RequestMapping("/home")
		public String home()
		{
			return "Hello Welcome to SBIBANK";
		}
	
	
		@RequestMapping("/contact")
		public String contact()
		{
			return "Hello contact to SBIBANK";
		}
	
	
		@RequestMapping("/about")
		public String about()
		{
			return "Hello about to SBIBANK";
		}
	
	
		@RequestMapping("/balance")
		public String balance()
		{
			return "balance to SBIBANK";
		}
	}
