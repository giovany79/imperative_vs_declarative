package com.grupoestudio.lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnalistasAdminAgeTest {

    @Test
    public void getFirstElementImperativeMethod() {
        List<Analista> list = Arrays.asList(getAnalistas());
        List<Analista> listOrdered = AnalistasAdminAge.imperativeMethod(list);
        Assert.assertEquals(listOrdered.toArray()[0], new Analista("MariaIsabel", 22));
    }

    @Test
    public void getFirstElementDeclarativeMethod() {

        List<Analista> list = Arrays.asList(getAnalistas());
        List<Analista> listOrdered = AnalistasAdminAge.declarativeMethod(list);

        Assert.assertEquals(listOrdered.toArray()[0], new Analista("MariaIsabel", 22));

    }



    public Analista[] getAnalistas(){


        Analista[] analistas = {
                new Analista("Fidel", 34),
                new Analista("Juan David", 25),
                new Analista("MariaIsabel", 22),
                new Analista("Carlos", 41)

        };
        return analistas;
    }
}