package calcule.impot.entreprises;

import calcule.impot.Entreprise;
import calcule.impot.erreur.ChiffreAffaireNeDoitPasEtreNull;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculerImpotAutoEntrepriseTest {

    private static final double DELTA = 0.00001;

    private Entreprise autoEntreprise;

    @Before
    public void initialisation() {
        autoEntreprise = new AutoEntreprise();
    }

    @Test
    public void enTantQue_autoentreprises_Lorsque_monCAest100_Alors_monImpotEst25() {
        Double chiffreArraire = 100.0;

        Assert.assertEquals(25.0, autoEntreprise.calculerImpots(chiffreArraire), DELTA);
    }

    @Test
    public void enTantQue_autoentreprises_Lorsque_monCAestZero_Alors_monImpotEstZero() {
        Double chiffreArraire = 0.0;

        Assert.assertEquals(0.0, autoEntreprise.calculerImpots(chiffreArraire), DELTA);
    }

    // TODO : Demander a l expert metier si cette regle est correcte
    @Test
    public void enTantQue_autoentreprises_Lorsque_monCAestNegatif_Alors_monImpotEstZero() {
        Double chiffreArraire = -10.0;

        Assert.assertEquals(-2.5, autoEntreprise.calculerImpots(chiffreArraire), DELTA);
    }

    // TODO : Demander a l expert metier si il faut prendre en compte le nombre de digite apres le virgule
    @Test
    public void enTantQue_autoentreprises_Lorsque_jeCalculeMonImpots_Alors_monImpotsDoitAvoirMaximumDeuxDigits() {
        Double chiffreArraire = 100.777777;

        Assert.assertEquals(25.19444425, autoEntreprise.calculerImpots(chiffreArraire), DELTA);
    }

    @Test(expected = ChiffreAffaireNeDoitPasEtreNull.class)
    public void enTantQue_autoentreprises_Lorsque_monCAestNull_Alors_ilFautleverUneException(){
        autoEntreprise.calculerImpots(null);
    }

}
