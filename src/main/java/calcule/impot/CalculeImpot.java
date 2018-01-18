package calcule.impot;

import calcule.impot.erreur.ChiffreAffaireNeDoitPasEtreNull;

public class CalculeImpot {

    protected double getImpotAPayer(Double chiffreAffaire, Double tauxImposition) {
        faireVerifications(chiffreAffaire);
        return chiffreAffaire * tauxImposition;
    }

    private void faireVerifications(Double chiffreAffaire) {
        if (chiffreAffaire == null) {
            throw new ChiffreAffaireNeDoitPasEtreNull();
        }
    }
}
