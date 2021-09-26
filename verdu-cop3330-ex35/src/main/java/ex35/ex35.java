package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ex35 {

    public static void main(String[] Args){

          Scanner scanner = new Scanner(System.in);
          Random rand = new Random();

          ArrayList<String> names = new ArrayList<String>();
          int num_names = 0;
          int n = 0;

          while (n == 0){

              System.out.print("Enter a name: ");
              String new_name = scanner.nextLine();
              names.add(new_name);
              num_names += 1;


              if (new_name.equals(" ") || new_name.isEmpty()){
                 n = 1;
                 int random = rand.nextInt(num_names-1);
                 System.out.print("The winner is ... " + names.get(random) + ".");
              }
          }
    }
}
