import java.util.Scanner;

public class CadastroLoginDeUsuario {

    public static void main(String[] args) {
        Scanner register = new Scanner(System.in);
        String senha = "null";

        System.out.println("Digite seu nome completo: ");
        String nome = register.nextLine();

        StringBuilder separador = new StringBuilder("_");

        for (int i = nome.lastIndexOf(" ")+1; i <= nome.length(); i++){
            if (i < nome.length()) {
                separador.append(nome.charAt(i) );
            }
        }

        String login = nome.charAt(0)+separador.toString();

        System.out.println("Seu nome de usuário é: " + login);

        boolean validarsenha = false;

        while (validarsenha != true){

            System.out.println("Digite uma senha:");
            System.out.println(" A Senha Precida Conter: no mínimo 8 caractes, uma letra maiúscula, uma letra minúscula, números, um dos caracteres especiais @,!,-");
            senha = register.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@!-])(?=.*\\d).+") ){
                System.out.println("Senha criada com sucesso");
                validarsenha = true;
            } else{
                System.out.println("Sua senha não atende o padrão:" );
            }
        }

        boolean Login = false;

        while (Login != true){

            System.out.println("Digite nome de usuario:");
            String vLogin = register.nextLine();

            System.out.println("Digite sua senha:");
            String vSenha = register.nextLine();

            if (vLogin.equals(login) && vSenha.equals(senha) ){
                System.out.println("Login realizado com sucesso");
                Login = true;
            }else{
                System.out.println("Login ou senha inválido");
            }

        }

    }
}