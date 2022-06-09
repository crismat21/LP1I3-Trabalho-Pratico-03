//Cristiano Guimaraes de Carvalho CB3013111
//Patricia Jessica Santos Fernandes Pinheiro CB3013073

package tp03;

import static java.lang.System.out;

public class TP03 {
    public static void main(String[] args) {
        Hora hora = new Hora();
        
        out.println(hora.getHora1());        
        out.println(hora.getHora2());
        out.println(hora.getSegundos() + " Segundos");
    }    
}