package com.wesleyreisz.rockpaperscissors.Game;

import android.graphics.Color;
import com.wesleyreisz.rockpaperscissors.R;

import java.util.Random;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    public static final String BEATS = "beats";
    public static final String LOSES_TO = "loses to";
    public static final String TIES = "ties";

    public static Integer getComputerChoice(){

        Random rand = new Random();

        int n = rand.nextInt(3) + 1;
        if(n==1){
            return R.id.btnPaper;
        }else if(n==2){
            return R.id.btnRock;
        }else{
            return R.id.btnScissors;
        }

    }

    public static String evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {
        /*
        R.id.btnRock;
        R.id.btnScissors;
        R.id.btnPaper;
        */



        //TODO: Create some logic to evaluate winner.

      String result = GameUtils.TIES;
      switch(playerSelectedChoice){
        case R.id.btnRock:
          if(computerSelectedChoice == R.id.btnPaper){
            result =  GameUtils.LOSES_TO;
          }
          else if(computerSelectedChoice == R.id.btnScissors){
            result =  GameUtils.BEATS;
          }
          break;
        case R.id.btnScissors:
          if(computerSelectedChoice == R.id.btnRock){
            result =  GameUtils.LOSES_TO;
          }
          else if(computerSelectedChoice == R.id.btnPaper){
            result =  GameUtils.BEATS;
          }
          break;
        case R.id.btnPaper:
          if(computerSelectedChoice == R.id.btnScissors){
            result =  GameUtils.LOSES_TO;
          }
          else if(computerSelectedChoice == R.id.btnRock) {
            result =  GameUtils.BEATS;
          }
          break;
      }

        /*
        These are the constants that should be returned
        GameUtils.BEATS;
        GameUtils.TIES;
        GameUtils.LOSES_TO;
        */
      return result;
    }

    public static Integer convertButtonToImage(Integer buttonChoice) {
        if(buttonChoice==R.id.btnRock){
            return R.drawable.rock;
        }else if (buttonChoice==R.id.btnPaper){
            return R.drawable.paper;
        }else{
            return R.drawable.scissors;
        }
    }

    public static int defineTextColor(String msg) {
        if(GameUtils.LOSES_TO.equalsIgnoreCase(msg)){
            return Color.RED;
        }else if(GameUtils.BEATS.equalsIgnoreCase(msg)){
            return Color.GREEN;
        }else{
            return Color.BLACK;
        }
    }
}

