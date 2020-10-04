package com.company.aplication;

public class Comparavel {
    private int num;

    public Comparavel(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public boolean ehMaiorOuIgual(int valor) {  // 10
        if (num >= valor) {
            System.out.println("o " + num + " eh maior ou igual a " + valor);
        return true;
        } //else
             // System.out.println("o " + num + " nao eh menor ou igual ao " + valor );
            return false;


    }

    public boolean ehMenorOuIgual(int valor) {  //20
        if (num <=  valor) {
            System.out.println("e " + num + " eh menor ou igual " + valor);
            return true;
        }// else System.out.println("e " + num + " nao eh menor ou igual " + valor);
            return false;
    }

    public boolean ehDiferenteDe(int valor) {    //30
        if (num != num) {
            System.out.println("o valor eh diferente de " + valor);
            return true;
        } else
            return false;
    }

    public boolean ehIgual(int valor) {
        if (valor == num) {
            System.out.println("o valor de " + num + " eh igual a " + valor);
            return true;
        } else
            return false;
        }

    /*@Override
    public String toString() {
        return "numeros comparadosl{" +
                "num = " + getNum() +
                "ehMaiorOuIgual" + ehMaiorOuIgual(10) +
                "ehMenorOuIgual" + ehMenorOuIgual(20) +
                "ehDiferenteDe" + ehDiferenteDe(30) +
                "ehIgual" + ehIgual(40) +
                '}';

    }
    */

}