package main;

import java.util.ArrayList;
import java.util.Scanner;

import sub.*;

public class MenuClass {
	
	// 리스트 만들기
	public void setmenu() {
		
		ArrayList<String> menuList = new ArrayList<String>();
		menuList.add("더하기");
		menuList.add("빼기");
		menuList.add("곱하기");
		menuList.add("나누기");
		
		//목록 출력
		System.out.println("< 목록 >");
		
		for(int i=0; i < menuList.size();i++) {
			System.out.println((i+1)+". "+menuList.get(i));
		}
		System.out.println("0. 종료");
		System.out.println();
		
	}

	
	//문제 정하기
	public int scanmenu() {
		
		Scanner scan = new Scanner(System.in);
		int i;
		for(;;) {
			try {
				System.out.print("문제 풀러 가기 (정수만 입력) >>");
				i = scan.nextInt();
				break;
				
			}catch (Exception e) {
				System.out.println("정수만 입력 가능합니다.");
			}
		}
		return i;
	}
	
	//문제 보내기
	public void switchmenu(int i) {
		FourClass fc = new FourClass();
		System.out.println();
		switch (i) {
		
			case 1 : fc.add();
					 break;
					 
			case 2 : fc.sub();
					 break;
			
			case 3 : fc.mul();
					 break;
			
			case 4 : fc.div();
					 break;
		default:
			System.out.println("오류 재시작 해주세요");
		}
		
	}
	
}
