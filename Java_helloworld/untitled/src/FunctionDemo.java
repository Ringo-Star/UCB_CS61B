public class FunctionDemo {
    // public static void main(String[] args) {
    public  static  int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(5, 6));
    }
}

/**
 * BASIC RULES
 1. All code in Java must be part of a CLASS.
    [That's how Java is designed to organise large software projects]
 2. Delimit the beginning and end of code with "{}"
 3. All statements are ended with ";"
 4. To run a code we need ""public static void main(String[] args)""

 * VARIABLE of JAVA
 1. Before Java variables are used, they must be declared and can not be changed.
 2. Type of variables are verified before the code runs, if there are issues the code will not compile.

 * FUNCTION
 1. A way to define function in Java: public static [type of return] func([arguments]) {[function statements]}
    Argument type and return type are required.
 2. functions must be INCLUDED in a CLASS of the code.[FOR NOW]
 **/