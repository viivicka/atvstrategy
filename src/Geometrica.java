
public class Geometrica implements ICalcMedia {
    @Override
    public double Calcular (double P1, double P2) {
        return Math.sqrt(P1 * P2);
    }
    @Override
    public String Situacao (double media); {
        return "Media geometrica";

    }

}