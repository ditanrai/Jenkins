import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int number1=input.nextInt();
		
		System.out.println("Enter second number:");
		int number2=input.nextInt();
		
		if (number1==number2) {
			System.out.printf("%d==%d%n", number1,number2);
		}
		if (number1!=number2) {
			System.out.printf("%d!=%d%n", number1,number2);
		}
		if (number1<number2) {
			System.out.printf("%d<%d%n", number1,number2);
		}
		if (number1>number2) {
			System.out.printf("%d>%d%n", number1,number2);
		}
		if (number1<=number2) {
			System.out.printf("%d<=%d%n", number1,number2);
		}
		if (number1>=number2) {
			System.out.printf("%d>=%d%n", number1,number2);
		}
		

	}

}
