package com.nagarro.jitendra.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculateController {
	@RequestMapping(value="/calculate")
	public ModelAndView calculateNumber(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv=new ModelAndView();
//		int a=Integer.parseInt(request.getParameter("first"));
//		int b=Integer.parseInt(request.getParameter("second"));
		BigDecimal first=new BigDecimal(request.getParameter("first"));
		BigDecimal second=new BigDecimal(request.getParameter("second"));
		String operator=request.getParameter("operator");
		
		double result=CalculatorService.calculate(first, second, operator);
		
		mv.addObject("result", result);
		mv.setViewName("result");
		
		return mv;
	}
}
