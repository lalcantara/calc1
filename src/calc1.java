import java.io.*;

public class calc1 {

	public static void main(String[] args) {
		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");
		String op = getInput("Enter 1=Add, 2=Subtract, 3=Multiply, 4=Divide");
		
		int opInt = Integer.parseInt(op);
		double result = 0;
		switch (opInt) {
		case 1:
			result = addValues(s1, s2);
			break;
		case 2:
			result = subtractValues(s1, s2);
			break;
		case 3:
			result = multiplyValues(s1, s2);
			break;
		case 4:
			result = divideValues(s1, s2);
			break;

		default:
			System.out.println("You entered an incorrect value");
			return;
		}

		
		
		System.out.println("The answer is " + result);
	}

	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}
