import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    public Produto cadastrarProduto(String nome, double preco, int quantidade){
        Produto produto = new Produto(proximoId, nome, preco, quantidade);
        proximoId++;
        this.produtos.add(produto);
        return produto;
    }

    public Produto buscarPorId(int id){
        for (Produto p : produtos){
            if (id == p.getId()){
                return p;
            }
        }
        return null;
    }

    public void adicionarEstoque(int id, int quantidade){
        for (Produto p : produtos){
            if (id == p.getId() && quantidade > 0){
                int novaQuantidade = p.getQuantidade() + quantidade;
                p.setQuantidade(novaQuantidade);
            }
        }
    }

    public void removerEstoque(int id, int quantidade){
        boolean operacaoRealizada = false;
        for (Produto p : produtos){
            if (id == p.getId() && quantidade <= p.getQuantidade() && quantidade > 0){
                int novaQuantidade = p.getQuantidade() - quantidade;
                p.setQuantidade(novaQuantidade);
                operacaoRealizada = true;
            }
        }
        if (!operacaoRealizada){
            System.out.println("Não foi possível remover o estoque.\n" +
                    "Quantidade insuficiente ou inválida.");
        }
    }

    public void deletarProduto(int id){
        Produto produto = buscarPorId(id);
        if (produto != null){
            produtos.remove(produto);
            System.out.println("Produto Removido!");
        }else {
            System.out.println("Produto não encontrado.");
        }
    }

    public List<Produto> lista(){
        return produtos;
    }
}
