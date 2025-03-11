//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    public static int maxProduct(int[] arr) {  
        if (arr == null || arr.length == 0) return 0;

        int maxProd = arr[0], minProd = arr[0], result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(arr[i], arr[i] * maxProd);
            minProd = Math.min(arr[i], arr[i] * minProd);
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {-2, 6, -3, -10, 0, 2};
        int[] arr2 = {-1, -3, -10, 0, 6};
        int[] arr3 = {2, 3, 4};

        System.out.println(maxProduct(arr1)); 
        System.out.println(maxProduct(arr2)); 
        System.out.println(maxProduct(arr3));
    }
}