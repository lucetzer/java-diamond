/**
 * Created by lucetzer on 15/02/2016.
 */
public class Diamond {
  int lines;
  int odd = 1;

  Diamond(int n) {
    lines = n;
  }

  public void diamondPrint() {
    for (int i = 1; i <= lines; i++) {
      for (int k = 0; k < (lines-i); k++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = lines-1; i >= 1; i--) {
      for (int k = 0; k < (lines - i); k++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      for (int j = 1; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    new Diamond(3).diamondPrint();
  }
}
