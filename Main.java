import java.util.Scanner;
public class Main {
    public void  Main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalişanlar programina hoşgeldiniz..");

        String islemler = "Islemler\n"
                +"1.Yazilimci Islemleri\n"
                +"2.Yonetici Islemleri\n"
                +"Cikis icin q'ya basiniz";
        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");

        while(true)
        {
            System.out.println("Islemi seciniz");
            String islem = scanner.nextLine();

            if(islem.equals("q"))
            {
                System.out.println("Programdan cikiliyor");
                break;
            }
            else if(islem.equals("1"))
            {
                Yazilimci yazilimci = new Yazilimci("Vuslat","Sena",2313,"Java");
                String yazilimciIslem = "1.Format at\n"
                        +"2.Bilgileri Goster\n"
                        +"Cikis icin q'ya basiniz";
                while(true)
                {
                    System.out.println("Islemi seciniz");
                    String y_islem= scanner.nextLine();

                    if (y_islem.equals("q"))
                    {
                        System.out.println("Cikis yapiliyor, lutfen bekleyiniz");
                        break;
                    }
                    else if(y_islem.equals("1"))
                    {
                        System.out.println("Isletim Sistemi");
                        String isletim_sistemi= scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yazilimci.bilgileriGoster();
                    }
                    else
                    {
                        System.out.println("Gecersiz yazilimci islemi");
                    }
                }
            }
            else if(islem.equals("2"))
            {
                Yonetici yonetici = new Yonetici("Serhat","Yildiz",123,10);
                String yonetici_islem = "Yonetici Islemleri\n"
                        +"1. Zam Yap\n"
                        +"2.Bilgileri Goster\n"
                        +"3.Cikis icin q'ya basiniz";
                System.out.println(yonetici_islem);

                while(true)
                {
                    System.out.println("Islem seciniz");
                    String y_islem = scanner.nextLine();

                    if(y_islem.equals("q"))
                    {
                        System.out.println("Yönetici islemlerinden yapiliyor");
                        break;
                    }
                    else if(y_islem.equals("1"))
                    {
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz? : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if(y_islem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }
                    else
                    {
                        System.out.println("Gecersiz yonetici islemi");
                    }
                }
            }
            else
            {
                System.out.println("Gecersiz islem");
            }
        }
    }
}
