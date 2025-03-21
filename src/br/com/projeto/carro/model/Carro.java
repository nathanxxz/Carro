package br.com.projeto.carro.model;

public class Carro {
    public String modelo;
    public String chassi;
    public String placa;
    public boolean emMovimento;
    public boolean estaLigado;
    public double quantidadeCombustivel;
    public int velocidade;

    public Carro(String modelo,String chassi,String placa,double quantidadeCombustivel){
        this.modelo=modelo;
        this.chassi=chassi;
        this.placa=placa;
        this.quantidadeCombustivel=quantidadeCombustivel;
    }
    public void ligar(){
        if (this.quantidadeCombustivel==0){
            System.out.println("O carro esta sem gasolina, nao tem como ligar");
            this.estaLigado=false;
        }
        else if (this.quantidadeCombustivel>0){
            this.estaLigado=true;
            this.quantidadeCombustivel-=5;
            System.out.println("Ligando o carro e a quantidade de combustivel é" + " " + this.quantidadeCombustivel);

        }

    }
    public void desligar(){
        if (this.emMovimento){
            System.out.println("O carro esta ligado e em movimento, nao ha como desligar");
        }
        else {
            this.emMovimento=false;
            this.estaLigado=false;
            System.out.println("Parando o carro e desligando");
        }
    }

    public void acelerar(int icrmt){
        if (this.quantidadeCombustivel==0){
            System.out.println("Impossivel acelerar o carro sem gasosa");
        }

        this.emMovimento=true;
        this.velocidade+=icrmt;
        System.out.println("Acelerando e a velocidade é" + " " + this.velocidade);
        this.quantidadeCombustivel-=5;

    }
    public void freiar(){
        if (this.velocidade>0){
            this.velocidade-=2;
            System.out.println("Freiando o carro" + " " + "e a velocidade é" + " " + this.velocidade);
        }
        else {
            System.out.println("Carro ja esta parado, nao precisa freiar");


        }

    }
    public void parar(){
        if (this.velocidade>0){
            System.out.println("Carro em alta velocidade, nao ha como parar, reduza antes");

        }
        else {
            this.emMovimento=false;
            System.out.println("Carro parou");
        }
    }




    public void exibirinfos(){
        System.out.println("--------------------------------");
        System.out.println("            Exibindo");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("NOME DO CARRO:" + " " + this.modelo);
        System.out.println();
        System.out.println("CHASSI:" + " " + this.chassi);
        System.out.println();
        System.out.println("PLACA:" + " " + this.placa);
        System.out.println();
        System.out.println("ESTA MOVIMENTO?:" + " " + this.emMovimento);
        System.out.println();
        System.out.println("ESTA LIGADO?:" + " " + this.estaLigado);
        System.out.println();
        System.out.println("QUANTIDADE DE COMBS:" + " " + this.quantidadeCombustivel);
        System.out.println();
        System.out.println("VELOCIDADE:" + " " + this.velocidade);
    }

}
