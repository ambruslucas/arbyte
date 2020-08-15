import java.util.Scanner;

    public class SistemaDeLogin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite o nome de usuário: ");
            String login = scanner.nextLine();

            System.out.print("digite a senha: ");
            String senha = scanner.nextLine();

            if (senha.equals("#lucas@12345#") && login.equals("ambruslucas")) {
                System.out.println("");
                System.out.println("acesso autorizado");
            } else {
                System.out.println("");
                System.out.println("login e/ou senha incorreto(s)");
            }
        }

    }
