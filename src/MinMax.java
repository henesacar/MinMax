import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 1, high = 0, low = 0,count;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int data = scn.nextInt();
       for(int i=1;i<=data;i++){
            System.out.print(i+ ". sayıyı giriniz.");
            count = scn.nextInt();
            if(i == 1){
                high = count;
                low = count;
            }
            if (count > high) {
                high = count;
            }
            if (count < low) {
                low = count;
            }
        }
        System.out.println("Girilen en büyük sayı: " +high);
        System.out.println("Girilen en küçük sayı: " +low);
    }
}
