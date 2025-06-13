public class MainUsuario {

    public static void main(String[]args){
        Usuario paulo = new Usuario();
        paulo.setNome("Paulo");
        paulo.setEmail("paulogmail.com");
        paulo.setIdade(32);

        System.out.println("Olá, me chamo " + paulo.getNome() + " tenho " + paulo.getIdade() + " e meu email é " + paulo.getEmail());

    }

}
