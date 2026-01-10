import java.util.*;

public class B_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        // f(n) = a1 * n + a0
        // g(n) = n
        // f(n) <= c*g(n) 을 만족해야 함.

        int f = a1 * n0 + a0;

        if(c - a1 > 0) {
            if(f <= c*n0) System.out.println(1);
            else System.out.println(0);
        } else if(c - a1 == 0) {
            if(a0 <= 0) System.out.println(1);
            else System.out.println(0);
        } else System.out.println(0);

        // System.out.println((c > a1 && f <= c*n0) || (c == a1 && a0 <= 0) ? 1 : 0);
    }
}
