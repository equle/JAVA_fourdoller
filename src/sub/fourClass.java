package sub;

import java.util.Random;
import java.util.Scanner;

public class fourClass {
	
	Scanner scan = new Scanner(System.in);
	
	Random rd = new Random();
	int non = 0;
	int cor = 0;
	int count = 0;
	
	public void add() {
		System.out.println("더하기 10문제");
		for(;;) {
			int num1 = rd.nextInt(100);
			int num2 = rd.nextInt(100);
			try {
				System.out.print(num1 + " + " + num2 + " = ");
				int result = scan.nextInt();
				if (result == num1 + num2) {
					System.out.println("정답입니다.");
					cor+=1;
				}
				else {
					System.out.println("오답입니다.");
					non+=1;
				}
				System.out.println();
				
				count +=1;
				if(count>9) {
					System.out.println("전체 갯수 : " + count);
					System.out.println("맞춘 갯수 : " + cor);
					System.out.println("틀린 갯수 : " + non);
					break;
				}
			}catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
			}
			
		}
	}
	
	public void sub() {
		System.out.println("빼기 10문제");
		for(;;) {
			int num1 = rd.nextInt(100);
			int num2 = rd.nextInt(100);
			try {
				System.out.print(num1 + " - " + num2 + " = ");
				int result = scan.nextInt();
				if (result == num1 - num2) {
					System.out.println("정답입니다.");
					cor+=1;
				}
				else {
					System.out.println("오답입니다.");
					non+=1;
				}
				count +=1;
				if(count>9) {
					System.out.println();
					System.out.println("전체 갯수 : " + count);
					System.out.println("맞춘 갯수 : " + cor);
					System.out.println("틀린 갯수 : " + non);
					break;
				}
				
			}catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
			}
			
		}
	}
	
	public void mul() {
		System.out.println("곱하기 10문제");
		for(;;) {
			int num1 = rd.nextInt(100);
			int num2 = rd.nextInt(100);
			try {
				System.out.print(num1 + " × " + num2 + " = ");
				int result = scan.nextInt();
				if (result == num1 * num2) {
					System.out.println("정답입니다.");
					cor+=1;
				}
				else {
					System.out.println("오답입니다.");
					non+=1;
				}
				count +=1;
				if(count>9) {
					System.out.println();
					System.out.println("전체 갯수 : " + count);
					System.out.println("맞춘 갯수 : " + cor);
					System.out.println("틀린 갯수 : " + non);
					break;
				}
				
			}catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
			}
			
		}
		
	}
	
	public void div() {
		
		System.out.println("나누기 10문제 (소수점 이하 자리는 제거합니다.)");
		
		for(;;) {
			int num1 = rd.nextInt(100);
			int num2 = rd.nextInt(20);
			try {
				if(num1>num2) {
					System.out.print(num1 + " ÷ " + num2 + " = ");
					int result = scan.nextInt();
					if (result == num1 / num2) {
						System.out.println("정답입니다.");
						cor+=1;
					}
					else {
						System.out.println("오답입니다.");
						non+=1;
					}
					count +=1;
					if(count>9) {
						System.out.println();
						System.out.println("전체 갯수 : " + count);
						System.out.println("맞춘 갯수 : " + cor);
						System.out.println("틀린 갯수 : " + non);
						break;
					}
				}
				
			}catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
			}
			
		}
		
	}
	
}
