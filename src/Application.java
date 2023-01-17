import entities.EntierNaturel;
import exceptions.NombreNegatifExcetion;

public class Application {
    public static void main(String[] args) {

        try {
            EntierNaturel en = new EntierNaturel(2);
            en.decrementer();
            en.decrementer();
            en.decrementer();
        }
        catch(NombreNegatifExcetion e){
            System.out.println(e.getMessage());
            System.out.println(e.getNombreError());
        }
    }
}