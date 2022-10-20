package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello World!");
		
	StandardCalculator calc = new StandardCalculator();

	calc.subtract(Double.MAX_VALUE, 1.0);

	calc.printResult();


	//StandardCalculator calc = new StandardCalculator();

	calc.subtract(Double.MAX_VALUE, -Double.MAX_VALUE);

	calc.printResult();

	}

	
	

}
