package application;

import chess.ChesMatch;

public class Program {

	public static void main(String[] args) {
	ChesMatch chessmatch = new ChesMatch();
	UI.printBoard(chessmatch.getPieces());
	}

}
