//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int minIndex = -1;
        for (int i = arr.length-1; i>0;i--) {
            if (arr[i] > arr[i-1]) {
                minIndex = i-1;
                break;
            }
        }
        if(minIndex == -1) {
            Arrays.sort(arr);
        } else {
        
        int swapIndex = -1;
        int value = Integer.MAX_VALUE;
        for (int i = arr.length-1; i > minIndex;i--) {
            if (arr[i] > arr[minIndex] && arr[i] < value) {
                swapIndex = i;
                value = arr[i];
            }
        }
        int swap = arr[minIndex];
        arr[minIndex] = arr[swapIndex];
        arr[swapIndex] = swap;
        
        Arrays.sort(arr, minIndex + 1, arr.length);
        }
    }
}


//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends