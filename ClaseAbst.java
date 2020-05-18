
package claseabst;

abstract class Persona {
    
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void getDescripcion();
    
    public void getNombre(){
        System.out.println("Nombre " + this.nombre);
    }
}

class Alumno extends Persona {
    
    private String especialidad;

    public Alumno(String nomb, String especialidad) {
         super(nomb);
        this.especialidad = especialidad;
    }
    
    @Override
    public void getDescripcion()
    {
        System.out.println( "un alumno que estudia " + this.especialidad);
    }
}

class Empleado extends Persona {
    
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }
    
    @Override
    public void getDescripcion(){ 
        System.out.println("El sueldo de " + this.nombre + " es " + this.sueldo);
    } 
}



public class ClaseAbst {
    

    public static void main(String[] args) {
        
        Persona[] gente = new Persona[2];
        gente[0]=new Empleado("Domingo",234.56);
        gente[1]= new Alumno("Jose","POO");
        gente[0].getDescripcion();
        gente[0].getNombre();
        gente[1].getDescripcion();
        gente[1].getNombre();
        
    }
    
}
