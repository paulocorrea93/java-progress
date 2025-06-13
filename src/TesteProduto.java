public class TesteProduto {

    public static void main(String[]args){
        Produto produto1 = new Produto();

        produto1.setNome("caneta");
        produto1.setPreco(3.5);

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Valor do produto: R$"+ produto1.getPreco());
    }

}
