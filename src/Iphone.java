

public class Iphone implements Ipod, Telefone, ComunicadorInternet {
    
    private void ligarIphone() {
        System.out.println("LIGANDO O IPHONE");
    }

    private void desligarIphone() {
        System.out.println("DESLIGANDO O IPHONE");
    }

    public void exibirPagina() {
        System.out.println("CARREGANDO PAGINA WEB PELO NAVEGADOR SAFARI DO IPHONE");
    }

    public void adicionarNovaAba() {
         System.out.println("ABRINDO UMA NOVA ABA NO NAVEGADOR SAFARI DO IPHONE");
    }

    public void atualizarPagina() {
        System.out.println("RECARREGANDO PAGINA WEB NO NAVEGADOR SAFARI DO IPHONE");
    }

    public void mostrarContatos() {
        System.out.println("EXIBINDO TODOS OS CONTATOS NO IPHONE");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");
    }

    public void ligar() {
        System.out.println("FAZENDO UMA LIGAÇÃO NO IPHONE");
    }

    public void atender() {
        System.out.println("ATENDENDO UMA LIGAÇÃO NO IPHONE");
    }

    public void tocar() {
        System.out.println("REPRODUZINDO UMA MUSICA NO IPHONE");
    }

    public void pausar() {
        System.out.println("PAUSANDO UMA MUSICA QUE ESTAVA SENDO REPRODUZIDA NO IPHONE");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO UMA MUSICA PARA SER REPRODUZIDA NO IPHONE");
    }

    

    
}
