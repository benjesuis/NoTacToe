class Board {
  public static void main(String[] args) {
    int size = 3;
    boolean three = false;
    int board[][] = {
      {0,1,1},
      {1,1,0},
      {1,0,1}
    };

    int counter = 0;
    for (int i = 0; i < size; i++) {
      if (board[i][0] == 1) {
        for (int j = 0; j < size; j++) {
          if (board[i][j] == 1) {
            counter++;
            if (counter > 2) {
              three = true;
            }
          }
        }
        counter = 0;
      }
    }

    counter = 0;
    for (int i = 0; i < size; i++) {
      if (board[0][i] == 1) {
        for (int j = 0; j < size; j++) {
          if (board[j][i] == 1) {
            counter++;
            if (counter > 2) {
              three = true;
            }
          }
        }
        counter = 0;
      }
    }

    if (board[0][0] == 1 &&
        board[1][1] == 1 &&
        board[2][2] == 1) {
          three = true;
    } else if (board[2][0] == 1 &&
               board[1][1] == 1 &&
               board[0][2] == 1) {
                 three = true;
    }

    if (three) {
      System.out.println("Three in a row");
    } else {
      System.out.println("Not quite");
    }
  }
}
