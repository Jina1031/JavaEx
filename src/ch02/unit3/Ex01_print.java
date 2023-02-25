package ch02.unit3;
/*
 System.out.print(인수)
=인수의 내용을 출력 장치를 통해 출력하며, 라인을 넘기지 않는다. 
 */
public class Ex01_print {

	public static void main(String[] args) {
//java와 javascript의 사이를 벌리고 싶을 때 
//방법1		System.out.print("\n"); //라인 넘기기
//방법2		System.out.print("\t"); // tab으로 간격 벌리기
		System.out.print("Java\n\nJsp\nServlet");
		System.out.print("\nSpring\n\n"); //\n\n은 한줄의 공백이 생김
		
		System.out.print("국어\t");// \t: 탭 간격
		System.out.print("영어\t");
		System.out.print("수학\n");

		System.out.print(80 + "\t");
		System.out.print(90 + "\t");
		System.out.print(85 + "\n");
		
//방법2		System.out.print("javascript\njava");
		//한줄로 출력. 
	}

}
