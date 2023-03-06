import java.util.Scanner;

public class bai3{
	public static void main(String[] args) {
		String name = new String();
		int age;
		System.out.println("Họ và tên của bạn: ");
		Scanner scanner= new Scanner(System.in);
		name = scanner.nextLine();
		System.out.println("Bạn bao nhiêu tuổ?");
		age = scanner.nextInt();
		if(age < 16) {
			System.out.println("Bạn "+ name + " ở độ tuổi vị thành niên!");
		}else if(age >= 16 && age < 18) {
			System.out.println("Bạn "+ name + " ở độ tuổi trưởng thành!");
		}else {
			System.out.println("Bạn "+ name + " đã già!");
		}
	}
}