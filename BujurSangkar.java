public class BujurSangkar extends BangunDatar {

    BujurSangkar (int s) {
    super(s);
    }

    int getLuas() {
        int s = super.gets() ;
        return s*s;
    }

    int getsKeliling (){
        int s = super.gets() ;
        return 4 *s;
    }

    public String toString(){
        return "Luas" + getLuas()+ "\n" + "keliling :" + getsKeliling();
    }
    void info(){
        System.out.println(" sisi Bujur Sangkar :"+ super.gets());
    }
}

