import java.util.*;
public class Triangle_Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        int star = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            space++;
            star--;

            System.out.println();
            sc.close();
        }
    }
}
