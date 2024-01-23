import java.util.Scanner;

public abstract class makanan{
    Scanner scan = new Scanner(System.in);
public int jenisMakanan(){
    int harga=0;
    System.out.println("Tuliaskan Pilihan : (fried rice/potato)");
   String pilihan=scan.nextLine();
        switch (pilihan) {
            case "fried rice" :harga=20000;
                 break;
            case "fried potato" : harga=15000;
                 break;
        
            default:harga=0;
                break;
        }
        return harga;
    }
    public abstract void tampilkanJenis (String jenis);
}

