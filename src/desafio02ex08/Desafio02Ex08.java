package desafio02ex08;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Desafio02Ex08 {
    public static void main(String[] args) {
        /* Faça um algoritmo pra calcular o volume de uma esfera de raio R,
        em que R é um valor lido. */
        
        double r, vE;
        DecimalFormat f = new DecimalFormat("0.00");
        
        r = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio:"));
        vE = (4 * Math.PI * Math.pow(r, 3))/ 3;
            JOptionPane.showMessageDialog(null, "O volume da esfera é: "+f.format(vE));
    }
    
}
