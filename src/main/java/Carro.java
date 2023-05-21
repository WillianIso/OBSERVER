import java.util.Observable;
import java.util.Observer;

public class Carro implements Observer {

    private String modelo;

    private String ultimaNotificacao;

    public Carro (String modelo)
    {
        this.modelo = modelo;
    }

    public String getUltimaNotificacao()
    {
        return this.ultimaNotificacao;
    }


    public void matricular(Concessionaria concessionaria) {
        concessionaria.addObserver(this);
    }

    public void update(Observable concessionaria, Object arg1) {
        this.ultimaNotificacao = this.modelo + ", chegou na " + concessionaria.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
