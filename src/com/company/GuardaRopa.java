package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    private Map<Integer, List> diccionario;
    private Integer contador;

    public GuardaRopa() {
        this.diccionario = new HashMap<>();
        this.contador = 0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        Integer nroIdentificacion = contador;
        diccionario.put(nroIdentificacion, listaDePrenda);
        contador++;
        return nroIdentificacion;
    }

    public void mostrarPrendas(){
        System.out.println("Prendas en el guarda ropa: ");
        for (Integer identificador:diccionario.keySet()) {
            System.out.println(identificador + " - " + diccionario.get(identificador).toString());
        }
    }

    public List<Prenda> devolverPrendas(Integer nroIdentificacion){
        return diccionario.remove(nroIdentificacion);
    }

    public Integer getContador() {
        return contador;
    }

    public void setDiccionario(Map<Integer, List> diccionario) {
        this.diccionario = diccionario;
    }

    public Map<Integer, List> getDiccionario() {
        return diccionario;
    }
}
