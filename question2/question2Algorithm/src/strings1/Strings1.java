/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings1;

/**
 *
 * @author morris
 */
public class Strings1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String S = "Lorem at";
        int n = S.length();
        
        int k = 0;
        
        //determine if the string length is odd or even
        if (n % 2 == 0) {
            k = 4;
        } else {
            k = 3;
        }
        
        //function to transform the string
        String transformedString = transformString(S, k, n);
        
        System.out.println(transformedString);
    }
    
    public static String transformString (String S, int k, int n) {
        for (int i = 0; i < n;) {
            if (i + k > n)
                break;
            
            S = S.substring(0, i) + new String(new StringBuilder(
                   S.substring(i, i + k)).reverse()) +
                   S.substring(i + k);
            
            i += k; 
        }
        
        return S;
    }
    
}
