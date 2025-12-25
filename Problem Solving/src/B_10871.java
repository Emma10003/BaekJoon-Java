import java.util.*;

public class B_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] numArray = new int[n];

        for(int i=0; i<n; i++) {
            numArray[i] = sc.nextInt();
            if(numArray[i] < x) System.out.println(numArray[i]);
        }
    }
}
