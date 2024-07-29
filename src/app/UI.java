package app;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces){
        //Percorrendo as linhas
        for (int i = 0; i < pieces.length; i++){
            //Marcação das linhas
            System.out.print((8 - i) + " ");
                //Percorrendo as colunas
                for (int j = 0; j < pieces.length; j++){
                    //Imprimir as peças passando linhas e colunas
                    printPiece(pieces[i][j]);
                }
            //Quebrar a linha depois de todas as peças imprimidas
            System.out.println();
        }
        //No final for imprimir a marcação de colunas
        System.out.println("  a b c d e f g h");
    }
    //Imprimir a peça
    private static void printPiece(ChessPiece piece){
        //Caso a peça for nula imprimir "-", se não imprimir a peça
        if (piece == null){
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        //No final independente da existência, da um espaço entre as peças
        System.out.print(" ");
    }
}
