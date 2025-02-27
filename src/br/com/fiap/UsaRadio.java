package br.com.fiap;

public class UsaRadio {
    public static void main(String[] args) {

        //Declaração do objeto
        //Radio radio1;
        //Instanciação do objeto
        //radio1 = new Radio();

        //Declarar e instanciar
        Radio radio1 = new Radio();

        radio1.estacao = 89.9f;
        radio1.volume = 5;
        radio1.trocarEstacao(76.8f);
        radio1.aumentarVolume();

        System.out.println("O Volume atual: " + radio1.volume + "\nEstação atual: " + radio1.estacao);
    }
}
