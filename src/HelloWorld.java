

public class HelloWorld {


    //main method
    public static void main(String[] args) {

        // datatype variableName

        double salaryRequirement;
        boolean isEmployed;

        // Single line variable declaration
        int yearFounded = 2011;
        String name = "Mono";
        int age = 85;

        // int declaration and assignment
        int numberOfPrimitiveTypes = 8;


        // doubles can have decimal places:
        double price = 8.99;
        double  androidShare = 81.7;


        int number = 5;

        number += 3; // Value is now 8
        number -= 4; // Value is now 4
        number *= 6; // Value is now 24
        number /= 2; // Value is now 12
        number %= 7; // Value is now 5



        //BOOLEANS. We declare boolean variables by using the keyword boolean before the variable name.
        boolean javaIsACompiledLanguage = true;
        boolean javaIsACupOfCoffee = false;



        //CHAR . wrapped in single quotes
        char grade = 'A';
        char firstLetter = 'p';
        char punctuation = '!';


        //STRINGs
        String greeting = "Hello World";



        String firstName = "Victor";
        int ageTwo = 33;
        double desiredSalary = 75000;
        char gender = 'm';
        boolean lookingForJob = true;

        // declare initial balance
        double balance = 20000.99;
        // declare deposit amount
        double depositAmount = 1000.00;
        // store result of calculation in our original variable
        balance = balance + depositAmount;

        int zebrasInZoo = 8;
        int giraffesInZoo = 4;


        //Changing value of variables
        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println(animalsInZoo + " " + "animals");
        int numZebrasAfterTrade = zebrasInZoo - 2;
        System.out.println(numZebrasAfterTrade + " " + "zebras");


        //Division has different results with integers. The / operator does integer division, which means that any remainder is lost.
        int evenlyDivided = 10 / 5;
//ev    enlyDivided holds 2, because 10 divided by 5 is 2
        int unevenlyDivided = 10 / 4;
//un    evenlyDivided holds 2, because 10 divided by 4 is 2.5

        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal * tax + subtotal;
        System.out.println(total + " " + "amount");

        double perPerson = total/4 ;
        System.out.println(perPerson + " " + "per Person");

        int students = 26;
        int leftOut = 26 % 3;
        System.out.println(leftOut + " " + "left out");




        System.out.println("Hello World!");
        System.out.println("Hello World");

        /*MULITLINE COMMENT
        James Gosling is a Canadian engineer who
		created Java while working at Sun Microsystems.
		His favorite number is the square root of 2!
        */

        // single line
        System.out.print("Today is a great day to code!");
        System.out.print("same line");
        System.out.print("Three...");
        System.out.print("Two...");
        System.out.println(name);
        System.out.println(yearFounded);
        System.out.println(age);
        System.out.println(age +" " + name + " " + yearFounded);
        System.out.println(numberOfPrimitiveTypes);
        System.out.println(androidShare);
        System.out.println(javaIsACompiledLanguage);
        System.out.println(desiredSalary);

        // Prints: "Hello World"
        System.out.println("\"Hello World\"");

    }




}


