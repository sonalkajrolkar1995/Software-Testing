package org.example;

public class Variable {
        int c = 2; //Instance Variable
        static int abc = 1; //static variable
        static int u=2;
        public static void main(String[] args){
            int a = 5; //Local Variable. Local to entire main method.
            int x = 0;
            System.out.println(a+2);
            //<className> <ObjectName/Reference Variable Name> = new <className>();
            Variable vs = new Variable();
            System.out.println(vs.y+3); //Accessing an instance variable
            System.out.println(vs.c-1);
            if(a>0){
                int y = 9; //Local Variable. Local to 'if' block only.
                x= 10; //updating value of x
                System.out.println("Value of x: "+x);
                System.out.println("value of y:"+y);
            }
            System.out.println("X is : "+x);git



                    
            System.out.println(" static variable "  +abc); //Accessing Static variable
            System.out.println("static variable is "+u);
//        System.out.println(y); //Cannot access local variable 'y'.
        }
        int y = 6; //Instance Variable
    }

//Instance Variable: Declared inside a class but not inside any method (not even inside main method), loop or conditions. Can be accessed only with an Object.

//Local Variable: Declared inside a class and inside a method (even main method), loops or conditions. Can be accessed without an object.

//Static Variable: Declared just like an Instance Variable but with the Keyword 'static'. No need of Object.

// ADding temp comment to push changes
