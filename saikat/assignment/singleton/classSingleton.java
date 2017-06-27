package saikat.assignment.singleton;

/**
 * Created by zemoso on 27/6/17.
 */
public class classSingleton {

    String s;

    public static classSingleton initialize(String s){
        classSingleton singleton=new classSingleton();
        singleton.s=s;
        return singleton;
    }

    public void printString(){
        System.out.println(s);
    }
}
