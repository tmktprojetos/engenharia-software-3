
public class Principal {
	
	public static void main(String[] args) {
		Capitulo capitulo = new Capitulo();
		Secao secao = new Secao();
		Paragrafo paragrafo = new Paragrafo();
		
		capitulo.titulo = "CAPITULO 1";
		secao.nome = "A";
		paragrafo.texto = "HELLO WORLD";
		
		secao.paragrafos.add(paragrafo);
		capitulo.secoes.add(secao);
		
		for (Secao s : capitulo.secoes) {
			for (Paragrafo p : s.paragrafos) {
				System.out.println(String.format("Capítulo: %s | Seção: %s | Parágrafo: %s", capitulo.titulo, s.nome, p.texto));
			}
		}
		
	}
	
}
