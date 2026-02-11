package org.example;

public class EmpleadoSalarioFijo extends Empleado{
    private double salarioFijo;

    public EmpleadoSalarioFijo(String nombre, int edad, double salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Salario Fijo");
        System.out.println("Salario Mensual: $" + salarioFijo);
        System.out.println("-------------------------");
    }

}
