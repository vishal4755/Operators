package com.tka.feb;

public class Day2 {

	public static void main(String[] args) {

		int a = 4, b = 10;

		boolean c = a != b;

		System.out.println(a > b);
		System.out.println(4 < 1);

		System.out.println(4 >= 4);
		System.out.println(4 <= 4);

		System.out.println(4 == 2);
		System.out.println(b > a);
		System.out.println("--------------");

		System.out.println(false && false);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println("--------------------------");
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(false || false);
		System.out.println(true || false);
		System.out.println("------------------");
		System.out.println(20 < 3 && (1 >= 0 || 2 == 5) && 22 != 90);
		System.out.println(false && 22 != 90);

		System.out.println((0 < 3) && (1 >= 0 || 2 <= 5) && 22 >= 90); // false
		System.out.println((10 == 9) || (1 >= 0 && 100 > 5) && 2 > 0); // true
		System.out.println((30 >= 29) && (20 > 19) || (1 >= 0 || 2 <= 5) && 22 >= 90); // false
		System.out.println(true || false); // true
		System.out.println("-----------------");
		boolean check = true;
		System.out.println(10 > 45 && 20 < 9 || check && true);
		System.out.println((true) || 0 < 9 || check || 0 > 0);
		System.out.println(1 > 5 || 2 < 9 || false && 0 == 0);
		System.out.println(check && (20 < 9) || 45 != 0 && true);

	}

}
