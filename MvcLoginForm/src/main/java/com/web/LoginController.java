package com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController {
	@RequestMapping("/login")
	
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("login Controller");
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
        if(username.length()==0 || username=="") {
        	return new ModelAndView("welcome", "message", "Invalid username and password");
        }
        else if(username.equals("ashish") && password.equals("ashish")){
        	return new ModelAndView("successPage", "message", "welcome user");
	
        }
        else {
        	return new ModelAndView("errorPage", "message", "Index page");
	}
	}
}
