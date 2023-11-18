import java.util.Scanner;

public class TextCalculator {
	
	//private int firstNumber;
	//private int secondNumber;
	//private String operator;
	//private int sum;
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int firstNumber = scanner.nextInt();
		scanner.nextLine(); //clears input
		
		System.out.println("Enter an operator");
		String operator = scanner.nextLine();
		
		System.out.println("Enter a number");
		int secondNumber = scanner.nextInt();
		
		
		
		switch (operator)
		{
		
		case "+":
			int sum1 = firstNumber + secondNumber;
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + sum1);
			break;
			
		case "-":
			int sum2 = firstNumber - secondNumber;
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + sum2);
		    break;
		    
		case "*":
			int sum3 = firstNumber * secondNumber;
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + sum3);
			break;
			
		case "x":
			int sum4 = firstNumber * secondNumber;
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + sum4);
			break;
			
		case "/":
			int sum5 = firstNumber / secondNumber;
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + sum5);
			break;
		
		}
		
		scanner.close();


	}

}
