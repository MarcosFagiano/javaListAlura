package com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

public class MainList {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(10);
        miPelicula.evalua(3);
        miPelicula.evalua(5);

        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(3);
        otraPelicula.evalua(4);
        otraPelicula.evalua(9);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(8);
        peliculaDeBruno.evalua(6);
        peliculaDeBruno.evalua(2);

        Serie lost = new Serie("Lost", 2000);
        lost.evalua(10);
        lost.evalua(6);
        lost.evalua(7);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(lost);
        lista.add(peliculaDeBruno);
        lista.add(otraPelicula);
        lista.add(miPelicula);

        Collections.sort(lista);

        System.out.println(lista);
        // for (Titulo iterable_element : lista) {
        // System.out.println(iterable_element);
        // if (iterable_element instanceof Pelicula) {
        // Pelicula pelicula = (Pelicula) iterable_element;
        // System.out.println("Clasificacion: " + pelicula.getClasificacion());
        // }
        //
        // }

        ArrayList<String> artistNameArrayList = new ArrayList<>();
        artistNameArrayList.add("Penelope Lopez");
        artistNameArrayList.add("Carlos Mendez");
        artistNameArrayList.add("Maria Gonzalez");
        artistNameArrayList.add("Sofia Perez");
        artistNameArrayList.add("Luis Martinez");
        artistNameArrayList.add("Isabel Ramirez");
        artistNameArrayList.add("Fernando Diaz");
        artistNameArrayList.add("Ana Torres");
        artistNameArrayList.add("Javier Sanchez");
        artistNameArrayList.add("Laura Fernandez");
        System.out.println(artistNameArrayList);

        Collections.sort(artistNameArrayList);

        System.out.println(artistNameArrayList);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("Por fecha:" + lista);
    }
}
