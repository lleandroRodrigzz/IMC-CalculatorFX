package br.unoeste.imccalculatorfx.util;

public class IMC {
    static public double get(int peso, double altura){
        return peso/(Math.pow(altura,2));
    }

    static public String getCondicao(double imc){
        String cond = "Obsidade Mórbida";
        if(imc >= 30 && imc < 40)
            cond = "Obsidade";
        else if(imc >= 25)
            cond = "Sobrepeso";
        else if(imc >= 20)
            cond = "Peso Normal";
        else if(imc >= 14.5)
            cond = "Peso abaixo do normal";
        else if(imc >= 0)
            cond = "Desnutrição";

        return cond;
    }
}
