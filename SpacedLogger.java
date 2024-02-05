package week5;

//b. SpacedLogger
public class SpacedLogger implements Logger {
//5. Implement the SpacedLogger methods
//a. If the log method received “Hello” as an argument, it should print H e l l o
	public void log(String message) {
		// Loop through each character of the message and add a space after it
		for (char c : message.toCharArray()) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

//b. The error method should do the same, but with “ERROR:” preceding the spaced out input
	public void error(String message) {
		// Print "ERROR:" followed by a space
		System.out.print("ERROR: ");
		// Loop through each character of the message and add a space after it
		for (char c : message.toCharArray()) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
}