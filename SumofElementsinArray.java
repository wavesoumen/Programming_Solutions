import java.util.*;
public class SumofElementsinArray {
    public static int[] intToArray(int num) {
        String numStr = Integer.toString(num);
        int[] arr = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            arr[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return arr;
    }

    static int[] solution(int[] arr, int n){
        int[] resAns = new int[n];
        for(int i=0; i<arr.length; i++){
            int arr1[] = intToArray(arr[i]);
            int ss= Arrays.stream(arr1).sum();
            resAns[i] = ss;
        }
        return resAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = {12, 24,30};
        int n=3;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(solution(arr, n)));

    }
}