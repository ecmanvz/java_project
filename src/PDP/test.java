/**
 *
 * @author Ecem Amanvermez 2/B 
				G181210022
					ecem.amanvermez@ogr.sakarya.edu.tr
 * @since 05/03/2019
 * <p>
 * Regular Expression * </p>
 */
package PDP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class test {

     public static boolean eMail(String satir) {
        return satir.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }

    public static boolean webSitesi(String satir) {
        return satir.matches("^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$");
    }

    public static boolean cumleSonu(String satir) {
        if(satir.charAt(satir.length()-1)== '.'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        File icerik = new File("icerik.txt"); //Dosya aciliyor
        BufferedReader oku = new BufferedReader(new InputStreamReader(new FileInputStream(icerik), "ISO-8859-9")); //Turkce karakter tanimlaniyor.
        String satir;
        String metin = "";
        while ((satir = oku.readLine()) != null) {
            metin = metin + satir + " "; //Dosyadaki veriler degiskene aliniyor.
        }

        oku.close();
        String gecici[] = metin.split(" ");//Bosluklar ayriliyor.
        int [] sayimlar = new int[5]; //sayilari tutacak dizi.
        for (int i = 0; i < 5; i++) {
            sayimlar[i] = 0 ;
        }
        for (int i = 0; i < gecici.length; i++) {
          sayimlar[0] = sayimlar[0] + sesliHarf(gecici[i]);
          if(cumleSonu(gecici[i])){
              sayimlar[2]++;
              gecici[i]=gecici[i].substring(0, gecici[i].length()-1); //Sondaki nokta kaldiriliyor.
          }
          if(eMail(gecici[i])){
              sayimlar[3]++;
          }
          if(webSitesi(gecici[i])){
              sayimlar[4]++;
          }
        }
        sayimlar[1] = bosluklar(metin);
        
        System.out.println("Toplam Sesli Harf Sayısı   : " + sayimlar[0]);
        System.out.println("Toplam Kelime Sayısı   : " + sayimlar[1]);
        System.out.println("Toplam Cümle Sayısı   : " + sayimlar[2]);
        System.out.println("Toplam Mail Sayısı   : " + sayimlar[3]);
        System.out.println("Toplam Web Sitesi Sayısı: " + sayimlar[4]);
        
       
    }
    public static int sesliHarf(String satir) {
        String gecici = satir;
        return gecici.replaceAll("(?i)[^aeiouöüÜİ]", "").length();
    }

    public static int bosluklar(String metin) {
        String gecici = metin;
        return gecici.replaceAll("\\S", "").length();
    }
}
