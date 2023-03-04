import java.util.Scanner;

public class linearSearchArray {
    public static void main (String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] numbers = new int[size];

            // Input
            for(int i=0; i<size; i++) {
                numbers[i] = sc.nextInt();
            }
 
     int x = sc.nextInt();

            // output 
            // for ( int j=0; j<size; j++)
            for ( int j=0; j<numbers.length; j++) {
                 if(numbers[j] == x){
                    System.out.println(" x: Element fount at index:" + j);
                 }

            }
        }
    }
}

