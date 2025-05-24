import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problemFive(sc);
    };

    static void problemOne() {
        String fullName = "Christian Jade M. Garcia";
        String program = "BS Information Technology";
        String university = "Rizal Technological University";
        int yearLevel = 3;
        double gpa = 85.25123;

        System.out.println(String.format("""
                ========================================== 
                Welcome to Your Java Midterm 
                ========================================== 
                Name : %s 
                Program : %s 
                University : %s 
                Year Level : %d 
                Current GPA : %.2f 
                ------------------------------------------ 
                “The journey of a thousand codes  
                begins with a single line.”
                """, fullName, program, university, yearLevel, gpa));

    };

    static void problemTwo(Scanner sc) {
        double num1;
        double num2;

        System.out.print("Num1: ");
        num1 = sc.nextDouble();
        System.out.print("Num2: ");
        num2 = sc.nextDouble();
        
        System.out.println(String.format("Sum: %.1f", num1 + num2));           
        System.out.println(String.format("Difference: %.1f", num1 - num2));           
        System.out.println(String.format("Product: %.1f", num1 * num2));           

        if(num2 == 0) {
            System.out.println(String.format("Quotient: Cannot divide by zero"));
        } else {
            System.out.println(String.format("Quotient: %.1f", num1 / num2));
        }
        
    }

    static void problemThree(Scanner sc) {
        int age;
        
        System.out.print("Age: ");
        age = sc.nextInt();
        
        if(age >= 60) {
            System.out.println("You are a senior citizen.");
        } else if(age >= 20) {
            System.out.println("You are an adult.");
        } else if(age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child.");
        }
        
    };  

    static void problemFour(Scanner sc) {
        int number;
        System.out.print("Even or Odd: ");
        number = sc.nextInt();

        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    };

    static void problemFive(Scanner sc) {
        double balance = 0;
        int choice;
        boolean running = true;
        
        while(running) {
            double amount = 0.0;
            System.out.print("Choose an Option.\n1. Balance\t2. Deposit\t3. Withdraw\t4. Exit: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Deposit Amount: ");
                    amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Your new balance: " + balance);
                    break;
                case 3:
                    System.out.print("Withdraw Amount: ");
                    amount = sc.nextDouble();
                    if(amount > balance) {
                        System.out.println("Amount cannot be lower than your balance");
                        break;
                    }
                    balance -= amount;
                    System.out.println("Your new balance: " + balance);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        };  

    };
}