package br.edu.ifpb.report.database;

public abstract class ConexaoBancoDeDados{
    
    public void criarConexao() {
        System.out.println("Conexão estabelecida!");
    }
    
    public void consulta(String query) {
        System.out.println("Executar consulta sql!");
    }
}