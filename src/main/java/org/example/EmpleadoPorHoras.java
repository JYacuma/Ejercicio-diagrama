package org.example;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, int edad, int horasTrabajadas, double pagoPorHora) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Por Horas");
        System.out.println("Salario Calculado: $" + (horasTrabajadas * pagoPorHora));
        System.out.println("-------------------------");
    }
}
