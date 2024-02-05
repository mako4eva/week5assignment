package week5;

//1. Create an interface named Logger
public interface Logger {
//2. Add two void methods to the Logger interface, each should take a String as an argument
	void log(String message);

	void error(String message);
}