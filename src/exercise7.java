/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x=0;
        int y=0;
        double squareM=0;
        int squareF=0;
        System.out.println("What is the length of the room in feet?");
        x= kb.nextInt();
        System.out.println("What is the width of the room in feet?");
        y= kb.nextInt();
        System.out.println("You entered dimensions of "+x+" feet by "+y+" feet.");
        System.out.println("The area is");
        squareF=x*y;
        squareM=(x*y)*0.09290304;
        System.out.println(squareF+" square feet");
        System.out.println(squareM+" square meters");
    }
}
