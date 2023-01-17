package exceptions;

public class NombreNegatifExcetion extends Exception{

    private int nombreError;

    public NombreNegatifExcetion(String message) {
        super(message);
    }

    public NombreNegatifExcetion(String message,int nombreError) {
        super(message);
        this.nombreError=nombreError;
    }

    public int getNombreError() {
        return nombreError;
    }
}
