package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmpleadoSalarioFijo e1 = new EmpleadoSalarioFijo("Ana", 30, 2500.00);
        EmpleadoPorHoras e2 = new EmpleadoPorHoras("Carlos", 22, 40, 15.50);

        e1.mostrarInfo();
        e2.mostrarInfo();


    }
}