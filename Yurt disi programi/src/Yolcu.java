import java.util.Scanner;

public class Yolcu implements kurallar {

    private boolean vizeDurumu;
    private boolean siyasiYasak;
    private int harc;

    public Yolcu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("yatirdiğiniz harc bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("siyasi yasağiniz bulunuyor mu ? ");

        String cevap = scanner.nextLine();
        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }
        System.out.println("vizeniz bulunuyor mu ? ");

        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }
    }

    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("lutfen harci tam yatirin");
            return false;
        } else {
            System.out.println("yurt disi harci islemi tamamdır");
            return true;
        }
    }

    public boolean siyasiYasakKontrol() {

        if(this.siyasiYasak){
            System.out.println("yurtdışına çıkamazsınız siyasi yasağınız bulunuyor");
            return false;
        }
    else {
            System.out.println("herhangi bir siyasi yasağınız bulunmuyor yurt dışına çıkabilirsiniz mutlu yolculuklar");
        return true;
        }
    }

    public boolean vizeDurumuKontrol() {
        if (vizeDurumu){
            System.out.println("vizeniz onaylanmıştır yurtdışına çıkabilirsiniz");
            return true;
        }
        else {
            System.out.println("vizeniz onaylanmamıştır hiçbir yere gidemezsiniz");
            return false;
        }
    }

}
