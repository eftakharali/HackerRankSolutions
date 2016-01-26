/* 
An array is a series of elements of the same type placed in contiguous memory locations that can be individually referenced by adding an index to a unique identifier.
You'll be given an array of N integers, and you have to print the integers in reverse order.

Input Format
The first line of input contains N, the number of integers. The next line contains N integers separated by a space.
Constraints
1<=N<=1000
1<=Ai<=10000, where Ai is the ith integer in the array.

Output Format
Print the N integers of the array in the reverse order on a single line separated by single spaces.

Sample Input

4
1 4 3 2
Sample Output

2 3 4 1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i = n-1; i>=0 ;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
