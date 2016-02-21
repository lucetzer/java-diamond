/**
 * Created by lucetzer on 15/02/2016.
 */
public class Isosceles {
  int lines;

  Isosceles(int n) {
    lines = n;
  }

  public void isoscelesPrint() {
    for (int i = 1; i <= lines+i/2; i += 2) {
      for (int k = 1; k < lines-i/2; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j<i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    new Isosceles(5).isoscelesPrint();
  }
}

