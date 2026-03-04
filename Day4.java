package com.tka.feb;

public class Day4 {

	public static void main(String[] args) {
		int i = 10;
		i++; // 11
		--i; // 10
		System.out.println(i++); // 10 // 11
		i++; // 12
		System.out.println(i % 4); // 0
		--i; // 11
		System.out.println(i += 5); // 16
		i++; // 17
		int b = i + 2; // 19
		System.out.println(i++); // 17 // 18
		--i; // 17
		i %= 4; // 1
		System.out.println(i++); // 1 // 2
		++i; // 3
		System.out.println(i + 4); // 7

		System.out.println("------------------------");

		System.out.println(i); // 3

		System.out.println("--------------");

		System.out.println(i % 4); // 3

	}

}
