package br.com.fiap;

public class UsaTelevisor {
    public static void main(String[] args) {

        Televisor telivisor1 = new Televisor();

        telivisor1.canal = 2;
        telivisor1.volume = 12;
        telivisor1.aumentarVolume();
        telivisor1.trocarCanal(4);

        System.out.println("Canal atual: " + telivisor1.canal + "\nO volume atual " + telivisor1.volume);
    }
}
