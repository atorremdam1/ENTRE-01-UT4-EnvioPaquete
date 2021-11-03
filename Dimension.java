
/**
 *  Representa una dimensión
 *  
 *  @author - Alejandro Torreguitart
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        Dimension dimension = new Dimension(alto,ancho,largo);
        return dimension;
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String descrip = "Descripcion del paquete";
        String altura =" Alto: ";        
        String anchura ="Ancho: ";        
        String largura="Largo: ";
        String resultado = String.format("%s\n%20s%10.2f(cm)\n%20s%10.2f(cm)\n%20s%10.2f(cm)",
                           descrip,altura,alto,anchura,ancho,largura,largo);

        return resultado;

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
