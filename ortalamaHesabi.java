import java.util.Scanner;
public class ortalamaHesabi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int math,turkish,fiz,kim,music,ort;

        System.out.println("Matematik Notunuzu Giriniz: ");
        math=input.nextInt();
        if(math>=0 && math<=100){

            System.out.println("Türkçe Notunuzu Giriniz: ");
            turkish=input.nextInt();

            if (turkish>=0 && turkish<=100){

                System.out.println("Fizik Notunuzu Giriniz ");
                fiz= input.nextInt();

                if (fiz>=0 && fiz<=100){

                    System.out.println("Kimya Notunuzu Giriniz : ");
                    kim= input.nextInt();

                    if (kim>=0 && kim<=100){

                        System.out.println("Müzik Notunuzu Giriniz ");
                        music= input.nextInt();

                        if (music>0 && music<=100){

                            ort=(math+fiz+kim+turkish+music)/5;
                            System.out.println("Ortalamanız: "+ort );

                            if(ort<55){

                                System.out.println("Dersi Geçemediniz ");

                            }
                            else {

                                System.out.println("Tebrikler Dersi Geçtiniz");
                            }
                        }
                        else {

                            System.out.println("Geçerli Bir Not Giriniz");
                        }
                    }
                    else {

                        System.out.println("Geçerli Bir Not Giriniz");
                    }
                }
                else {

                    System.out.println("Geçerli Bir Not Giriniz");

                }
            }
            else {

                System.out.println("Geçerli Bir Not Giriniz");
            }
        }
        else {

            System.out.println("Geçerli Bir Not Giriniz ");
        }



















    }
}