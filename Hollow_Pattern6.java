import java.util.*;
public class Hollow_Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=1;
        int star=n/2+1;

        for (int i=0; i<n; i++){
            for(int j=0; j<star; j++){
                System.out.print("*\t");
            }
            for(int j=1; j<space; j++){
                System.out.print("\t");
            }
            for (int j=0; j<star; j++){
                System.out.print("*\t");
            }
            if(i<n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
            sc.close();
        }
    }
}
