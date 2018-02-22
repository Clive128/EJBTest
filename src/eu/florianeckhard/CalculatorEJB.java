package eu.florianeckhard;

import javax.ejb.Stateless;

@Stateless
public class CalculatorEJB {

    public double addieren(double eins, double zwei){
        return (eins + zwei);
    }
}
