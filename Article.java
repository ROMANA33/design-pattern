import java.util.ArrayList;
import java.util.List;

public class Article {

    private float prix;
    private List<observateur> observateurs = new ArrayList<>();

    public Article(int i) {
    }


    public void attach(observateur observateur) {
        observateurs.add(observateur);
    }


    
    public void plusCher() {
        this.prix += 100;
    }


    public void moinsCher() {
        if (this.prix >= 100) {
            this.prix -= 100;
        } else {
            System.out.println("Le prix ne peut pas être négatif");
        }
    }

    public float getPrix() {
        return 0;
    

    
}

    public void setPrix(float prix) {
    }
    
    }
