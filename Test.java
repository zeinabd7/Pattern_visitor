public class Test implements CarteBancaireVisitor{
    @Override
    public int visit(Imprimante imprimante) {
        int prix=imprimante.getNbCartouche()*imprimante.getPrixCartouche();
        System.out.println("Imprimante "+imprimante.getNumeroModel() + "Prix: "+prix);
        return prix;
    }

    @Override
    public int visit(Ordinateur ordinateur) {
        int prix=0;
        if (ordinateur.getPrix()>150000 ){
            prix=ordinateur.getPrix()-500;
        }
        else{
            prix=ordinateur.getPrix();
        }
        System.out.println("Ordinateur "+ordinateur.getSerialNumber()+"Prix "+prix);
        return prix;
    }
}
