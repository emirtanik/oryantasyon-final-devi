import java.util.Scanner;

public class sessisss {

    public static int sessizHarfSay(String metin) {

        int sayac = 0;
        metin.toLowerCase();

        String unluler = "aeıiuüoö";

        for (int i = 0; i < metin.length(); i++) {

            char c = metin.charAt(i);

            if (Character.isLetter(c)) {
                if (unluler.indexOf(c) == -1) {
                    sayac++;
                }
            }
        }

        return sayac;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Cümlenizi Giriniz:");
        String metin=input.nextLine();
        //String metin= "emir TANIK best of world";
        int sonuc = sessizHarfSay(metin);

        System.out.println("Sessiz harf sayınız : " + sonuc);
    }
}
