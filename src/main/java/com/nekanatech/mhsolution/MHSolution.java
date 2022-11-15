/*
 * A simple simulation to test the Monty Hall problem
 * Ported by A. S. "Aleksey" Ahmann <alexander.ahmann@outlook.com>
 * ... after Vaughan (2018, pp. 221-222)
*/

package com.nekanatech.mhsolution;

import java.io.*;
import java.util.*;

/**
 *
 * @author A. S. "Aleksey" Ahmann
 */
public class MHSolution {

    public static void main(String[] args) {
        Scanner inputMechanism = new Scanner(System.in);
        System.out.println("A simple simulation to test the Monty Hall problem");
        System.out.println("Ported by A. S. \"Aleksey\" Ahmann <hackermaneia@riseup.net>");
        System.out.println(" ... ported from Vaughan (2018 pp. 221-222)\n");
        System.out.print("Number of trials to run: ");
        int totalTrials = inputMechanism.nextInt();
        inputMechanism.close();
        
        Random random = new Random();
        
        int stayWins = 0;
        int switchWins = 0;
        char[] doors = {'a', 'b', 'c'};
        
        for (int trial = 0; trial < totalTrials; trial++) {
            int winner = doors[random.nextInt(3)];
            int pick = doors[random.nextInt(3)];
            if (pick == winner)
                stayWins++;
            else
                switchWins++;
        }
        
        float stayProbability = (float)stayWins / ((float)stayWins + (float)switchWins);
        float switchProbability = (float)switchWins / ((float)stayWins + (float)switchWins);
        
        System.out.printf("\nIf not switching doors, the number of times winning is %d and the probability of winning is %.2f per cent\n",
                stayWins, stayProbability * 100);
        System.out.printf("If switching doors, the number of times winning is %d and the probability of winning is %.2f per cent\n",
                switchWins, switchProbability * 100);
    }
    
}
