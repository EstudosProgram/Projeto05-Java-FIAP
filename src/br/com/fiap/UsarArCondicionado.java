package br.com.fiap;

public class UsarArCondicionado {
    public static void main(String[] args) {

        ArCondicionado usar = new ArCondicionado();

        usar.temperatura = 20;
        usar.modo = "Resfriar";

        usar.diminuirTemperatura();
        usar.trocarModo("Ventilar");

        System.out.println("Temperatura: " + usar.temperatura + "\nModo: " + usar.modo);


    }
}
