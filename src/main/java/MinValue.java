import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so kich thuoc mang: ");
        int size=sc.nextInt();
        int[]array=new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("Nhap phan tu mang: ");
            array[i]=sc.nextInt();
        }
        int min=array[0];
        for (int j:array){
            if(j<min){
                min=j;
                System.out.println("Gia tri nho nhat trong mang la: "+j);
            }
        }
    }
}
