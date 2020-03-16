package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Prenda unaPrenda = new Prenda("Acme", "Sweater");
        Prenda otraPrenda = new Prenda("Derby", "Jean");
        List<Prenda> misPrendas = new ArrayList<>();
        misPrendas.add(unaPrenda);
        misPrendas.add(otraPrenda);

        GuardaRopa guardaRopa = new GuardaRopa();

        System.out.println("Sus prendas se guardaron. Su ticket es el número: " + guardaRopa.guardarPrendas(misPrendas));

        guardaRopa.mostrarPrendas();

        System.out.println("Prendas devueltas: " + guardaRopa.devolverPrendas(0));

        guardaRopa.mostrarPrendas();
    }
}
