public class Filme {
        String nome;
        int anoDeLancamento;
        double duracaoEmMinutos;
        boolean incluidoNoPlano;
        double somaDasAvaliacoes;
        double totalDasAvaliacoes;

        void exibeFichaDoFilme() {
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lancamento: " + anoDeLancamento);
        }

        void avalia(double nota) {
                somaDasAvaliacoes += nota;
                totalDasAvaliacoes++;
        }

        double pegaMedia() {return somaDasAvaliacoes/totalDasAvaliacoes;}
}
