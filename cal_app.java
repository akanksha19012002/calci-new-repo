package cal_app;

import java.util.Scanner;

public class cal_app {

	public static int add(int number1, int number2) {
		return number1 + number2;
	}

	public static int sub(int number1, int number2) {
		return (number1 - number2);

	}

	public static int mul(int number1, int number2) {
		return number1 * number2;
	}

	public static double div(double number1, double number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException("Number can not be divide by 0!");
		}

		return number1 / number2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int input = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Second Number : ");
		int input1 = sc.nextInt();
		
		System.out.println("The Addition is : " + cal_app.add(input, input1));
		System.out.println("The Substraction is : " + cal_app.sub(input, input1));
		System.out.println("The Multiplication is : " + cal_app.mul(input, input1));
		System.out.println("The Division is : " + cal_app.div(input, input1));
		
		}
}
