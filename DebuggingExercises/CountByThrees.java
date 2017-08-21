/**
 * Created by jc260799 on 21/08/17.
 */
public class CountByThrees {
    public static void main(String[] args) {
        int a = 0;
        int count = 30;
        while (a != 300){
            a = a + 3;
            System.out.print(a + " ");
            if (a == count){
                System.out.println();
                count = count + 30;
            }
        }
    }
}
