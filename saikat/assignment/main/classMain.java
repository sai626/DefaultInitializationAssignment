package saikat.assignment.main;

/**
 * Created by zemoso on 27/6/17.
 */

import saikat.assignment.data.*;
import saikat.assignment.singleton.*;

public class classMain {

    public void mainRun(){
        classData data=new classData();
        data.printMemberVariables();
        //data.printLocalVaribles();

        classSingleton singleton=classSingleton.initialize("Arbitrary string");
        singleton.printString();
    }
}
