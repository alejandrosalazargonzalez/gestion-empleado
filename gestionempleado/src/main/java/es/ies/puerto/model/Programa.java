package es.ies.puerto.model;

public class Programa {
    public static void main(String[] args) {
        DesarrolladorModel desarrollador = new DesarrolladorModel("Alexander", "111111d", 27, 2600);
        DiseniadorModel deseniador = new DiseniadorModel("Diego", "22222f", 19, 1700);
        GerenteModel gerente = new GerenteModel("Nicolas","333333g", 28, 3000);
        System.out.println(desarrollador);
        System.out.println(deseniador);
        System.out.println(gerente);
    }
}
