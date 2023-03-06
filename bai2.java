import java.util.Scanner;

public class bai2{
	public static void main(String[] args) {
	int number;
	System.out.println("Nhập số : ");
	Scanner scanner = new Scanner(System.in);
	number = scanner.nextInt();
	if(number % 2 == 0) {
		System.out.println("Số chẵn");
	}else {
		System.out.println("Số lẻ");
		}
	}
}