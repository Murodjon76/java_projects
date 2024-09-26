import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner numb = new Scanner(System.in);
       System.out.print("Введите число: ");
       int num=numb.nextInt();
       System.out.printf("Фактариал числа %d = %d",num,Factorial.main(num));
//       for (int i = 1; i <=100 ; i++) {
//           boolean j=PrintEvenNums.main(i);
//           if (j == true) {
//               System.out.println(i);

//           }
//       }
   }
}
