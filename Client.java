public class Client {
    public static void main(String[] args) {
        Article[] articles=new Article[]{
                new Ordinateur(200000, " com123 "), new Ordinateur(145000, " com456 "),
                new Imprimante(1000, 6, "HP 302 "), new Imprimante(975, 2, " DELL56 ")
        };
        int totalArticle=calculer(articles);
        System.out.println("Total dépensé: "+totalArticle);
    }
    private static int calculer(Article[] articles) {
        CarteBancaireVisitor visitor = new Test();
        int sum = 0;
        for (Article article : articles) {
            sum=sum+article.accept(visitor);
        }
        return sum;
    }
}
