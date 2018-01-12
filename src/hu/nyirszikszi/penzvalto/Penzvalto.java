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

    public void felvalt() {
        int[] cimletek = {5000, 2000, 1000, 500};
        String eredmeny = "bent van:\t" + getPenz() + "\n";

        for (int cimlet : cimletek) {
            if(this.penz / cimlet != 0) {
                int db = 0;
                db = this.penz / cimlet;
                this.penz -= db * cimlet;
                eredmeny += db + "\t*\t" + cimlet + "\nbent van:\t" + getPenz() + "\n";
            }
        }

        System.out.println(eredmeny);
    }
}