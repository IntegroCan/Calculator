import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("CALCULATOR");
            while (true){
                System.out.println("Enter operator (+  -  *  /)");
                String op = scanner.next().trim();
                if (op.equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println("First Number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Second number: ");
                double num2 = scanner.nextDouble();
                try {
                    double result = calculator.calculator(num1, num2, op);
                    System.out.printf("Result :  %.3f%n%n ", result);
                }
                catch (ArithmeticException e){
                    System.out.println("Error : " + e.getMessage() + "\n");
                }
                catch (IllegalStateException e){
                    System.out.println("Error : " + e.getMessage() + "\n");
                }
            }
        }
    }
}
