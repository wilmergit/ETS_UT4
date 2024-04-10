
/**
 * Write a description of class Aula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aula
{
    // instance variables - replace the example below with your own
    
    String nombre;
    int pupitres;
    
    /**
     * Constructor for objects of class Aula
     */
    public Aula(String nom, int num)
    {
        nombre = nom;
        pupitres = num;
    }
    
  public String getNombre()
    {
        return nombre;
    }
    
    
    public void setNombre(String nuevo)
    {
        nombre = nuevo;
    }
    
    public void setPupitres(int pups)
    {
        pupitres = pups;
    }
    
    public String mostrar()
    {
        return "Nombre del aula: " + nombre + "\nPupitres: " + pupitres;
    }
}
