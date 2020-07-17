package main;

import java.util.ArrayList;

import sub.*;

public class MainClass {

	public static void main(String[] args) {
		
		MenuClass mc = new MenuClass();
		fourClass fc = new fourClass();
		
		
		System.out.println("사달라(사칙연산의 달인 라(?))");
		System.out.println();
		
		for(;;) {
			try {
				mc.setmenu(); // 목록 출력
				int i = mc.scanmenu(); // 스캐너 목록 선택
				if (i == 0) {
					break;
				} else {
					if (i < 5) {
						mc.switchmenu(i);
					} else {
						System.out.println("메뉴에 있는 목록만 입력해 주세요.");
					}
				}

			}catch (Exception e) {
				System.out.println("오류 재시작 해주세요");
				
			}finally {
				System.out.println();
				System.out.println("사달라를 종료합니다.");
			}
		}

	}

}
