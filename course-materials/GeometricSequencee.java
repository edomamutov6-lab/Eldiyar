
package W4;
import java.util.Scanner;

public class GeometricSequencee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        if ((n < 1) || (n > 50)) {
            System.out.println("n must be between 1 and 50");
            return;
        }
        for (int i = 0; i < n; i++) {
            if(i > 0) {
                System.out.print(" ");
            }
            System.out.print(a + i * b);
        }
        System.out.println();
    }
}
