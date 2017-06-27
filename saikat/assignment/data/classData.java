package saikat.assignment.data;

/**
 * Created by zemoso on 27/6/17.
 */
public class classData {
    int a;
    char b;

    public void printMemberVariables(){
        System.out.println("int = "+a);
        System.out.println("char = "+b);
    }


    /**
     *Local variables cannot be used unless it has been initialized. So trying to access local variables
     * without initialization causes compiler error. This does not happen with member variables because
     * the compiler provides a default constructor which takes care of the initialization of member variables.
     */

    /*
    public void printLocalVaribles(){
        int c;
        char d;

        System.out.println("int = "+c);
        System.out.println("char = "+d);
    }
    */
}
