package testpage.exception;

import java.util.Scanner;

public class Trycatch {
	  public static void main(String[] args) {
	        
	        IntTypeClass intTypeClass = new IntTypeClass();
	        
	        Scanner sc= new Scanner(System.in);
	        intTypeClass.multiply(sc.nextInt());
	        
	        sc.close();
	    }
	    
	 
	}
	 
	class IntTypeClass {
	    
	    public void multiply(int a) {
	        System.out.println( a + " 의 2제곱은 " + a * a + " 입니다.");
	    }
	    
	}
	
//	숫자를 넣으면 문제가 없겠지만 문자를 넣게 되면 에러가 발생한다.
