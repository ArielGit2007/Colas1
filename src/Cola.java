import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Pasajero> coleccion;
    public Cola(){
        coleccion= new LinkedList<>();
        predefinir();
    }

    public void predefinir(){
        coleccion.add(new Pasajero("Ariel",1,"ECONIMOCO"));
        coleccion.add(new Pasajero("Juan",20,"PRIMERA CLASE"));
        coleccion.add(new Pasajero("Floricienta",4,"PRIMERA CLASE"));
        coleccion.add(new Pasajero("Bere",40,"EJECUTIVO"));
    }

    public void agregar(Pasajero p){
        if(p!=null){
            coleccion.add(p);
        }
        throw new IllegalArgumentException("Pasajero no puede ser nulo");
    }

    public Pasajero extraer() throws Exception {
        if(coleccion.isEmpty()){
            throw new Exception("Cola sin elementos");
        }
        return coleccion.poll();
    }
    public Pasajero frente() throws Exception {
        if(coleccion.isEmpty()){
            throw new Exception("Cola sin elementos");
        }
        return coleccion.peek();
    }


}
