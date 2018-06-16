import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    // VARIÁVEIS
    // Variavel que permite abrir uma conexao com o bd
    private static Connection conexao;
    // Caminho necessario para se comunicar com o bd
    private static final String URL_CONEXAO = "jdbc:mysql://localhost:3307/ac309db";
    // Usuario de acesso ao bd
    private static final String USUARIO = "root";
    // Senha de acesso ao bd
    private static final String SENHA = "";

    // MÉTODOS
    // Metodo que abre uma conexao com o bd
    public static Connection abreConexao() {
        if (conexao == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
            } catch (ClassNotFoundException ex) {
                System.out.println("ERRO 3!");
            } catch (SQLException ex) {
                System.out.println("ERRO 4!");
            }
        }
        System.out.println("Entrouuu!");
        return conexao;
    }

    // Metodo que fecha uma conexao com o bd
    public static void fechaConexao() throws SQLException {
        if (conexao != null) {
            conexao.close();
            conexao = null;
        }
    }
}
