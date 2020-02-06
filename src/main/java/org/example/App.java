package org.example;

import org.example.Sweet.*;
import org.example.NewYearGift.*;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Children Number: ");
        int studentNumber = sc.nextInt();

        System.out.println("Candy weight: ");
        int weightOfCandy = sc.nextInt();

        System.out.println("Chocolate weight: ");
        int weightOfChocolate = sc.nextInt();

        System.out.println("Student name with candies and choc : ");

        int choc[] = new int[studentNumber];
        int can[] = new int[studentNumber];

        String studentNames[] = new String[studentNumber];

        for ( int i = 0 ; i < studentNumber ; i++ )
        {
            studentNames[i] = sc.next();
            can[i] = sc.nextInt();
            choc[i] = sc.nextInt();
        }

        Sweet candy = new Candy (weightOfCandy, studentNumber, can, studentNames);
        Sweet chocolate = new Chocolates (weightOfChocolate, studentNumber, choc, studentNames);

        candy.displayEverything();

        chocolate.displayEverything();

        int choco[] = new int[studentNumber];
        int cand[] = new int[studentNumber];

        choco = chocolate.getArray();
        cand = candy.getArray();

        chocolate.sortArray();
        candy.sortArray();

        NewYearGift gifts = new NewYearGift(studentNames, choco, cand);

        gifts.displayEverything();

    }
}