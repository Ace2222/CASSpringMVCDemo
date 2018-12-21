package com.lz.cas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
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
	public String logout(HttpServletRequest request, HttpSession session) {

		session.removeAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);

		return "redirect:https://test.nomalis.com:8443/cas/logout?service="
				+ "http://localhost:8080/CASSpringMVCDemo";// service=后面跟的是退出登录后要跳转的页面
	}

}
