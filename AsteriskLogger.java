package week5;

//3. Create two classes that implement the Logger interface
//a. AsteriskLogger
public class AsteriskLogger implements Logger {
//4. Implement the AsteriskLogger methods
//a. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

//b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”
	public void error(String message) {
		// Calculate the length of the box based on the message length
		int length = message.length() + 13; // 13 is the length of "***ERROR: ***"
		// Print the top border of the box
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
		// Print the message inside the box
		System.out.println("***ERROR: " + message + "***");
		// Print the bottom border of the box
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}