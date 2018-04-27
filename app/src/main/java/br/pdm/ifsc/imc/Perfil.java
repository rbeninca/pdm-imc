package br.pdm.ifsc.imc;

/**
 * Created by rbeninca on 1
 * 12/02/18.
 */
public class Perfil {
    public double limite_inferior;
    public double limite_superior;
    public String categoria;

    public Perfil(double imc ){
        Object[] dados= new Object[]{
                0, 18.5, "abaixopeso",
                18.5,25,"normal",
                25,30,"sobrepeso",
                30,35,"obesidade1",
                35,40,"obesidade2",
                40,Double.POSITIVE_INFINITY,"obesidade3",
        };
        int i;
        for (i=0;i<dados.length;i=i+3) {
            if (imc>= (double)dados[i] && imc< (double)dados[i+1] ) {
                this.limite_inferior=(double) dados[i];
                this.limite_inferior=(double) dados[i+1];
                this.categoria=(String) dados[i+2];
            }
        }
    };
};
