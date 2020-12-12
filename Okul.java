import java.util.Random;

public class Okul
{static int OgrenciSay; static float yuksek=0,dusuk=0;

    public static void main(String[] args)
    {
        Random uret = new Random();
        OgrenciSay= uret.nextInt(51);
        Ogrenci[] Liste = new Ogrenci[ OgrenciSay ];
     for (int i=0;i<OgrenciSay;i++)
        {
            Ogrenci aa =new Ogrenci(i);
             Liste[i]= aa;
            if (aa.Ortalama>=yuksek) yuksek=aa.Ortalama;
            if (aa.Ortalama<=dusuk) dusuk=aa.Ortalama;
            if (2>aa.Ortalama)
            {
                System.out.print ("Kalan Ogrenci isim.....:"+aa.OgrenciAdi);
                System.out.print ("  Matematik.....:"+aa.Matematik);
                System.out.print("  Almanca.....:"+ aa.Almanca);
                System.out.println("  Ortalama....."+ aa.Ortalama);
            }
      }
        for (int i=0;i<OgrenciSay;i++)
        {Ogrenci aa =new Ogrenci(i);
            aa= Liste[i];
            if (yuksek<=aa.Ortalama)
            {
                System.out.print ("yüksek not alan isim.....:"+aa.OgrenciAdi);
                System.out.print ("  Matematik.....:"+aa.Matematik);
                System.out.print("  Almanca.....:"+ aa.Almanca);
                System.out.println("  Ortalama....."+ aa.Ortalama);
            }
        }
            for (int i=0;i<OgrenciSay;i++)
            {Ogrenci aa =new Ogrenci(i);
                aa= Liste[i];
            if (dusuk>=aa.Ortalama)
            {
                System.out.print ("düşük not olan isim.....:"+aa.OgrenciAdi);
                System.out.print ("  Matematik.....:"+aa.Matematik);
                System.out.print("  Almanca.....:"+ aa.Almanca);
                System.out.println("  Ortalama....."+ aa.Ortalama);
            }
        }
    }
}