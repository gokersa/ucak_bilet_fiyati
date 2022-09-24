import java.util.Scanner;


public class ucak_bileti_fiyat_hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanılacak değerleri tanımlandı. Karşımıza küsüratlı değerler çıkacağı için double seçildi
        double ucret, yolculukTipi, yas, yasIndirimi, ucretIndirimli, gdIndirimi, totalUcret, mesafe;
        //Kullanıcıdan talep edilecek değerleri giriniz
        System.out.print("Tek yön bilet almak için 1'i, Gidiş gönüş bilet almak için 2'yi tuşlayınız:");
        yolculukTipi = input.nextDouble();

        System.out.print("Ne kadar mesafe gideceğinizi giriniz:");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz:");
        yas = input.nextDouble();

        // yaşa göre koşul tipleri oluşturuldu. Çünkü indirimi sağlayan ana girdi yaş bilgisi
        if (yas<12) {

            if (yolculukTipi==1) {

                ucret = mesafe * 0.1;
                yasIndirimi = ucret * 0.5;
                ucretIndirimli = ucret - yasIndirimi;

                System.out.print("Ödeyeceğiniz tutar: " + ucretIndirimli);
                }
            else if (yolculukTipi==2) {

                ucret = mesafe * 0.1;
                yasIndirimi = ucret * 0.5;
                ucretIndirimli = ucret - yasIndirimi;
                gdIndirimi = ucretIndirimli * 0.2;
                totalUcret = (ucretIndirimli-gdIndirimi);

                System.out.print("Ödeyeceğiniz tutar:" + totalUcret);

                }

            }
        else if (yas>=12 && yas<=24){
            if (yolculukTipi==1) {

                ucret = mesafe * 0.1;
                yasIndirimi = ucret * 0.5;
                ucretIndirimli = ucret - yasIndirimi;

                System.out.print("Ödeyeceğiniz tutar: " + ucretIndirimli);
            }
            else if (yolculukTipi==2) {

                ucret = mesafe * 0.1;
                yasIndirimi = ucret * 0.5;
                ucretIndirimli = ucret - yasIndirimi;
                gdIndirimi = ucretIndirimli * 0.2;
                totalUcret = (ucretIndirimli-gdIndirimi);

                System.out.print("Ödeyeceğiniz tutar:" + totalUcret);

            }

            }
        else if (yas>65){
            if (yolculukTipi==1) {

                ucret = mesafe * 0.1;
                yasIndirimi = ucret * 0.5;
                ucretIndirimli = ucret - yasIndirimi;

                System.out.print("Ödeyeceğiniz tutar: " + ucretIndirimli);
            }
            else if (yolculukTipi==2) {

                ucret = mesafe * 0.1;
                yasIndirimi = ucret * 0.5;
                ucretIndirimli = ucret - yasIndirimi;
                gdIndirimi = ucretIndirimli * 0.2;
                totalUcret = (ucretIndirimli-gdIndirimi);

                System.out.print("Ödeyeceğiniz tutar:" + totalUcret);

        }
        }
        // Yolculuk tipi ve negatif değer ihtimallerine karşı hatalı giriş değeri belirlenecek
        if (!(yolculukTipi==1) || !(yolculukTipi==2)) {

            System.out.print("Hatalı giriş yaptınız");
        }
        else if (mesafe<0 && yas<0) {
            System.out.print("Hatalı giriş yaptınız");
        }

    }
    }