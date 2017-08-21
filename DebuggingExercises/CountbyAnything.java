import java.util.Scanner;

/**
 * Created by jc260799 on 21/08/17.
 */
public class CountbyAnything {
    public static void main(String[] args) {
        int a = 0;
        int count = 10;
        int intival;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to count up by");
        intival = input.nextInt();

        while (a <= 300){
            if (a > count) {
                System.out.println();
                count = count + 10;
            }
            System.out.print(a + " ");
            a = a + intival;


        }
    }
}
