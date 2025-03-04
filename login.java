import java.util.Scanner;

public class LoginMatriz {
    public static void main(String[] args) {
        // Matriz 6x2 com logins e senhas cadastrados
        String[][] usuarios = {
            {"user1", "senha1"},
            {"user2", "senha2"},
            {"user3", "senha3"},
            {"user4", "senha4"},
            {"user5", "senha5"},
            {"user6", "senha6"}
        };

        Scanner scanner = new Scanner(System.in);

        // Solicita o login e a senha do usuário
        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        scanner.close();

        // Verifica se o login e a senha estão na matriz
        boolean autenticado = false;
        for (String[] usuario : usuarios) {
            if (usuario[0].equals(login) && usuario[1].equals(senha)) {
                autenticado = true;
                break;
            }
        }

        // Exibe o resultado
        if (autenticado) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Login ou senha incorretos!");
        }
    }
}
