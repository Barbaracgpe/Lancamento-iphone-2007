package Iphone.lancamento;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

    private String numeroSerie;
    private String modelo;

    // Construtor
    public iPhone(String numeroSerie, String modelo) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
    }

    // Getters e setters para numeroSerie e modelo

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        // Exemplo de uso
        iPhone meuiPhone = new iPhone("222", "14pro");
        meuiPhone.ligar("123456789");
        meuiPhone.tocar();
        meuiPhone.exibirPagina("https://www.example.com");
    }
}
