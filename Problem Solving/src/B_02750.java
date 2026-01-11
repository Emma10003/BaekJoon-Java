import java.util.*;

public class B_02750 {
    /*
    
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numArr = new int[N];

        for(int i=0; i<N; i++) {
            numArr[i] = sc.nextInt();
        }

        // 방법 1 : 불리언 배열을 만들어서 최소값을 출력한 뒤에 해당 인덱스의 불리언 배열 원소는 false로 변경하기
        /*
        boolean[] boolArr = new boolean[N];

        for(int i=0; i<N; i++) {
            boolArr[i] = true;
        }
        
        for(int i=0; i<N; i++) {
            int min = 2000;
            int idx = 0;
            for(int j=0; j<N; j++) {
                if(numArr[j] < min && boolArr[j]) {
                    min = numArr[j];
                    idx = j;
                }
            }
            System.out.println(min);
            boolArr[idx] = false;
        }
        */

        // 방법 2 : 한 번 최소값으로 지정된 배열의 원소를 가장 큰 값(2000)으로 변경하여 다음 반복문에서 제외하기.
        /* 
        for(int i=0; i<N; i++) {
            int min = 2000;
            int idx = 0;
            for(int j=0; j<N; j++) {
                if(numArr[j] < min) {
                    min = numArr[j];
                    idx = j;
                }
            }
            System.out.println(min);
            numArr[idx] = 2000;
        }
         */

        // 방법 3 : 버블정렬
        /* 
        for(int i=N-1; i>=0; i--) {
            for(int j=0; j<i; j++) {
                if(numArr[j] > numArr[j+1]) swap(numArr, j, j+1);
            }
        }
        
        for(int i=0; i<numArr.length; i++) {
            System.out.println(numArr[i]);
        }
        */
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
