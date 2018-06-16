import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
        
@ManagedBean
@SessionScoped

public class ClienteBean {
    
    Cliente  clienteAux = new Cliente();
    List <Cliente> clientes = new ArrayList<>();
        
//    public void cadastraCliente(){
//        
//        Cliente novoCliente = new Cliente();
//        novoCliente.setNome(clienteAux.getNome());
//        novoCliente.setCPF(clienteAux.getCPF());
//        novoCliente.setRG(clienteAux.getRG());
//        novoCliente.setEstado(clienteAux.getEstado());// sem a existencia do banco;
//        novoCliente.setEmail(clienteAux.getEmail());
//        
//        clienteList.add(novoCliente);
//        
//    }
    
    public void cadastraCliente(){
        ClienteDAO ad = new ClienteDAO();
        ad.salvar(clienteAux);
    }
    
    public void buscaCliente(){
        ClienteDAO ad = new ClienteDAO();
        clientes = ad.buscar();
    }  

    public Cliente getClienteAux() {
        return clienteAux;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClienteAux(Cliente clienteAux) {
        this.clienteAux = clienteAux;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
}
   