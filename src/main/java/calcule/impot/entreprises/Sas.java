package calcule.impot.entreprises;

import calcule.impot.CalculeImpot;
import calcule.impot.Entreprise;

public class Sas extends CalculeImpot implements Entreprise {

    private static final double TAUX_IMPOSITION = 0.33;

    public Double calculerImpots(Double chiffreAffaire) {
        return super.getImpotAPayer(chiffreAffaire, TAUX_IMPOSITION);
    }

}
