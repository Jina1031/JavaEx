package ch02.unit3;
/*
System.out.printf("출력서식", 풀력값,출력값)
:출력 서식에 따라 값을 출력, 출력 후 라인을 넘기지 않음
:System.out.format("출력서식", 출력값, 출력값)와 동일
*/

public class Ex03_printf {

	public static void main(String[] args) {
		int a, b;
		a = 13;
		b = 4;
		
		System.out.println(a + "+" + b + "=" + (a+b)); //13+4=17
		System.out.printf("%d + %d = %d\n", a, b, a+b); //13 + 4 = 17
		System.out.printf("%d %d %d %d\n", a, b, a, b); //13 4 13 4
		System.out.format("%1$d %2$d %1$d %2$d\n", a, b);//13 4 13 4
		
		String s = "Hello, Jar-chive";
		System.out.printf("%s", s);//Hello, Jar-chive
		System.out.println();
		
		char ch = 'A';
		char ch2 = 'B';
		char ch3 = 'C';
		System.out.printf("%c 다음은 %c 다음은 %c", ch, ch2, ch3); //A 다음은 B 다음은 C
		System.out.println();
		
		float f = 123.234f;
		System.out.printf("%f\n",f); //123.234001
		System.out.printf("%.2f\n",f); //123.23 소수점 아래 두자리까지 출력
		System.out.format("%.3f\n",f); //123.234 소수점 아래 세자리까지 출력
		
		
		
//		
//		// % 형식지정 제어문자
//		// %d 정수를 출력
//		System.out.println();
//		
//		System.out.printf("%d+%d=%d\t", a, b, a+b);
//		System.out.printf("%d-%d=%d%n", a, b, a-b);
//		//합과 차는 한 줄에 나오지만 \t 를 통해서 탭 띄어쓰기가 됨
//		
//		System.out.printf("%d*%d=%d\t", a, b, a*b);
//		System.out.printf("%d/%d=%d%n", a, b, a/b);
//		System.out.printf("%d %% %d=%d%n", a, b, a%b);// 나머지
//		// %% : %가 형식 문자가 아닌 문자 %를 출력하는 경우 사용
	}

}
