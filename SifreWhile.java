import java.util.Scanner;
public class SifreWhile {
    public static void main(String[] args) {

        // Değişkenlerin tanımlanması.

        int sifre;
        boolean isSifreDogru=false;

        // Şifre girilmesi, girilen şifrenin karşılaştırılması ve doğeu değilse programın sonlandırılması.

        Scanner input=new Scanner(System.in);

        while (!isSifreDogru){
            System.out.print("Şifrenizi giriniz: ");
            sifre = input.nextInt();

            if(sifre ==123) {
                System.out.println("Şifreyi doğru girdiniz.");
                isSifreDogru = true;
                }
                else
                {
                    System.out.println("Şifrenizi yanlış girdiniz!Lütfen tekrar deneyiniz.");
                }
            }
        }
    }
