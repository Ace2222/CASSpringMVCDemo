package com.lz.cas.controller;

import javax.servlet.http.HttpServletRequest;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request, Model model) {
		
		AttributePrincipal principal = (AttributePrincipal) request.getUserPrincipal();
		
		request.setAttribute("attributes", principal.getAttributes());
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, Model model) {
		
		return "redirect:https://test.nomalis.com:8443/cas/logout?service="
				+ "https://test.nomalis.com:8443/cas/login";//service=后面跟的是退出登录后跳转的地址，现在跳转到登录界面
	}

}
