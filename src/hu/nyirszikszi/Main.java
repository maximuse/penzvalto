package hu.nyirszikszi;

import hu.nyirszikszi.penzvalto.Penzvalto;

public class Main {
    public static void main(String[] args) {
        Penzvalto p = new Penzvalto(14500);
        p.felvalt(new int[]{5000});
        p.felvalt(new int[]{3000});
        p.felvalt(new int[]{2000});
    }
}