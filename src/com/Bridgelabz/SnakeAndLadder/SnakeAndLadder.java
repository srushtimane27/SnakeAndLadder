package com.Bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {
    public static int PLAYER_POSITION = 0;

    public static int rollDie() {
        int dieValue = (int) Math.floor(Math.random() * 10) % 6 + 1;
        return dieValue;
    }

    public static void main(String[] args) {
        int dieValue = rollDie();
        System.out.println(dieValue);

    }
}
