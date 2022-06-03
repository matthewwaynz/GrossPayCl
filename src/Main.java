import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String myName;
//        myName = "Nyongeza Matthew";
//        String myJob = "Programmer";
//        String args1 = args[0];
//        String myNameCopy = myName;
//        myName = "Matthew";
//
//        System.out.println(myName);
//        System.out.println(myNameCopy);
//        System.out.println(myJob);
//        System.out.println(args1);
//        System.out.println(args[1]);
//        int x = 20;
//        int y = 30;
//        x = 30;
//        long number1 = 24322343535L;
//        short number2 = -31000;
//        byte number3 = 110;
//        long number4 = 1343332;
//
//
//        System.out.println( x * y);
//        final int TOTAL_MARK = 300;
//       final int T_T = 60;
//
//        System.out.println(TOTAL_MARK + T_T);
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
//        System.out.println(number4 * 2);
//        int code1 = 'L';
//        char code2 = 65;
//        System.out.println(code2);
//        System.out.println(code1);
//        boolean sheCame = false;
//        if(sheCame)
//            System.out.println("She really Came Through");
//        else
//            System.out.println("She refused to come thru");


//        Calculating an employee gross pay



        //  Getting the number of hours worked by an employee
//        System.out.println("Enter the number of hours worked by the employee: ");
//        Scanner scanner = new Scanner(System.in);
//        int hours = scanner.nextInt();
//
//        // Getting the hourly pay
//        System.out.println("Enter the employee pay rate: ");
//        double payRate = scanner.nextDouble();
//        scanner.close();
//
//         // multiply the hrs by the pay rate
//        double grossPay = hours * payRate;
//        // display result
//        System.out.println("The Employee's gross pay is " + grossPay);







            // get the employee's name
        System.out.println("Enter the Employee's name: ");
        Scanner scanner = new Scanner(System.in);
        String EmployeeName = scanner.next();
        // get hours worked by each employee

        System.out.println("Enter the number of hours worked by the Employee: ");
        int hoursWorked = scanner.nextInt();

        // getting the hourly pay rate
        System.out.println("Enter the hourly pay rate: ");
        double hourlyPay = scanner.nextDouble();
        scanner.close();
        //  multiplying hours worked by the hourly rate
         double grossPay = hourlyPay * hoursWorked;
        System.out.println(EmployeeName+"'s gross pay is " + grossPay);


















    }
}
