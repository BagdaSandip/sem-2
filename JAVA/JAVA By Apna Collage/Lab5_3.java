import java.util.Scanner;

public class Lab5_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a=sc.nextInt();
        int[] b = new int[a];
        for(int i=0;i<a;i++){
            System.out.print("Enter element " + (i+1) + ": ");
            b[i] = sc.nextInt();
        }
        System.out.print("Enter pivot index");
        int k = sc.nextInt();
        int [] c = new int[a];
        int d=0;
        for(int i=0;i<a;i++){
            if((k+i)>(a-1)){
                break;
            }
            c[i] = b[k+i];
            d++;
        }
        for(int i=0;i<k;i++){
            c[d+i]=b[i];
    }
    for(int i=0;i<a;i++){
        System.out.print(c[i])
      }
}
}