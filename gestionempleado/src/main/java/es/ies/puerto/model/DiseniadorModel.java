package es.ies.puerto.model;

public class DiseniadorModel extends EmpleadoModel {

    /**
     * Constructor vacio
     */
    public DiseniadorModel(){
        super();
    }

    /**
     * Constructor de busqueda
     * @param id
     */
    public DiseniadorModel(String id){
        super(id);
    }

    /**
     * Constructor completo
     * @param nombre del diseniador
     * @param id de identificacion del diseniador
     * @param edad del diseniador
     * @param salarioBase  del diseniador
     */
    public DiseniadorModel(String nombre, String id, int edad, double salarioBase){
        super(nombre, id, edad, salarioBase);
    }

    /**
     * Su salario mas un 10%
     */
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase()*0.10;
    }
    
    @Override
    public String toString() {
        return "Empleado: Desarrollador" + super.toString() ;
    }
}
