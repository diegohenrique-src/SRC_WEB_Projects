import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    // No CRUD o salvar = CREATE
    public void salvar(Cliente novoCliente) {
        // Cria um objeto da classe conexao
        
        
//        System.out.println("Nome: " + novoCliente.getNome());
//        System.out.println("Nome: " + novoCliente.getCPF());
//        System.out.println("Nome: " + novoCliente.getRG());
//        System.out.println("Nome: " + novoCliente.getEstado());
//        System.out.println("Nome: " + novoCliente.getEmail());
        Connection conexao;
        try {
            // conecta ao banco de dados
            conexao = ConexaoDB.abreConexao();
            // realiza a inserção
            PreparedStatement ps = conexao.prepareStatement("INSERT INTO Clientes(Nome, RG, CPF, Estado, Email) VALUES (?,?,?,?,?);");
        ps.setString(1, novoCliente.getNome());
            ps.setString(2, novoCliente.getRG());
            ps.setString(3, novoCliente.getCPF());
            ps.setString(4, novoCliente.getEstado());
            ps.setString(5, novoCliente.getEmail());
            ps.execute();
            // fecha conexao com o banco de dados
            ConexaoDB.fechaConexao();
        } catch (SQLException ex) {
            System.out.println("ERRO 2!");
        }

    }

    // No CRUD o buscar = RETRIEVE
    public List<Cliente> buscar() {
        
        // Cria um objeto da classe conexao
        Connection conexao;
        // Cria uma lista auxiliar que recebera os dados do banco de dados
        List<Cliente> clientes = new ArrayList<>();
        try {
            // conecta ao banco de dados
            conexao = ConexaoDB.abreConexao();
            // recupera os dados dos bancos de dados
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Clientes;");

            while (rs.next()) {
                Cliente clienteAux = new Cliente();
                clienteAux.setNome(rs.getString("Nome"));
                clienteAux.setRG(rs.getString("RG"));
                clienteAux.setCPF(rs.getString("CPF"));
                clienteAux.setEstado(rs.getString("Estado"));
                clienteAux.setEmail(rs.getString("Email"));
                clientes.add(clienteAux);
            }
            // fecha conexao com o banco de dados
            ConexaoDB.fechaConexao();
        } catch (SQLException ex) {
            System.out.println("ERRO 5!");
        }
        return clientes;
    }
}