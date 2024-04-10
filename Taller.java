
/**
 * Write a description of class Taller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taller extends Aula
{
    // instance variables - replace the example below with your own

    int ordenadores;
    
    /**
     * Constructor for objects of class Taller
     */
    public Taller(String nom, int num, int equipos)
    {
        // initialise instance variables
        
        super(nom, num);
        ordenadores = equipos;
    }

    public int getOrdenadores()
    {
        return ordenadores;
    }
    
    public void visualizar()
    {
        System.out.println(mostrar() + "\nOrdenadores: " + ordenadores);
    }
    
}
