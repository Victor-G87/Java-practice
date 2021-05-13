

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

        /* ORDER OF OPPERATIONS
        Parentheses
        Multiplication
        Division
        Modulo
        Addition
        Subtraction
         */



        //BOOLEANS. We declare boolean variables by using the keyword boolean before the variable name.
        boolean javaIsACompiledLanguage = true;
        boolean javaIsACupOfCoffee = false;

        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;

        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;

        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;

        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;

        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete + "" + "water intake");



        //CHAR . wrapped in single quotes
        char grade = 'A';
        char firstLetter = 'p';
        char punctuation = '!';


        //STRINGs
        String greeting = "Hello World";


        //.equals()
        String person1 = "Paul";
        String person2 = "John";
        String person3 = "Paul";

        System.out.println(person1.equals(person2));
        // Prints false, since "Paul" is not "John"

        System.out.println(person1.equals(person3));
        // Prints true, since "Paul" is "Paul"



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

        //Compound Assignment Operators
        int numCupcakes = 12;
//        numCupcakes = numCupcakes + 8; // Value is now 20
        numCupcakes += 8; // Value is now 20
        System.out.println(numCupcakes);

        int numCookies = 17;
        numCookies -= 3;
        numCookies /=2;
        System.out.println(numCookies + " " + "cookies left");




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


