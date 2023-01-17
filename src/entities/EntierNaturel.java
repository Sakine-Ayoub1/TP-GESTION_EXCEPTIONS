package entities;

import exceptions.NombreNegatifExcetion;

public class EntierNaturel {

    private int val;

    public EntierNaturel(int val) throws NombreNegatifExcetion{
        if(val<0) throw new NombreNegatifExcetion("Vous ne pouvez pas passer un nombre negatif",val);
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifExcetion{
        if(val<0) throw new NombreNegatifExcetion("Vous ne pouvez pas passer un nombre negatif",val);
        this.val = val;
    }

    public void decrementer()throws NombreNegatifExcetion{
        if(val<=0) throw new NombreNegatifExcetion("Vous ne pouvez pas passer un nombre negatif",val);
        val--;
    }
}
