public class JAVATEST0003_VaishnaviRaut{
public static void main(String[] args){
    int n = 6;

        for (int i = 1; i <= n; i++) {

            int num = i % 2;  // starting value for each row

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 0) ? 1 : 0; // toggle between 0 and 1
            }

            System.out.println();
        }
    }
}