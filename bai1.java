import java.util.Scanner;

public class bai1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        
        int Tong = num1 + num2; 
        System.out.println("Tổng = "+ Tong); 
        int Hieu = num1 - num2; 
        System.out.println("Hiệu = " + Hieu);
        int Tich = num1 * num2; 
        System.out.println("Tích = " + Tich);
        float Thuong = (float) num1 / num2; 
        System.out.println("Thương = " + Thuong);
        int PhanDu = num1 % num2; 
        System.out.println("Phần Dư = " + PhanDu);
         
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }
    }
}