package edu.bit.ex;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Log4j
@RequestMapping("/security/*")
@Controller
public class securityController {
	
	   @GetMapping("/all")
	     public void doAll() {       
	       log.info("do all can access everybody");
	     }
	    
	     @GetMapping("/member")
	     public void doMember() {
	       
	       log.info("logined member");
	     }
	     
	     @GetMapping("/admin")
	     public void doAdmin() {
	       
	       log.info("admin only");
	     }
	   
	   
	}
	
	
	

