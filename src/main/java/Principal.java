
import com.joaomota.padraobuilder.Produto;
import com.joaomota.padraobuilder.ProdutoBuilder;
import com.joaomota.padraobuilder.Vendedor;
import java.time.LocalDate;

/**
 *
 * @author joaoh
 */
public class Principal {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor();
        vendedor.setId(1);
        vendedor.setNome("David");

        Produto produto = new ProdutoBuilder()
                .titulo("Monitor LED")
                .descricao("Monitor LED 25")
                .marca("Samsung")
                .modelo("25FHD")
                .preco(1200)
                .dataCadastro(LocalDate.now())
                .dataUltimaAtualizacao(LocalDate.now())
                .categoria("Eletrônico")
                .vendedor(vendedor)
                .build();

        System.out.println(produto);
    }
}
