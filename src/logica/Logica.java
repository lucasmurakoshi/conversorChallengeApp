package logica;

import igu.menu;
import javax.swing.JComboBox;

public class Logica {

    public static void main(String[] args) {
        menu pantalla = new menu();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }

    public static double redondear(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    public static double conversorMonedas(String de, String a, double cantidad) {
        double valor = 0;
        switch (de) {
            case "PesoARG":
                switch (a) {
                    case "DolarEEUU":
                        double totalDolares = cantidad / 498.0;
                        System.out.println(totalDolares);
                        valor = totalDolares;
                        break;
                    case "YenJPY":
                        double totalYenes = cantidad / 3.54;
                        System.out.println(totalYenes);
                        valor = totalYenes;
                        break;
                }
                break;
            case "DolarEEUU":
                switch (a) {
                    case "PesoARG":
                        double totalPesos = cantidad * 498.0;
                        System.out.println(totalPesos);
                        valor = totalPesos;
                        break;
                    case "YenJPY":
                        double totalYenes = cantidad * 140.601;
                        System.out.println(totalYenes);
                        valor = totalYenes;
                        break;
                }
                break;
            case "YenJPY":
                switch (a) {
                    case "PesoARG":
                        double totalPesos = cantidad * 3.54;
                        System.out.println(totalPesos);
                        valor = totalPesos;
                        break;
                    case "DolarEEUU":
                        double totalDolares = cantidad / 140.601;
                        System.out.println(totalDolares);
                        valor = totalDolares;
                        break;
                }
                break;
        }
        return valor;
    }

    public static double conversorTemperatura(String de, String a, double cantidad) {
        double valor = 0;
        switch (de) {
            case "Celsius":
                switch (a) {
                    case "Fahrenheit":
                        double fahrenheit = ((cantidad * 9) / 5) + 32;
                        System.out.println(redondear(fahrenheit) + "\u00B0F");
                        valor = fahrenheit;
                        break;
                    case "Kelvin":
                        double kelvin = cantidad + 273.15;
                        System.out.println(redondear(kelvin) + "K");
                        valor = kelvin;
                        break;
                }
                break;
            case "Fahrenheit":
                switch (a) {
                    case "Celsius":
                        double celsius = (cantidad - 32) / 1.8;
                        System.out.println(redondear(celsius) + "\u00B0C");
                        valor = celsius;
                        break;
                    case "Kelvin":
                        double kelvin = ((cantidad - 32)/1.8) + 273.15;
                        System.out.println(redondear(kelvin) + "K");
                        valor = kelvin;
                        break;
                }
                break;
            case "Kelvin":
                switch (a) {
                    case "Celsius":
                        double celsius = cantidad - 273.15;
                        System.out.println(redondear(celsius) + "\u00B0C");
                        valor = celsius;
                        break;
                    case "Fahrenheit":
                        double fahrenheit = (cantidad - 273.15)*1.8 + 32;
                        System.out.println(redondear(fahrenheit) + "\u00B0F");
                        valor = fahrenheit;
                        break;
                }
                break;
        }
        return valor;
    }
    
    public static double conversorMasas(String de, String a, double cantidad) {
        double valor = 0;
        switch (de) {
            case "KiloGramo":
                switch (a) {
                    case "Tonelada":
                        double tonelada = cantidad / 1000;                
                        System.out.println(redondear(tonelada) + "t");
                        valor = tonelada;
                        break;
                    case "Libra":
                        double libra = cantidad * 2.205;
                        System.out.println(redondear(libra) + "lb");
                        valor = libra;
                        break;
                    case "Onza":
                        double onza = cantidad * 35.274;
                        System.out.println(redondear(onza) + "oz");
                        valor = onza;
                        break;
                }
                break;
            case "Tonelada":
                switch (a) {
                    case "KiloGramo":
                        double kg = cantidad * 1000;
                        System.out.println(redondear(kg) + "kg");
                        valor = kg;
                        break;
                    case "Libra":
                        double libra = cantidad * 2205;
                        System.out.println(redondear(libra) + "lb");
                        valor = libra;
                        break;
                    case "Onza":
                        double onza = cantidad * 35270;
                        System.out.println(redondear(onza) + "oz");
                        valor = onza;
                        break;
                }
                break;
            case "Libra":
                switch (a) {
                    case "KiloGramo":
                        double kg = cantidad / 2.205;
                        System.out.println(redondear(kg) + "kg");
                        valor = kg;
                        break;
                    case "Tonelada":
                        double tonelada = cantidad / 2205;             
                        System.out.println(redondear(tonelada) + "t");
                        valor = tonelada;
                        break;
                    case "Onza":
                        double onza = cantidad * 16;
                        System.out.println(redondear(onza) + "oz");
                        valor = onza;
                        break;
                }
                break;
            case "Onza":
                switch (a) {
                    case "KiloGramo":
                        double kg = cantidad / 35.274;
                        System.out.println(redondear(kg) + "kg");
                        valor = kg;
                        break;
                    case "Tonelada":
                        double tonelada = cantidad / 35270;             
                        System.out.println(redondear(tonelada) + "t");
                        valor = tonelada;
                        break;
                    case "Libra":
                        double libra = cantidad / 16;
                        System.out.println(redondear(libra) + "lb");
                        valor = libra;
                        break;
                }
                break;
        }
        return valor;
    }
    
    public static void cambiarOpciones(JComboBox de, JComboBox a){
        int aux = a.getSelectedIndex();
        a.setSelectedIndex(de.getSelectedIndex());
        de.setSelectedIndex(aux);
    }
}
