package br.pdm.ifsc.imc;

/**
 * Created by rbeninca on  * 12/02/18.
 */

public class Imc {
    protected  double altura,peso;
    public Imc (Double peso, Double altura){
        this.peso=peso;
        this.altura=altura;
    }

    public double get_imc() {
        try {
            return peso / (altura * altura);

        } catch (ArithmeticException e) {
            System.err.print(e);
            return  0;

        }
    }

    public Perfil get_classificacao_imc(){
        double imc =this.get_imc();
        return new Perfil(imc);
    }

}
