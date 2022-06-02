//name Rajveersingh 
//Student id Rajveersingh

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 * step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class cardtrick {
    public Random R = new Random();

    public int Roll() {
        return R.nextInt((13));
    }

    public String cards() {
        String[] SUITS = { "diamonds", "clubs", "spades", "hearts" };
        Random z = new Random();
        int w = z.nextInt(SUITS.length);
        return SUITS[w];

    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cardtrick main = new cardtrick();
        Card[] magicHand = new Card[7]; // Array of object
        int i = 0;
        int g = 0;
        String [] q = new String [7];
        int[] p = new int[7];
        String[] j = new String[7];

        for (i = 0; i < j.length; i++) {
            Card c1 = new Card();
            c1.setValue(main.Roll() + 1);// use a method to generate random *13
            c1.setSuits(main.cards());// random method suit
            p[i] = c1.getValue();

            j[i] = c1.getSuits();

        }
        for ( i =0; i< 7 ; i++){
            q[i]=String.valueOf(p[i]);
        }
        // step 2:take input
        System.out.print(Arrays.toString(p));
        System.out.print(Arrays.toString(j));
        Scanner input = new Scanner(System.in);
        //String f = Integer.toString(p[i]);
        System.out.print("enter the number of card ");
        String k = input.nextLine();
        System.out.print("enter the  suit ");
        String y = input.nextLine();
        int s= 0;
        int l=0;
        for(i=0; i<=7 ; i++){
      s = Arrays.binarySearch(q , k);
        l = Arrays.binarySearch(j, y);}
        if (s >= 0 && l >= 0) {
            System.out.print("enter the suit and card no ");
        } else {
            System.out.print("not found");
        }

        // step 3: match with array
    }

}
