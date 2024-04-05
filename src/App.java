import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // int age = 26;
    // String name = "Ngo Dinh Dai";
    // System.out.println("My age is: " + age + ", name is: " + name);
    // System.out.printf("Có %d người đăng kí", 40000);
    
    // Hàm nhập
    Scanner scanner  = new Scanner(System.in);
    System.out.print("Your name is: ");
    String name = scanner.nextLine();
    System.out.print("Your age is: ");
    int age = scanner.nextInt();
    System.out.printf("My name is: %s\n", name);
    System.out.printf("My age is: %d", age);
    scanner.close();
  }
}
