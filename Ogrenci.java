import java.util.Random;
public class Ogrenci
{
    int Almanca,Matematik;
    float Ortalama;
    String OgrenciAdi;
    public int Uret(int Aralik)
    {
        Random uret = new Random();
        return uret.nextInt(++Aralik);
    }

    public Ogrenci(int no)
    {   Almanca=Uret(6);
        Matematik=Uret(6);
        OgrenciAdi="OGRENCİ "+no ;
        Ortalama=(Almanca+Matematik)/2;
    }
    public Ogrenci()
    {   Almanca=Uret(6);
        Matematik=Uret(6);
        OgrenciAdi="OGRENCİ ";
    }

}
