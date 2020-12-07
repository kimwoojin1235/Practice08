package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">> ");
    		String calc = sc.nextLine();
    		
    		String[] cArray = calc.split("");
    		
    		if(calc.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}else if(cArray[1].equals("+")) {
    			Add add = new Add();
    			add.setValue(Integer.parseInt(cArray[0]), Integer.parseInt(cArray[2]));
    			System.out.println(">> " +add.calculate());
    		}else if(cArray[1].equals("-")) {
    			Sub sub = new Sub();
    			sub.setValue(Integer.parseInt(cArray[0]), Integer.parseInt(cArray[2]));
    			System.out.println(">> " +sub.calculate());
    		}else if(cArray[1].equals("*")) {
    			Mul mul = new Mul();
    			mul.setValue(Integer.parseInt(cArray[0]), Integer.parseInt(cArray[2]));
    			System.out.println(">> " +mul.calculate());
    		}else if(cArray[1].equals("/")) {
    			Div div = new Div();
    			div.setValue(Integer.parseInt(cArray[0]), Integer.parseInt(cArray[2]));
    			System.out.println(">> " +div.calculate());
    		}else {
    			System.out.println("알 수 없는 연산입니다.");
    		}		
    		
    	}
    	
    	sc.close();
    	
    }
}
