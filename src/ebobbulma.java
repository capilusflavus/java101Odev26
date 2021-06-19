import java.util.Scanner;

public class ebobbulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1  sayısını giriniz : ");
        int n1=scanner.nextInt();
        System.out.print("n2 sayısınız giriniz : ");
        int n2=scanner.nextInt();
        int i=1;
          do {
              if(i%n1==0 && i%n2==0){
                  System.out.println(i);
                  break;
              }
              i++;
          }
          while (i<=n1*n2);
    }
}