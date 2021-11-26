import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Cliente cliente1 = new Cliente("Indra","Madrid", 10000);
        //System.out.println(cliente.nombre + cliente.ciudad + cliente.presupuesto);
        cliente1.setCiudad("Sevilla");
        System.out.println("Ciudad modificada a " + cliente1.getCiudad());
        cliente1.getFicha();

        Cliente cliente2 = new Cliente("Vass", "Valencia", 12000);
        cliente2.getFicha();
        //System.out.println("El cliente " + cliente.getNombre()+"-"+cliente.getCiudad()+" tiene un presupuesto de "+cliente.getPresupuesto());
        //System.out.println("La ciudad es "+ cliente.getCiudad);
        //animal.setNombre("Sevilla");
        //System.out.println("La ciudad es "+ cliente.getCiudad);
    } 
}
