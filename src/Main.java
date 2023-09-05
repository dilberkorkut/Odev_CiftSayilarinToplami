import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar
        kullanıcıdan girişleri kabul eden ve girilen
        değerlerden çift ve 4'ün katları olan sayıları
        toplayıp ekrana basan programı yazıyoruz.
        */

        int n;
        int toplam = 0;
        ;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz: ");
            n = input.nextInt();
            if( n % 2 == 0 && n % 4 == 0) {
                toplam += n;
            }else if(n%2 != 0){
                break;
            }

        } while(n>0);
        System.out.println("Toplam : " +toplam);
    }
}