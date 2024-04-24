package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
  Random random = new Random();

  public void playGame() {
    Scanner scanner = new Scanner(System.in);
    int points = 10;
    int current_points = points;
    boolean keepPlaying = true;
    String decision;

    while (keepPlaying) {
      System.out.println("Current points:" + current_points);
      System.out.println("Wanna keep playing?");
      decision = scanner.nextLine();
      switch (decision) {
        case "yes":
          if(gamble()){
            current_points *= 2;
          }else{
            current_points *= 0;
          }
          break;
        case "no":
          keepPlaying = false;
          break;
        default:
          keepPlaying = false;
          break;
      }

    }

    System.out.println("Points remaining:" + current_points);
  }

  private boolean gamble() {
    return this.random.nextInt(2) == 0;
  }

}