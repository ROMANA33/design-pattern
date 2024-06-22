public class consommateur extends Acteur {

    public consommateur(String nom, float seuil) {
        super(nom, seuil);
    }

    @Override
    public void update(float prix) {
        float seuil = 0;
        if (prix < seuil) {
            System.out.println(" Prix en dessous du seuil. Demande d'achat déclenchée.");
            
        } else {
            System.out.println(" Prix actuel: " + prix + ", seuil d'achat: " + seuil);
        }
    }
}
