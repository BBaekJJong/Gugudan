package com.javalec.Gugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
	
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
	
		if (number == 0) {
			
			for (int i = 1; i < 10; i++) {
				System.out.print(i + "단\t");
			}
	
			System.out.println();
			for (int i = 1; i < 9; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.print(j + "*" + i + "=");
					System.out.print(j*i+"\t");
					
//					System.out.print(i + "*" + j + "=");
//					System.out.println(i * j);
				}
				System.out.println();
			} 
			
		} else if (number > 0 && number < 10) {
			
			System.out.println(number + "단");
			for (int i = 1; i < 9; i++) {
				System.out.print(number + "*" + i + "=");
				System.out.println(number * i);
			}
		} else {
			System.out.println("10이하로 입력해 주세요!!");
		}
		
		
//		int i = 1;
//		while (i<10) {
//			System.out.println(2 * i);
//
//			i++;
//		}
		
		
		
		
		
	}
}
