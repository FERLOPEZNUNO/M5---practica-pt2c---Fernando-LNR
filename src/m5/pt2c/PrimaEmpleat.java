package m5.pt2c;

/**
 *
 * @author flopeznun.daw1r23
 */
public class PrimaEmpleat {

    final private String nom;
    private String directiu;
    final private int antiguitat;
    final static int primaBase = 50;
    static String SN = "El codi del càrrec ha de ser 'S' o 'N'";
    static String antig = "La antiguitat ha de ser un nombre entre 0 i 999";

    /**
     * Método main que define los empleados.
     * @param args 
     */
    public static void main(String[] args) {

        PrimaEmpleat e = new PrimaEmpleat("Elvira", "S", 11);
        int p = 0;
        
        condiciones(e, p);
        
    }

    /**
     *  Método que establece las condiciones para calcular las primas.
     * @param e este parámetro es el empleado.
     * @param p este int es la prima.
     */
    public static void condiciones (PrimaEmpleat e, int p){
        
        if (e.antiguitat >= 0 && e.antiguitat < 1000) {
            if ("S".equals(e.directiu)) {
                if (e.antiguitat > 12) {
                    p = primaBase*12;
                } else {
                    p = primaBase*8;
                }
            } else if ("N".equals(e.directiu)) {
                if (e.antiguitat > 12) {
                    p = primaBase*3;
                } else {
                    p = primaBase*2;
                }
            } else {
                System.out.println(SN);
            }
            if (p != 0) {
                System.out.println("La prima que li correspon a " + e.nom
                        + " és de " + p + " Euros");
            }
        } else {
            System.out.println(antig);
        }
    }
    
    /**
     * Constructor
     * @param nome nombre del empleado.
     * @param dire variable que establece si el empleado es directivo o no.
     * @param ante variable que establece la antigüedad del empleado.
     */
    public PrimaEmpleat (String nome, String dire, int ante) {
      
        this.nom = nome;
        this.directiu = dire;
        this.antiguitat = ante;
        
    }
}
