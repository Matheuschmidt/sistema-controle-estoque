import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        boolean menu = true;

        while (menu){
            System.out.println("================================" +
                    "\n       CONTROLE DE ESTOQUE" +
                    "\n================================" +

                    "\n1 - Cadastrar produto" +
                    "\n2 - Listar produtos" +
                    "\n3 - Buscar produto" +
                    "\n4 - Adicionar estoque"  +
                    "\n5 - Remover estoque" +
                    "\n6 - Remover produto" +
                    "\n0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1 : {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade no estoque: ");
                    int quantidade = scanner.nextInt();
                    Produto produto = estoque.cadastrarProduto(nome, preco, quantidade);
                    System.out.println("Produto cadastrado. ID " + produto.getId());
                    break;
                }
                case 2 : {
                    List<Produto> lista = estoque.lista();
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia.");
                    }else{
                        for (Produto p : lista){
                            p.exibirInformacoes();
                        }
                    }
                    break;
                }
                case 3 : {
                    System.out.print("Digite o Id que deseja buscar: ");
                    int id = scanner.nextInt();
                    Produto produto = estoque.buscarPorId(id);
                    if (produto != null){
                        produto.exibirInformacoes();
                    }else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }
                case 4 : {
                    System.out.print("Digite o Id do produto que deseja adicionar no estoque: ");
                    int id = scanner.nextInt();
                    Produto produto = estoque.buscarPorId(id);
                    if (produto != null){
                        System.out.print("Digite a quantidade a ser adicionada no estoque: ");
                        int quantidade = scanner.nextInt();
                        estoque.adicionarEstoque(id, quantidade);
                        produto.exibirInformacoes();
                    }else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }
                case 5 : {
                    System.out.print("Digite o Id do produto que deseja remover no estoque: ");
                    int id = scanner.nextInt();
                    Produto produto = estoque.buscarPorId(id);
                    if (produto != null){
                        System.out.print("Digite a quantidade a ser removida no estoque: ");
                        int quantidade = scanner.nextInt();
                        estoque.removerEstoque(id, quantidade);
                        produto.exibirInformacoes();
                    }else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }
                case 6 : {
                    System.out.print("Digite o Id do produto que deseja deletar: ");
                    int id = scanner.nextInt();
                    estoque.deletarProduto(id);
                    break;
                }
                case 0 : {
                    System.out.println("Programa encerrado!");
                    menu = false;
                    break;
                }
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
