package edu.kh.variable.ex2;

import java.util.Scanner;

//import java.util.Scanner; 


public class ScannerExample {

	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		
		// Scaneer 생성
		//--> 프로그램 안에 스캐너라는 기계를 만든 것
		Scanner sc = new Scanner(System.in);
		// import 먼저 해야 함 (안하면 오류!)
		
		System.out.print("값을 입력하시오: ");
		int input1 = sc.nextInt(); //입력받은 정수를 변수 input1에 대입
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		System.out.println("입력하신 값은 "+ input1 + "입니다." );

		System.out.print("실수만 입력하시오: ");
		double input2 = sc.nextDouble(); //입력받은 정수를 변수 input2에 대입
		// nextDouble() : 다음 입력된 실수를 읽어옴 
		System.out.println("입력하신 값은 "+ input2 + "입니다." );
		
		System.out.print("입력1: ");
		String input3 = sc.next(); //입력받은 정수를 변수 input3에 대입
		// next() : 다음 입력된 한 단어를 읽어옴
		System.out.println("입력하신 문자는 "+ input3 + "입니다." );
		
		System.out.print("입력2: ");
		String input4 = sc.next(); //입력받은 정수를 변수 input4에 대입
		// next() : 다음 입력된 한 단어를 읽어옴
		System.out.println("입력하신 문자는 "+ input4 + "입니다." ); 
		
		System.out.print("입력1: ");
		String input5 = sc.next(); //입력받은 정수를 변수 input5에 대입
		// next() : 다음 입력된 한 단어를 읽어옴
		
		System.out.print("입력2: ");
		String input6 = sc.next(); //입력받은 정수를 변수 input6에 대입
		// next() : 다음 입력된 한 단어를 읽어옴
		System.out.println(input5 + " " + input6); 
		
		System.out.print("입력3: ");
		String input7 = sc.nextLine( ); //입력받은 정수를 변수 input1에 대입
		// next() : 다음 입력된 한 단어를 읽어옴
		System.out.println(input7);
	
	
		
		
	}

	
}
