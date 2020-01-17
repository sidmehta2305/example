import java.util.Scanner;
import java.util.Random;

class BubbleSort{

    public static void main(String args[]){
    int n;    
    Random r = new Random();
    Scanner sc = new Scanner(System.in); 
   
    System.out.println("Enter Number of elements");
    n = sc.nextInt();
    int a[] = new int[n];

    for(int i =0;i<n;i++){
        a[i] = r.nextInt(100000);
    }

    System.out.println("Before Sorting");

    for(int i =0;i<n;i++){
        System.out.println(a[i]);
    }
 
 
    a = bubbleSort(a);

    System.out.println("after Sorting");

    for(int i =0;i<n;i++){
        System.out.println(a[i]);
    }
    sc.close();
    }

    static int[] bubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
        
            for(int j=0;j<a.length-i-1;j++){
                if(a[j+1] < a[j]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
             }
            }
        }
    return a;
    }
}
