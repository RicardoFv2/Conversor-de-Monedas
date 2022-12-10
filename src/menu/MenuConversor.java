package menu;

import Monedas.DolaresEuros;
import Monedas.DolaresLibraEsterlina;
import Monedas.DolaresPesosMexicanos;

import javax.swing.*;

public class MenuConversor {
    public boolean flag = true;

    public void mostrarMenuConversor(){

        DolaresPesosMexicanos pesosMexicanos = new DolaresPesosMexicanos();
        DolaresEuros euros = new DolaresEuros();
        DolaresLibraEsterlina libraEsterlina = new DolaresLibraEsterlina();

        while (flag) {
            String option = JOptionPane.showInputDialog(null, "Ingrese una opción\n" +
                    "1-Convertir dolares a pesos mexicanos\n" +
                    "2-Convertir dólares a euros\n" +
                    "3-Convertir dólares a libra esterlina\n" +
                    "4-Salir del Programa", "Menu", JOptionPane.YES_NO_CANCEL_OPTION);

            switch (option) {
                case "1":
                    pesosMexicanos.conversorPesosMexicanos();
                    break;
                case "2":
                    euros.conversorEuros();
                    break;
                case "3":
                    libraEsterlina.conversorLibraEsterlina();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, Ingrese una opción del 1-4");
            }
        }
    }
}
