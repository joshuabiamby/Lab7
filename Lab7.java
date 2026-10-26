import java.util.Scanner;

public class Lab7 {
    public static int recursiveMultiply(int x, int y){
        if(y == 0){
            return 0;
        }
        else{
            return x + recursiveMultiply(x, y - 1);
        }
    }

    public static int recursiveDivision(int x, int y){
        int count = 0;

        if(y == 0){
            return -1; 
            
        }
        if(x == 0){
            return 0;
        }
        
        return 1 + recursiveDivision(x - y, y);
        
    }

    public static int recursiveRemainder(int x, int y){
        if (y == 0){
            return -1;
        }
        else if( x < y){
            return x;
        }

        return recursiveRemainder(x - y, y);
    }

    public static String recursiveEcho(String toEcho, int numberOfTimes){
        if(numberOfTimes == 0){
            return "";
        }
        else{
            return toEcho + recursiveEcho(toEcho, numberOfTimes -1);
        }
    }

    public static boolean recursiveReverse(String first, String second){
        char firstChar = Character.toLowerCase(first.charAt(0));
        char lastChar = Character.toLowerCase(second.charAt(second.length()-1));

        if(first.length() <= 1 && second.length() <= 1){
            return true;
        }

        else if (first.length() != second.length()) {
            return false;
        }

        if (firstChar == lastChar) {
        return recursiveReverse(first.substring(1), second.substring(0, second.length() - 1));
        }   
        else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Divide 2 numbers");
            System.out.println("3. Mod 2 numbers");
            System.out.println("4. Echo sentence");
            System.out.println("5. Determine if reverse");
            System.out.println("6. Quit");
            System.out.print("Enter option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the first number: ");
                    int num1a = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the second number: ");
                    int num2a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Your product is " + recursiveMultiply(num1a, num2a));
                    break;

                case "2":
                    System.out.print("Enter the first number: ");
                    int num1b = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the second number: ");
                    int num2b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Your quotient is " + recursiveDivision(num1b, num2b));
                    break;

                case "3":
                    System.out.print("Enter the first number: ");
                    int num1c = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the second number: ");
                    int num2c = Integer.parseInt(scanner.nextLine());
                    System.out.println("Your modulus is " + recursiveRemainder(num1c, num2c));
                    break;

                case "4":
                    System.out.print("Enter your sentence: ");
                    String sentence = scanner.nextLine();
                    System.out.print("Repeat how many times? ");
                    int count = Integer.parseInt(scanner.nextLine());
                    System.out.println("Your sentence repeated " + count + " times is");
                    System.out.println(recursiveEcho(sentence, count));
                    break;

                case "5":
                    System.out.print("Enter a sentence: ");
                    String first = scanner.nextLine();
                    System.out.print("Enter another sentence: ");
                    String second = scanner.nextLine();
                    if (recursiveReverse(first, second)) {
                        System.out.println("The sentences are the opposite of each other.");
                    } else {
                        System.out.println("The sentences are NOT the opposite of each other.");
                    }
                    break;

                case "6":
                    System.out.println("Shutting off...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

    }
}
