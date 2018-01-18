package calcule.impot.entreprises;

import calcule.impot.CalculeImpot;
import calcule.impot.Entreprise;

public class AutoEntreprise extends CalculeImpot implements Entreprise {

    private static final double TAUX_IMPOSITION = 0.25;

    public Double calculerImpots(Double chiffreAffaire) {
        return super.getImpotAPayer(chiffreAffaire, TAUX_IMPOSITION);
    }

}
