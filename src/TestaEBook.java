
public class TestaEBook {
	public static String marcaDagua = "C.J Enterprise";
	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.titulo = "Harry Potter e a Pedra nohin";
		ebook.autor = "Carl Jhonson";
		ebook.categoria = "Fic��o";
		ebook.valor = 43.59;
		ebook.setMarcaDagua(marcaDagua);
		ebook.aplicarDesconto();
		
		System.out.printf("O valor final do livro " + ebook.titulo + " � " + ebook.valor);
	}
}
