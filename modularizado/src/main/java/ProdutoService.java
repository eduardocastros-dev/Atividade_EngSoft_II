import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoService {
    private List<Produto> repositorio = new ArrayList<>();

    public void salvar(Produto produto) {
        if (produto.getPreco() > 0) {
            repositorio.add(produto);
        } else {
            throw new IllegalArgumentException("O preço deve ser positivo.");
        }
    }

    public List<Produto> listarTodos() {
        return Collections.unmodifiableList(repositorio);
    }
}
