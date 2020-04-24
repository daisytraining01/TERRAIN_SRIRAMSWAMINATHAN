package summercamp_java;
import java.util.Scanner;
interface MyInterface{
   public void display();
   public void display(String name, int age);
}
public class Methodoverloading implements MyInterface{
   String name;
   int age;
   public void display() {
      System.out.println("This is the implementation of the display method");
   }
   public void display(String name, int age) {
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      Methodoverloading obj = new Methodoverloading();
      obj.display();
      obj.display(name, age);
   }
}


/*****************************
 * RESULT****************************** Enter your name: SRIRAM Enter your age:
 * 30 This is the implementation of the display method Name: SRIRAM Age: 30
 ****************************************************************/