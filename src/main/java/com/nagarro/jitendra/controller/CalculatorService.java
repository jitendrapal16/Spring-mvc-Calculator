package com.nagarro.jitendra.controller;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalculatorService {
	public static double calculate(BigDecimal firstNumber, BigDecimal secondNumber, String operator) {
		switch(operator.charAt(0)) {
			case 'A':
				return firstNumber.add(secondNumber).doubleValue();
			case 'S':
				return firstNumber.subtract(secondNumber).doubleValue();
			case 'D':
				return firstNumber.divide(secondNumber,new MathContext(5)).doubleValue();
			case 'M':
				return firstNumber.multiply(secondNumber).doubleValue();
			default:
				return 0.0;
		}
		//return 0.0;
	}
}
