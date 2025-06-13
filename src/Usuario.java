public class Usuario {

    private String nome;
    private String email;
    private int idade;

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        } else {
            System.out.println("Digite um nome válido");
        }
    }

    public void setEmail(String email){
        if(email != null && email.contains("@")){
            this.email = email;
        } else {
            System.out.println("Email inválido");
        }
    }

    public void setIdade(int idade){
        if(idade > 18){
            this.idade = idade;
        } else if(idade > 0 && idade <= 18) {
            System.out.println("Usuário menor de idade");
        } else {
            System.out.println("Digite uma idade válida");
        }
    }

}
