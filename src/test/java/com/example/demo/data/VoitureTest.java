package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture()
    {
        Voiture v = new Voiture("Audi", 2500);
        Assert.isTrue(v.getMarque().equals("Audi"), "C'est une Audi");
        Assert.isTrue(v.getPrix()==2500, "Coute 2500€");
    }

}
