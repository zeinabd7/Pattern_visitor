public class Imprimante implements Article{
    private int prixCartouche;
    private int nbCartouche;
    private String numeroModel;

    public Imprimante(int prixCartouche, int nbCartouche, String numeroModel){
        this.prixCartouche=prixCartouche;
        this.nbCartouche=nbCartouche;
        this.numeroModel=numeroModel;
    }

    public int getPrixCartouche() {
        return prixCartouche;
    }

    public int getNbCartouche() {
        return nbCartouche;
    }

    public String getNumeroModel() {
        return this.numeroModel;
    }

    @Override
    public int accept(CarteBancaireVisitor visitor) {
        return visitor.visit(this);
    }
}
