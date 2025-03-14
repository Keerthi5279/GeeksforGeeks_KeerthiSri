//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        int n = arr.length;
        int element =-1;
        int count =0;
        for(int i =0;i<arr.length;i++){
            //everytime it cancels we will if the number is not equla to the number
            if(count ==0){//so it should assign a value 
                element = arr[i];
                count=1;
            }
            else if(element != arr[i]){
                count--;
            }
            else{
                count++;
            }
            
        }
        count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == element){
                count++;
            }
        }
        
        if(count>n/2){
            return element;
        }
        return -1;
    }
}