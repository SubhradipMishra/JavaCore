package Day1;

public class Ch3Operators {
    public static void main(String[] args) {

        // Operators are special symbols that perform specific operations on one, two,
        // or three operands, and then return a result.
        /*
         * Operators are divided into the following categories:
         * 1) Arithmetic Operators
         * 2) Relational Operators
         * 3) Logical Operators
         * 4) Bitwise Operators
         * 5) Assignment Operators
         * 6) Misc Operators
         * 
         */

        // 1) Arithmetic Operators
        /*
         * 
         * + --> Addition
         * - --> Subtraction
         * --> Multiplication
         * / --> Division
         * % --> Modulus
         * ++ --> Increment
         * -- --> Decrement
         * 
         */

        // 2) Relational Operators
        /*
         * == --> Equal to
         * != --> Not equal to
         * > --> Greater than
         * < --> Less than
         * >= --> Greater than or equal to
         * <= --> Less than or equal to
         * 
         */

        // 3) Logical Operators
        /*
         * 
         * && --> Logical AND
         * || --> Logical OR
         * ! --> Logical NOT
         * 
         */
        
        //ARITHMETIC OPERATORS

        int a = 20 ; 
        int b = 10 ; 

        System.out.println("Addition of a and b is : " + (a + b));
        System.out.println("Subtraction of a and b is : " + (a - b));
        System.out.println("Multiplication of a and b is : " + (a * b));
        System.out.println("Division of a and b is : " + (a / b));
        System.out.println("Modulus of a and b is : " + (a % b));

        // Logical Operators
        boolean x = true ;
        boolean y = false ;

        System.out.println("Logical AND : " + (x && y));
        System.out.println("Logical OR : " + (x || y));
        System.out.println("Logical NOT : " + (!x));


        /* Unary Operators:- This operator need only one operand */
        // ++ --> Increment
        // -- --> Decrement

        // Post Increment
        int xy = 10 ; 
        System.out.println("Post Increment : " + (xy++)); // 10
        System.out.println("Value of xy after Post Increment : " + xy); // 11
        System.out.println("Pre Increment : " + (++xy)); // 12

        // Post Decrement
        int yz = 10 ;
        System.out.println("Post Decrement : " + (yz--)); // 10
        System.out.println("Value of yz after Post Decrement : " + yz); // 9
        System.out.println("Pre Decrement : " + (--yz)); // 8


    }
}
