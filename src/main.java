import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    char operator;
    double num1;
    double num2;
    double result;
    String aaa = "continue";
    

    do {

    
    System.out.println("Please type the first number");
    Scanner scan1 = new Scanner(System.in);
    num1 = scan1.nextDouble();


    System.out.println("Choose an operation:" + "\n" + "> Type + for addition" + "\n" + "> Type - for subtraction" + "\n" + "> Type * for multiplication" + "\n" + "> Type / for division");
    Scanner scan2 = new Scanner(System.in);
    operator = scan2.next().charAt(0);

    
    System.out.println("Please type the secound number");
    Scanner scan3 = new Scanner(System.in);
    num2 = scan3.nextDouble();

    switch (operator) {

        //addition 
        case '+':
          System.out.println(Calculate.add(num1, num2));
          break;
  
        //subtraction 
        case '-':
          System.out.println(Calculate.substract(num1, num2));
          break;
  
        //multiplication 
        case '*':
          System.out.println(Calculate.multiply(num1, num2));
          break;
  
        //division 
        case '/':
        if (num1 > 0 && num2 > 0) {
        System.out.println(Calculate.divide(num1, num2));    
        } else if (num1 == 0 || num2 == 0) {
        System.out.println("cannot divide by zero");  
    } 
    break;
}

System.out.println("do you want to continue or quit?");
Scanner scan4 = new Scanner(System.in);
aaa = scan4.nextLine();


} while (aaa.equals("continue"));

System.out.println("Bye!");


    }
}
