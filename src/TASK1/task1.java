//TASK1:NUMBER GUESSING GAME 
//SONAL GHINAIYA

package TASK1;

import java.util.*;
import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int lowerRange = 1;
        int upperRange = 100;
        int no = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
        int attempts = 0;
        int maxAttempts = 10; 
        int score = 0;
        
        System.out.println("------------------------------NUMBER GUESS GAME------------------------------");
        System.out.println("I've selected a random number between " + lowerRange + " And " + upperRange + " Try to guess Between them...");
        System.out.println("-----------------------------------------------------------------------------");
        
        while (attempts < maxAttempts) 
        {
            System.out.print("\nEnter your guess Number: ");
            int userGuess = sc.nextInt();
            attempts++;
            
            if (userGuess == no)
            {
                System.out.println("Yeah Congratulations! You guess the number After:" + attempts + " Attempts");
                score =score+ (maxAttempts - attempts + 1); 
                break;
            } 
            else if (userGuess < no)
            {
                System.out.println("Please Try a higher number...");
            } 
            else 
            {
                System.out.println("Please Try a lower number...");
            }
        }
        
        System.out.println("Game over! Your Total Score is: " + score);
        
        System.out.println("Thank For Playing");
    }
}

