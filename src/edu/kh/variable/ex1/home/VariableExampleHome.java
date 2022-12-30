package edu.kh.variable.ex1.home;

import java.util.Scanner;

public class VariableExampleHome {
	public static void main (String[] args) {
		
	/*	double pi = 3.141592653589793;
		int r = 5;
		int h = 20;
		
		System.out.println("원의 둘레: " + 2 * pi * r);
		System.out.println("원의 넓이: " + pi * r * r);
		System.out.println("원기둥의 부피: " + pi * r * r *h);
		System.out.println("구의 겉넓이: " + 4* pi * r * r);
		
		char ch = 80;
		System.out.println(ch);
		
		char ch1 = 'P';
		System.out.println(ch1);
		
		final int AGE = 26;
		System.out.println(AGE);
		
		//String str = "기차";
		//String str = new String("버스");
		//String str = "기차" + "칙칙폭폭";
		//String str = new String("기차" + "칙칙폭폭");
		//String str = "기차" + 123 + 45 + "출발";
		String str = 123 + 45 + "기차" + "출발";

		System.out.println(str);
		
		int num1 = 19;
		double num2 = 3.3;
		System.out.println(num1 + num2);
		
		int iNum = 10;
		
		System.out.printf("%d + %d = %d", iNum, iNum, iNum + iNum);
		System.out.println();
		System.out.printf("%5d\n", iNum);
		System.out.printf("%-5d", iNum);
		System.out.printf("%-5d", iNum);
		System.out.println(); 
		
		//float iFloat = 0.1f;
		
		System.out.printf("%.2f\n", 2.5);
		System.out.printf("%.5f\n", 2.5);
		System.out.printf("%.0f\n", 2.5); 
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하시오: ");
		int input = sc.nextInt();
		*/
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch4 = 'A';
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int) dNum ); // 2
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double) iNum1 ); // 10.0
		System.out.println( (double) iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int) fNum ); // 3
		System.out.println( iNum1 / (int)fNum ); // 3
		System.out.println( iNum1 / fNum );// 3.3333333
		System.out.println( (double) iNum1 / fNum ); // 3.3333333333333335
		System.out.println( "'" + ch4 + "'" ); // 'A'
		System.out.println( (int) ch4 ); // 65
		System.out.println( (int) ch4 + iNum1 ); // 75
		System.out.println( "'" + (char)(ch4 + iNum1) + "'" ); // 'K'
		
		
		
	}

}
