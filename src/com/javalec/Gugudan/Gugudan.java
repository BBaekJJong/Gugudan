package com.javalec.Gugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
	
		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
//		for (int i = 1; i < 9; i++) {
//			System.out.println(number * i);
//		}
		
		if (number == 0) {
			
			for (int i = 1; i < 9; i++) {
				System.out.println(i + "��");
				for (int j = 1; j < 9; j++) {
					System.out.print(i + "*" + j + "=");
					System.out.println(i * j);
				}
			} 
			
		} else {
			for (int i = 1; i < 9; i++) {
				System.out.println(number + "��");
				System.out.print(number + "*" + i + "=");
				System.out.print(number * i);
			}
		}
		
	}
}
