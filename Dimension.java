
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
    private Dimension dimension;

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
        dimension = new Dimension(alto,ancho,largo);
        return dimension;
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String altura =  "                   Alto:         ";
        String anchura = "                  Ancho:         ";
        String largura=  "                  Largo:         ";
        String formato = "%s\n%s\n%s";
        String resultado = String.format(formato,altura,anchura,largura);

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
