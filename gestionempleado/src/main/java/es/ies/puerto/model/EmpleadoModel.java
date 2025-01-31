package es.ies.puerto.model;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public abstract class EmpleadoModel {
    private String nombre;
    private String id;
    private int edad;
    private double salarioBase;
    
    /**
     * Constructor vacio
     */
    public EmpleadoModel() {
    }

    /**
     * Constructor para buscar
     * @param id del empleado
     */
    public EmpleadoModel(String id){
        this.id = id;
    }

    /**
     * Constructor completo
     * @param nombre del empleado
     * @param id de identificacion del empleado
     * @param edad del empleado
     * @param salarioBase  del empleado
     */
    public EmpleadoModel(String nombre, String id, int edad, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    //Getters y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();

    //equals con el id
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmpleadoModel)) {
            return false;
        }
        EmpleadoModel empleadoModel = (EmpleadoModel) o;
        return Objects.equals(id, empleadoModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "\n Nombre: " + getNombre() +
            "\n Edad: " + getId() +
            "\n Salario base:  " + getSalarioBase() +
            "\n Salario final: " +  calcularSalarioFinal()
            + "\n";
    }
    
}