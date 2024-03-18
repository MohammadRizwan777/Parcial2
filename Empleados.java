
import java.util.ArrayList;
import java.util.List;

public class Empleados {
    private List<Empleado> lista;

    public Empleados() {
        this.lista = new ArrayList<>();
    }

    public void altaEmpleado(String nombre, String cargo, double salario) {
        lista.add(new Empleado(nombre, cargo, salario));
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}
