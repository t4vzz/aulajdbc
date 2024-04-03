package eteczl.bancodedados;

import java.sql.Connection;

import eteczl.bancodedados.persistence.Conexao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Conexao conexao = new Conexao("localhost","3306","aulajdbc", "root", "");
    	Connection conexaoSql = conexao.getConnection();
    }
}
