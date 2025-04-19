import java.util.Scanner;

public class array {

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = new int[5];

        //Get
        System.out.println(arr1[1]);

        //Set
        arr1[1] = 20;
        System.out.println(arr1[1]);

        //Length
        System.out.println(arr1.length);

        //Traverse
        for (int i=0;i<arr1.length;i++){

        }

        // Sum of an Array

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        //main logic

        int sum = 0;
        for(int i=0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
