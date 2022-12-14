package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		/* 자바 기본 자료형 8가지
		 * 논리형: boolean(1byte)
		 * 정수형: byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형: float(4byte), double(8byte)
		 * 문자형: char(2byte, 유니코드)
		 * String  
		 */
		
		// 변수 선언: 메모리에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입: 변수에 값을 집어 넣는 것.
		
		boolean booleanData; // 메모리에 논리 값(T/F)을 저장할 공간 1byte 할당하고
							 // 할당된 공간을 booleanData라고 부르겠다.
		booleanData = true;
		// = :대입연산자
		System.out.println("booleanData: " + booleanData);
		
		
		byte byteNumber = 127;
		/* 메모리에 정수값을 저장할 공간 1byte 할당하고 
		 * 할당된 공간은 byteNumber라고 부르겠다.
		 * 선언된 byteNumber 변수에 처음으로 127 넣음 => 초기화: 처음 변수에 값을 대입
		 */
		
		System.out.println("byteNumber: " + byteNumber);
		
		short shortNumber = 32767; // 변수 선언 및 초기화
		//정수 자료형의 기본형 (short, byte 옛날 코드의잔재)
		int intNumber = 2147483647; // 변수 선언 및 초기화
	  //자료형  변수명    =   리터럴 ;
		// 프로그래밍에서는 대입되는 데이터를 리터럴이라는 단어로도 표현
		//**리터럴: 변수에 대입되거나 작성되는 값 자체
		//+ 자료형에 따라 리터럴 표기법이 다름
		
		long longNumber = 10000000000L; //l L소문자 대문자 상관 x 
		//100억이라는 값은 범위를 벗어남 
		//뒤에 L을 붙여줌으로써 long 자료형인 것을 나타냄
		
		
		//실수형
		float floatNumber = 1.2345f; //f F
		
		double doubleNumber =3.141596; 
		
		//d를 뒤에 쓸 수는 있다 3.141596d
		//실수형은 두 개밖에 없기 때문에 / 자바는 double을 기본으로 인식
		
		System.out.println(shortNumber + intNumber + longNumber + floatNumber + doubleNumber);
		
		// 문자형 리터럴 표기법 char:' '
		// ---> 문자 하나
		char ch = 'A'; //65
		//String str = "melong";
		// 문자열 표기법 String : " "
		
		char ch2 = 66; //B
		
		System.out.println("ch2: " + ch2);
		System.out.println("ch: " + ch);
		
		/* char 자료형에 숫자가 대입될 수 있는 이유
		 * - 컴퓨터에는 문자표가 존재하고 있는데
		 *   숫자에 따라 지정된 문자 모양이 매핑되어있고
		 *   'B'문자 그대로가 대입되면 변수에 숫자 66으로 변환돼서 저장.
		 *   ---> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것이 가능하다.
		 */     
		 
		
		// 변수 명령 규칙
		// 1. 대소문자 구분 o, 길이 제한 x
		// 2. 예약어 사용 x
		// 3. 숫자 시작 x
		// 4. 특수문자 _, $ 만 사용 가능 (하지만 쓰지 않는다)
		int $intNumber; //문제는 없지만 개발자가 직접 사용 안함
		int int_number; //자바는 카멜표기법 사용, _작성표기법은 DB에서 주로 사용
		
		// 5. 카멜표기법 --> 변수명 작성 시 여러 단어를 이어서 작성하는 경우 
		//				띄어쓰지 않고 후속 단어 첫 글자를 대문자로 작성한다.
		// 6. 변수명은 언어를 가리지 않음 (하지만 사용하지 않음)
		int 정수1 = 10;
		int aa;
		System.out.println(정수1);
		//-------------------------------------------------------
		
		int number = 10;
		System.out.println(number);
		number = 29;
		System.out.println(number);
		
		final int AGE = 30;
		System.out.println(AGE);

		
		
		/* 상수(항상 같은 수 )
		 * - 변수의 한 종류
		 * - 한번 값이 대입되면 다른 값 대입 불가
		 * - 자료형 앞에 final 키워드를 작성 (마지막 대입되는 값)
		 * 
		 * - 상수 명령 규칙 : 모두 대문자, 여러 단어 작성 시 _ 사용
		 * - 상수를 사용하는 경우 
		 *  1) 변하면 안되는 고정된 값을 저장할 때
		 *  2) 특정한 값에 의미 부여하는 경우
		 *  
		 */
		
		final double PI_VALUE = 3.14;
		// PI_VALUE = 2.3; 에러
		System.out.println(PI_VALUE);
	}
}
