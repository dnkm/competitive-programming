import java.util.*;
import java.io.*;

public class cowtip {

  static int n;
  static int[][] ar;

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(new File("cowtip.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowtip.out")));

    n = in.nextInt();
    ar = new int[n][n];

    for (int i = 0; i < n; i++) {
      String line = in.next(); // 0111
      for (int j = 0; j < n; j++) {
        ar[i][j] = line.charAt(j) - '0'; // '0'
      }
    }
    // ---
    long cnt = 0;

    for (int r = n - 1; r >= 0; r--) {
      for (int c = n - 1; c >= 0; c--) {
        if (ar[r][c] == 1) {
          flip(r, c);
          debug();
          cnt++;
        }
      }
    }

    System.out.println(cnt);
    out.println(cnt);
    out.close();
  }

  private static void flip(int R, int C) {
    for (int r = R; r >= 0; r--) {
      for (int c = C; c >= 0; c--) {
        ar[r][c] = ar[r][c] == 1 ? 0 : 1;
      }
    }
  }

  static void debug() {
    // for (int[] row : ar) {
    // for (int c : row)
    // System.out.print(c);
    // System.out.println("");
    // }
    // System.out.println();
  }
}
