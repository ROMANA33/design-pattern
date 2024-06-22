public class acteur  {
    private String name;
    private Article article;
    private float seuil;

    
    public acteur(String name, Article article, float seuil) {
        this.name = name;
        this.article = article;
        this.seuil = seuil;

    }

    public acteur(String name) {
    }

    public acteur(String nom, float seuil) {
    }

    public acteur() {
        //TODO Auto-generated constructor stub
    }

    public void update(float prix) {
        if (prix > seuil) {
            System.out.println(name + ": Le prix actuel de " + prix + " dépasse le seuil de " + seuil);
        } else {
            System.out.println(name + ": Le prix actuel de " + prix + " ne dépasse pas le seuil de " + seuil);
        }
    }

    
    public String getName() {
        return name;
    }

    
    public Article getArticle() {
        return article;
    }

    public float getSeuil() {
        return seuil;
    }
}

