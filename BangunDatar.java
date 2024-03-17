public class BangunDatar {
    private int p,l,s;
    // overloading kontraktor 
    BangunDatar(int s) {
        this.s = s;
    }

    BangunDatar (int p, int l){
        this.p = p;
        this.l = l;
    }

    void setBangunDatar(int s){
        this.s = s;
    }

    void setBangunDatar( int p, int l){
        this.p = p;
        this.l = l;
    }
    int gets(){
        return s;
    }

    int getP(){
        return p;
    }
    int getL(){
        return l;
    }

    void info(){
        System.out.println("sisi : " + gets());
        System.out.println("panjang :" + gets());
        System.out.println("lebar:  " + gets());
    }
    
    }

