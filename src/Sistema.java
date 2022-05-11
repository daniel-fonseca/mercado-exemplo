import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		ProdutoRepository catalogo = new ProdutoRepository();
		
		System.out.println(produto);
		System.out.println(lote);
		
		Produto leite = new Produto("Leite de saco", "Almir Zinho");
		Produto pao = new Produto("Pão", "Nona");
		Produto ovo = new Produto("Ovo", "Maely");
		
		catalogo.addProduto(pao);
		catalogo.addProduto(ovo);
		catalogo.addProduto(leite);
		
	}
}
