package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutputEx();
		consoleInputEx();
	}
	public static void consoleInputEx( ) {
		// system.in
		Scanner scanner = new Scanner(System.in); // 표준 입력을 입력소스로 설정
		System.out.print("이름은?");
		String name = scanner.next(); // 문자열 입력
		int age = scanner.nextInt();
		
		System.out.println("이름은" + name + ", 나이는" + age);
		
		scanner.close();
	}
	public static void consoleOutputEx() {
		// system.out : 표준출력
		// system.err : 표준 에러
		// 		print : 개행 안함
		//		println : 개행 함
		//	printf : 포매팅 출력 -> string 에서 정리
		
		System.out.print("Hello"); // 개행 안함
		System.out.println("Java"); // 개행 함
		
		// 이스케이프 문자
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		String message = "Hello, \"Java\""; 
		System.out.println(message);
		
		// 윈도의 경우, 경로 구분자가 \
		String filename = "C:\\myfolder\\myfile.txt";
		System.out.println(filename);
	}
}