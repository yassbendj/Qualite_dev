package com.example.demo.data;

public class Voiture {

    String marque;
    int prix;
    int id;

    public Voiture(){
    }

    public Voiture(String uneMarque, int unPrix)
    {
        this.marque = uneMarque;
        this.prix = unPrix;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getMarque()
    {
        return marque;
    }

    public void setMarque(String marque)
    {
        this.marque = marque;
    }

    public int getPrix()
    {
        return prix;
    }

    public void setPrix(int prix)
    {
        this.prix = prix;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "marque='" + marque + '\'' +
                ", prix=" + prix +
                ", id=" + id +
                '}';
    }
}
