/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author IvanTron
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca grados Celsius");
        double celsius = sc.nextInt();
        System.out.println("Grados Celsius: " + celsius + "°C");
        double celsiusF = FormulasTemperatura.calcularCelciusaFahrenheit(celsius);
        System.out.println("Grados convertidos a Fahrenheit: " + celsiusF + "°F");
        double celsiusK = FormulasTemperatura.calcularCelciusKelvin(celsius);
        System.out.println("Gradoos convertidos a Kelvin: " + celsiusK + "°K");
        System.out.println("---------------------------------------------------------");
        System.out.println("Introdusca grados Fahrenheit");
        double fahrenheit = sc.nextInt();
        System.out.println("Grados Fahrenheit: " + fahrenheit + "°F");
        double fahrenheitC = FormulasTemperatura.calcularFahrenheitCelcius(fahrenheit);
        System.out.println("Grados convertidos a Celcius: " + fahrenheitC + "°C");
        double fahrenheitK = FormulasTemperatura.calcularFahrenheitKelvin(fahrenheit);
        System.out.println("Grados convertidos a Kelvin: " + fahrenheitK + "°K");
        System.out.println("---------------------------------------------------------");
        System.out.println("Introdusca grados Kelvin");
        double kelvin = sc.nextInt();
        System.out.println("Grados Kelvin: " + kelvin + "°K");
        double kelvinC = FormulasTemperatura.calcularKelvinCelcius(kelvin);
        System.out.println("Grados convertidos a Celcius: " +  kelvinC + "°C");
        double kelvinF = FormulasTemperatura.calcularKelvinFahrenheit(kelvin);
        System.out.println("Grados convertidos a Fahrenheit: " + kelvinF + "°F");
    }

}

class FormulasTemperatura {

    public static double calcularCelciusaFahrenheit(double celsius) {
        double Fahrenheit;
        Fahrenheit = (celsius * 9/5) + 32;
        return Fahrenheit;
    }
    
    public static double calcularCelciusKelvin(double celsius) {
        double Kelvin;
        Kelvin = celsius + 273.15;
        return Kelvin;
    }
    
    public static double calcularFahrenheitCelcius(double fahrenheit) {
        double Celcius;
        Celcius = (fahrenheit - 32) * 5/9;
        return Celcius;
    }
    
    public static double calcularFahrenheitKelvin (double fahrenheit) {
        double Kelvin;
        Kelvin = ((fahrenheit - 32) * 5/9) + 273.15;
        return Kelvin;
    }
    
    public static double calcularKelvinCelcius (double Kelvin) {
        double Celsius;
        Celsius = Kelvin - 273.15;
        return Celsius;
    }
    
    public static double calcularKelvinFahrenheit (double Kelvin) {
        double Fahrenheit;
        Fahrenheit = ((Kelvin - 273.15) * 9/5) + 32;
        return Fahrenheit;
    }
}
