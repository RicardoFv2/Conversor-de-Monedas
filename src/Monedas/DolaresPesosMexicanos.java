package Monedas;

import javax.swing.*;

public class DolaresPesosMexicanos {

    public void conversorPesosMexicanos() {
        String value = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dólares a convertir");
        if (value.matches("[A-Za-z]*")) {
            JOptionPane.showMessageDialog(null, "Porfavor, ingrese un número positivo, no letras");

        } else if (Double.parseDouble(value) <= 0) {
            JOptionPane.showMessageDialog(null, "Porfavor, ingrese un número positivo");

        } else {
            Double result = Double.parseDouble(value) * 19.63;
            JOptionPane.showMessageDialog(null, result + " Pesos méxicanos");
        }
    }
}
