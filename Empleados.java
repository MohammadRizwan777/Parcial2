import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona a los empleados en el sistema.
 */
public class Empleados {
    private List<Empleado> lista;

    /**
     * Constructor de la clase Empleados.
     */
    public Empleados() {
        this.lista = new ArrayList<>();
    }

    /**
     * Añade un nuevo empleado a la lista de empleados.
     * @param nombre El nombre del nuevo empleado.
     * @param cargo El cargo del nuevo empleado.
     * @param salario El salario del nuevo empleado.
     */
    public void altaEmpleado(String nombre, String cargo, double salario) {
        lista.add(new Empleado(nombre, cargo, salario));
    }


    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje El porcentaje de aumento de salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }


    /**
     * Muestra la lista de empleados en el sistema.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}