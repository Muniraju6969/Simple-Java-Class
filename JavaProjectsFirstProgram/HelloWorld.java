public class HelloWorld {
    // This is a simple Java program to demonstrate setup and execution.
    // Author: [Muniraju]: Unknown word.
    // Date: January 15, 2026

    // The main method is the entry point of the program.
    // It is static so it can be called without creating an instance of the class.
    public static void main(String[] args) {
        // Print a greeting message
        System.out.println("Hello, World!");

        // Check if command-line arguments are provided and print them
        if (args.length > 0) {
            System.out.print("Command-line arguments received: ");
            for (String arg : args) {
                System.out.println(arg); // Print each argument on a new line
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}