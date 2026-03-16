import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ConsoleUtils.exibirCabecalho("Sistema Modularizado");
            System.out.println("1. Cadastrar | 2. Listar | 3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();

                try {
                    service.salvar(new Produto(nome, preco));
                    System.out.println("Sucesso!");
                } catch (Exception e) {
                    System.err.println("Erro: " + e.getMessage());
                }
            } else if (opcao == 2) {
                service.listarTodos().forEach(System.out::println);
            } else if (opcao == 3) break;
        }
        scanner.close();
    }
}