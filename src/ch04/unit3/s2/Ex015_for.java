package ch04.unit3.s2;

public class Ex015_for {

	public static void main(String[] args) {
		int c;
		
		for(int b=1; b<=9; b++) { //n*1를 한 줄로 찍어냄. 
			//2 * 1 = 2	3 * 1 = 3	4 * 1 = 4	5 * 1 = 5	6 * 1 = 6	7 * 1 = 7	8 * 1 = 8	9 * 1 = 9	
			//2 * 2 = 4	3 * 2 = 6	4 * 2 = 8	5 * 2 = 10	6 * 2 = 12	7 * 2 = 14	8 * 2 = 16	9 * 2 = 18	
			for(int a=2;a<=9;a++) {
				c=a*b;
				System.out.printf("%d * %d = %d\t", a, b, c);
			}
			System.out.println();
		}
	}

}
