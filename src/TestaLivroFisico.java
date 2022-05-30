
public class TestaLivroFisico {
	public static void main(String[] args) {
		LivroFisico livroFisico = new LivroFisico();
		livroFisico.titulo = "Harry Potter e a Pedra nohin 2: O retorno";
		livroFisico.autor = "Carl Jefferson";
		livroFisico.categoria = "Ficção";
		livroFisico.valor = 96.99;
		livroFisico.aplicarDesconto();
		livroFisico.valor = livroFisico.getTaxaImpressao();
		
		System.out.printf("O valor final do livro " + livroFisico.titulo + " é " + livroFisico.valor);
	}
}
