public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("sabiha gökçen havalimanıan hoşgelnizi...");

        String sartlar = "yurdışı çıkış kuralları...\n"
                        + "herhanhi bir siyasi yasağınız bulunmaması gerekiyor ...\n"
                        +"15 tl harç bedelinizi tam olarak yatırmanız gerekiyor\n"
                        +"gideceğiniz ülketye vizenizin bulunması gerekiyor";
        String mesaj = "yurtdisi sartlarından hepsini sağlamanız gerekiyor";

        while(true) {
            System.out.println("***********************");
       //     System.out.println(mesaj);
            System.out.println("***********************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();

            System.out.println("harc bedeli kontrol ediliyor...");

            Thread.sleep(3000);
            if (yolcu.yurtDisiHarciKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }
       //     else{
                System.out.println("siyasi yasak kontrol ediliyor...");
                Thread.sleep(3000);

         //   }
            if (yolcu.siyasiYasakKontrol() == true){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol() == false){
                System.out.println(mesaj);
        //        Thread.sleep(3000);
                continue;
             }
            System.out.println("islemleriniz tamam yurtdışına çıkabilirsiniz...");
            break;
        }
    }
}