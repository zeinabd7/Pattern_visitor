public class Ordinateur implements Article{
    private int prix;
    private String serialNumber;
    public Ordinateur(int prix,String serialNumber){
        this.prix=prix;
        this.serialNumber=serialNumber;
    }

    public int getPrix() {
        return prix;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    @Override
    public int accept(CarteBancaireVisitor visitor) {
        return visitor.visit(this);
    }
}
