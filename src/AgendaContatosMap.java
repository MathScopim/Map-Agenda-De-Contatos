import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosMap() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void AdicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void RemoverContato(String nome) {
        if(agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatosMap agendaContatosMap = new AgendaContatosMap();

        agendaContatosMap.AdicionarContato("Matheus", 124125);
        agendaContatosMap.AdicionarContato("Guilherme", 43615);
        agendaContatosMap.AdicionarContato("Lorenzo", 975536);
        agendaContatosMap.AdicionarContato("Arthur", 758412);
        agendaContatosMap.AdicionarContato("Rocco", 235256);
        agendaContatosMap.AdicionarContato("Felipe", 815023);
        agendaContatosMap.AdicionarContato("Matheus", 6737862);

        agendaContatosMap.exibirContatos();

        agendaContatosMap.RemoverContato("Matheus");
        agendaContatosMap.exibirContatos();

        System.out.println("O número é: " + agendaContatosMap.pesquisarPorNome("Lorenzo"));

    }
}
