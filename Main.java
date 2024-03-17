import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. BujurSangkar" );
        System.out.println("2. Persegi panjang");
        System.out.println("isikan pilihan");
        int pilihan =sc.nextInt();

        if(pilihan ==1) {
            BujurSangkar bs = new BujurSangkar(4);
            System.out.println (bs);    
        }
        if(pilihan ==2) {
            PersegiPanjang bs = new PersegiPanjang(3,8);
            System.out.println (bs);    
    }
}
}

