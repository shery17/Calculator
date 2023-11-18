import java.util.Scanner;

public class TextCalculator2 {

	public static void main(String[] args) {
		
		int[] number = new int[10];
		String[] operator = new String[10];
		int sum = 0;
		
		boolean close = false;
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		int o = 0;
		boolean firstNumber = false;
		
		while(close == false)
		{
			try
			{
				if(operator[o-1] == "=")
				{
					close = true;
				}
			}
			catch(Exception e)
			{
				
			}
			
			System.out.println("Enter a number");
			number[n] = scanner.nextInt();
			n++;
			scanner.nextLine();
			
			System.out.println("Enter an operator");
			operator[o] = scanner.nextLine();
			o++;
			
			if(firstNumber == false)
			{
				sum = number[n-1];
				firstNumber = true;
			}
			
			switch (operator[o - 2])
			{
			
			case "=":
				
				
			case "+":
				sum = sum + number[n];
				break;
				
			case "-":
				sum = sum - number[n];
				break;
			}
		}
		
		scanner.close();
	}

}
