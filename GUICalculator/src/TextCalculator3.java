import java.util.Scanner;

public class TextCalculator3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean close = false;
		
		String operator;
		int number;
		int sum = 0;
		
		System.out.println("Enter a number");
		sum = scanner.nextInt();
		scanner.nextLine();
		
		while(close == false)
		{
			System.out.println("Enter an operator");
			operator = scanner.nextLine();
			
			if(operator.equals("="))
			{
				System.out.println(sum);
				close = true;
				return;
			}
			
			System.out.println("Enter a number");
			number = scanner.nextInt();
			scanner.nextLine();
			
			switch(operator)
			{
			case "=":
				System.out.println(sum);
				close = true;
				break;
			
			case "+":
				sum = sum + number;
				break;
				
			case "-":
				sum = sum - number;
				break;
				
			case "*":
				sum = sum * number;
				break;
				
			case "x":
				sum = sum * number;
				break;
				
			case "/":
				sum = sum / number;
				break;
			}
			
		}

	}
	/*
	private void UpdateSumOp()
	{
		String total = total + operator;
	}
	
	private void UpdateSumNum()
	{
		String total = total + number;
	}
    */
}
