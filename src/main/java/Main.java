
// Editing this file is optional. This file is used for manual testing.

public class Main {
    /**
     * The entry point of the application.
     * 
     * This method creates a Greeting object and calls its sayHello() method. 
     * The returned value is printed out to the console.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        System.out.println("The current lab output: ");

        Greeting myGreetingObject = new Greeting();
        String result = myGreetingObject.sayHello();
        System.out.println(result);
    }
}
