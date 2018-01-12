package hu.nyirszikszi.penzvalto;

public class Penzvalto {
    private int penz;

    public Penzvalto(int penz) {
        this.penz = penz;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    public int db(int penz, int cimlet) {
        return penz / cimlet;
    }

    public void felvalt(int[] cimletek) {
        String eredmeny = "bent van:\t" + getPenz() + "\n";

        for (int cimlet : cimletek) {
            if(this.penz / cimlet != 0 && (cimlet==5000 || cimlet==2000 || cimlet==1000 || cimlet==500)) {
                int db = 0;
                //db = this.penz / cimlet;
                db = db(this.penz, cimlet);
                this.penz -= db * cimlet;
                eredmeny += db + "\t*\t" + cimlet + "\nbent van:\t" + getPenz() + "\n";
            }
            else {
                eredmeny += cimlet + " címletet nem lehet kikérni\n";
            }
        }

        System.out.println(eredmeny);
    }
}