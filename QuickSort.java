///////////////////////////////////////////////////////////////////////////////
//////////////////////////Program QuickSort////////////////////////////////
/////////////////////////////apiched audomphon/////////////////////////////////
/////////////////////////////////570632089/////////////////////////////////////
package QuickSort;
 import java.util.Scanner; 
 import java.util.ArrayList;

public class QuickSort {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
       int[] input= new int[100];
       for(int i=0;i<input.length;i++){
           input[i]= -1;
       }
        QuickSort sorter = new QuickSort();
    ///////////////////////////////////////////////////////////////////////////
        Scanner Sc = new Scanner(System.in);
        System.out.print("input : ");
        String s = Sc.nextLine();
        String[] name = s.split("\\s");
        
        for(int i=0;i<name.length;i++){
            int in= Integer.parseInt(name[i]);
            input [i]=in; 
        }
    ///////////////////////////////////////////////////////////////////////////    
        sorter.sort(input);
        for(int i:input){
            if(i!=-1){
                  System.out.print(i);
            System.out.print(" ");
            }   
        }
    }
}

