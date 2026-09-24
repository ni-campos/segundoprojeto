public class Principal {
    static void main(String[] args) {
        Filme novoFilme = new Filme();

        novoFilme.nome="Gato de Botas";
        novoFilme.anoDeLancamento=2021;

        novoFilme.exibeFichaDoFilme();

        novoFilme.avalia(8);
        novoFilme.avalia(6);
        novoFilme.avalia(7);

        System.out.println("Soma das avaliações: "+novoFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: "+novoFilme.totalDasAvaliacoes);
        System.out.println("Media: "+novoFilme.pegaMedia());

        Pessoa novaPessoa = new Pessoa();
        novaPessoa.exibirDados();

        Calculadora novaCalculadora = new Calculadora();
        int resultado =novaCalculadora.dobrarNumeros(8);
        System.out.println("Resultado: "+resultado);

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Cruel Summer";
        minhaMusica.artista = "Taylor Swift";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");

    }
}
