package actividad6;

public class Main {
    public static void main(String[] args) {
        String nombre = "Juan Zapata";
        int salarioBase = 3000000;
        int horasTrabajo = 160;
        int horasExtras = 10;
        double auxilioTransporte = 162000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        // Impresión de la nómina
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }

    // Método para calcular el salario devengado
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
        // Implementar solución
        double valorHora = salarioBase/horasTrabajo;
        double valorHoraExtra = valorHora * 1.35;
        double salarioDevengado = (valorHora * horasTrabajo) + (horasExtras * valorHoraExtra);
        
        return salarioDevengado;
    }

    // Método para calcular las deducciones
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        // Implementar solución 
        double deducciones = salarioDevengado * 0.08;
        return deducciones;

    }
    public static double calcularSalarioNeto(double salarioDevengado, double deducciones) {
        // Implementar solución 
        double salarioNeto = salarioDevengado - deducciones;
        return salarioNeto;
        
    }
}