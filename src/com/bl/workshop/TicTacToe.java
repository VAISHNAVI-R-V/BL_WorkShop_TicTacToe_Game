package com.bl.workshop;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game! :)");
        char[] board = new char[10];
        for(int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        System.out.println(board);
    }
}