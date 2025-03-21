package br.com.projeto.carro.main;

import br.com.projeto.carro.model.Carro;

public class Main {
    public static void main(String[]args){
        Carro carro=new Carro("CIVIC","TITAN66","EREN3",10  );
        carro.exibirinfos();
        carro.ligar();
        carro.acelerar(2);
        carro.freiar();
        carro.parar();
        carro.desligar();

    }
}
