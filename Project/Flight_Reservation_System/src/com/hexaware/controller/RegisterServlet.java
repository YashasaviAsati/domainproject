package com.hexaware.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post Called!!!!!!!");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		//Double phone = (Double)Double.parseDouble(request.getParameter("phone"));
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		System.out.println(dob);
		System.out.println(gender + email + phone +" "+ password + name);
	}

}
