package Monedas;

import javax.swing.*;

public class DolaresLibraEsterlina {
    public void conversorLibraEsterlina() {
        String value = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dólares a convertir");
        if (value.matches("[A-Za-z]*")) {
            JOptionPane.showMessageDialog(null, "Porfavor, ingrese un número positivo, no letras");

        } else if (Double.parseDouble(value) <= 0) {
            JOptionPane.showMessageDialog(null, "Porfavor, ingrese un número positivo");

        } else {
            Double result = Double.parseDouble(value) * 0.81;
            JOptionPane.showMessageDialog(null, result + " Libras Esterlinas");
        }
    }
}
