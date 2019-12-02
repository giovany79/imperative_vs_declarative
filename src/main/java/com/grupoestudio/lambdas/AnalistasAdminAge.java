package com.grupoestudio.lambdas;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AnalistasAdminAge {

    private final static int AGE = 25;

    public AnalistasAdminAge(){


    }

    @Benchmark
    public void measureName() {
    }

    /**
     * Imperativo: Obtener las edades de los que tienen menos de 25 años y mostrarlas por pantalla
     */
    @Benchmark
    public  static List<Analista> imperativeMethod(List<Analista> list ){
        List<Analista> analistaOrdered = new ArrayList<>();
        for (Analista a:list) {
            if(a.getAge()<AGE){
                analistaOrdered.add(a);
            }
        }
        analistaOrdered.sort(Comparator.comparing(Analista::getAge));
        return analistaOrdered;
    }


    /**
     * Declarativo: Obtener las edades de los que tienen menos de 25 años y mostrarlas por pantalla
     */
    @Benchmark
    public static List<Analista> declarativeMethod(List<Analista> list ){
        Predicate<Analista> menorVeinticinco = e -> (e.getAge()<AGE);
        return list.stream()
                .filter(menorVeinticinco)
                .sorted(Comparator.comparing(Analista::getAge))
                .collect(Collectors.toList());

    }

}
