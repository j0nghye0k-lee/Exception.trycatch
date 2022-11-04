package testpage.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch2 {

	public static void main(String[] args) {

		IntTypeClass2 intTypeClass2 = new IntTypeClass2();
		TestScanner testScanner = new TestScanner();
		intTypeClass2.multiply(testScanner.input());
// 인스턴스된 inttypeclass의 multiply 매개변수에 testscanner.input()값을 넣어라.		
	}
}

class IntTypeClass2 {

	public void multiply(int b) {
		System.out.println(b + " 의 2제곱은 " + b * b + " 이다.");
		System.out.println(b);
		
	}
	public void workwork() {
		System.out.println("surprise~");
	}

}

class TestScanner {
	Scanner scanner = new Scanner(System.in); // System.in 키보드입력값 받기
	int c = 0;

	public int input() {

		try {
			c = scanner.nextInt();
	
		} catch (InputMismatchException e) {
			System.out.println("숫자로 다시 입력해주세요.");
			scanner.next(); // 입력값을 한번더 요구함.
			//input();
			
			String c = "asdfg";
		}
		
	return c;
		
	}
}

/*
 * try { //오류가 발생할수있는 코드 } catch (예외코드 예외코드명) { //오류가 발생하면 실행시킬 코드 } finally {
 * //catch 문구까지 끝나고 무조건 한번 실행시킬 코드 //finally 구문은 필수요소가 아니므로 사용하지 않아도 됨 }
 */