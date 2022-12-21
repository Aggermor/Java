/* https://open.kattis.com/problems/quadrant
A common problem in mathematics is to determine which quadrant a given point lies in. There are four quadrants, numbered from  to , as shown in the diagram below:

\includegraphics[width=0.5\textwidth ]{quadrant.png}
For example, the point , which is at coordinates  lies in quadrant  since both its  and  values are positive, and point  lies in quadrant 2 since its  value is negative and its  value is positive.

Your job is to take a point and determine the quadrant it is in. You can assume that neither of the two coordinates will be. */

import java.util.Scanner;

class QuadrantSelector {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = Integer.parseInt(scan.nextLine());
    int y = Integer.parseInt(scan.nextLine());

    if (x < 0 && y < 0) {
      System.out.println("1");
    } else if (x > 0 && y < 0) {
      System.out.println("2");
    } else if (x > 0 && y > 0) {
      System.out.println("3");
    } else if (x < 0 && y > 0) {
      System.out.println("4");
    } else if (x == 0 || y == 0) {
      System.out.println("Input cannot be 0.");
    } else {
      System.out.println("Input must be an integer and cannot be 0.");
    }

    /*
     * Can I use break; or continue; in the if() to save runtime?
     */
  }
}