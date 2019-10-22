/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesorting;

/**
 *
 * @author mibot3117
 */
public class BubbleSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char n = 10;
        int [] numbers = new int [n];
        int temp = 0;
        final int TOP_LIMIT = 99;
        final int LOW_LIMIT = 1;
        for (int a=0; a<n; a++){
            numbers[a] = (int)Math.round(Math.random()*TOP_LIMIT+1);
            System.out.println(numbers[a]);
        }
        
        for(int i=0; i <n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(numbers[j-1] > numbers[j]){  
                                 //swap elements  
                                 temp = numbers[j-1];  
                                 numbers[j-1] = numbers[j];  
                                 numbers[j] = temp;  
                         }  
                          
                 }  
         }  
        for (int k=0; k <n; k++){
        System.out.println(numbers[k]);
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[n-1]);
    }
    
}
