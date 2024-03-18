import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados();
        empleados.altaEmpleado("Juan", "Desarrollador", 50000);
        empleados.altaEmpleado("María", "Diseñadora", 45000);
        empleados.altaEmpleado("Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.MENSAJE_PORCENTAJE_SALARIO);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        
        System.out.println(Textos.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}