package Day1;

public class Ch1Variable {
    public static void main(String[] args) {
        int a; // this is a integer variable which is declared and it's name is 'a' but not
               // assigned yet.
        // we can assigned varibles in two times->
        // a) in the time of declaration [Ex: int a = 10]
        // b) after the declaration [Ex: int a ;
        // a = 10]

        a = 10 ; // here we do initalization after declaration.


        // int 10 ; --> it is not allow we have some rule for naming of variable->
        /*
          a. Must not start with any digits.
          b. only character , digits, ans some special character can be used as variables name.
          c. try to maintain a meaningful variables name.
          d. allways try to follow camel case naming[ex:myName]
        */

        System.out.println(a);

    }
}
