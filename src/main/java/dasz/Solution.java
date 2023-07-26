package dasz;

public class Solution {

    public static int isSolved(int[][] board) {
        for (int i = 0; i < 3; i++) { //lines and columns
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2])
                    || (board[0][i] == board[1][i] && board[1][i] == board[2][i])) {
                if (board[i][i] != 0) return board[i][i];
            }
        }
        if ((board[1][1] == board[0][0] && board[1][1] == board[2][2]) || (board[1][1] == board[0][2] && board[1][1] == board[2][0])) {
            //diagonals
            if (board[1][1] != 0) return board[1][1];
        }
        for (int i = 0; i < 3; i++) { //empty spaces
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) return -1;
            }
        }
        return 0;
    }
}
