/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays1;

/**
 *
 * @author morris
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //my array K
        int [] K = {3, 5, 4, 1};
        
        int n = getGreatestInteger(K);
        
        //get the missing number in the integer
        int missingInteger = getMissingNumber(n, K);
        
        System.out.println(missingInteger);
       
    }
    
    public static int getGreatestInteger (int [] K) {
        int n = 0;
        
        for (int i = 0; i < K.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (K[j] > i+1) {
                    n = K[j];
                }
            }
        }
        return n;
    }
    
    //the algorithm ti get the missing number in an array
    public static int getMissingNumber (int n, int [] K) {
        //calculate the sum
        int sumAll = (n*(n+1))/2;
        int sumArray = 0;
        
        //iterate to get the sum of the array elements
        for (int i =0; i<=n-2; i++) {
            sumArray = sumArray+K[i];
        }
        
        //funally get the missing number
        int missingNumber = sumAll-sumArray;
        
        return missingNumber;
    }
    
}
