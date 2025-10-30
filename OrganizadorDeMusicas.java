import java.util.ArrayList;

/**
 * Uma classe que guarda detalhes de arquivos de música.
 * Esta versão pode tocar os arquivos de música.
 * 
 * Traduzido por Julio César Alves. 2023.10.01
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class OrganizadorDeMusicas
{
    // Um ArrayList para guardar oos nomes dos arquivos de músicas.
    private ArrayList<String> arquivos;
    // Um tocador de arquivos de música.
    private TocadorDeMusica tocador;
        
    /**
     * Cria um OrganizadorMusicas
     */
    public OrganizadorDeMusicas()
    {
        arquivos = new ArrayList<>();
        tocador = new TocadorDeMusica();
    }
    
    /**
     * Adiciona um arquivo à coleção.
     * @param nomeDoArquivo O nome do arquivo a ser adicionado.
     */
    public void adicionarArquivo(String nomeDoArquivo)
    {
        arquivos.add(nomeDoArquivo);
    }
    
    /**
     * Retorna a quantidade de arquivos na coleção.
     * @return A quantidade de arquivos na coleção.
     */
    public int obterQuantidadeDeArquivos()
    {
        return arquivos.size();
    }
    
    /**
     * Lista (exibe) um arquivo da coleção.
     * @param indice O índice (posição) do arquivo a ser listado.
     */
    public void listarArquivo(int indice)
    {
        if(indice >= 0 && indice < arquivos.size()) {
            String nomeDoArquivo = arquivos.get(indice);
            System.out.println(nomeDoArquivo);
        }
    }
    
    /**
     * Remove um arquivo da coleção.
     * @param indice O índice (posição) do arquivo a ser removido.
     */
    public void removerArquivo(int indice)
    {
        if(indice >= 0 && indice < arquivos.size()) {
            arquivos.remove(indice);
        }
    }

    /**
     * Começa a tocar um arquivo da coleção.
     * Use pararDeTocar para pará-la.
     * @param indice O índice (posição) do arquivo a ser tocado.
     */
    public void comecarATocar(int indice)
    {
        String nomeDoArquivo = arquivos.get(indice);
        tocador.comecarATocar(nomeDoArquivo);
    }

    /**
     * Para o tocador
     */
    public void pararDeTocar()
    {
        tocador.parar();
    }
    
    
    //Novo Metodo do exercicio RODRIGO ADONIAS SALGADO
    public void verificarIndice(int indice)
    {
        int tamanho = arquivos.size();
        
        if(indice >= 0 && indice < tamanho)
        {
            System.out.println("Índice válido: " + indice);
        }
        else
        {
            System.out.println("ERROR");
            System.out.println("A faixa de índice válida é de: 0 a " + (tamanho - 1));
        }
        
    }
    
    public boolean indiceEhValido(int indice)
    {
        int tamanho = arquivos.size();
        
        if(indice >= 0 && indice < tamanho)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void listarTodosOsArquivos() 
    {
        for(String nomeDoArquivo : arquivos) 
        {
            System.out.println(nomeDoArquivo);  
        }
    }
    
    public void buscarMusicas(String stringDeBusca)
    {
        for(String nomeDoArquivo : arquivos)
        {
            boolean teste = nomeDoArquivo.contains(stringDeBusca);
            if (teste)
            {
                System.out.println(nomeDoArquivo);
            }
            else
            {
                System.out.println("Error");
            }
        }
    }
    
    public void buscarETocarMusicas(String stringDeBusca)
    {
        for(String nomeDoArquivo : arquivos)
        {
            boolean teste = nomeDoArquivo.contains(stringDeBusca);
            if (teste)
            {
                tocador.tocarAmostra(nomeDoArquivo);
            }
            else
            {
                System.out.println("Error");
            }
        }
    }
}
