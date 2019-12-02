package com.grupoestudio.lambdas;


import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] arg) throws IOException, RunnerException {

        //org.openjdk.jmh.Main.main(arg);

        Analista[] analistas = {
                new Analista("Gio", 40),
                new Analista("Esteban", 28),
                new Analista("Dani H", 26),
                new Analista("Cristian", 26),
                new Analista("Damasso", 25),
                new Analista("Ferney", 34),
                new Analista("Kathe", 26),
                new Analista("Estefa", 22),
                new Analista("Dani R", 26)
        };

        List<Analista> list = Arrays.asList(analistas);

        System.out.println("Imperative");
        System.out.println(AnalistasAdminAge.imperativeMethod(list));

        System.out.println("Declarative");
        System.out.println(AnalistasAdminAge.declarativeMethod(list));

    }



}
