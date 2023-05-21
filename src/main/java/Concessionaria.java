import java.util.Observable;
public class Concessionaria extends Observable{

    private Integer codigo;
    private String nomeConcessionaria;
    private String nomeModelo;

    public Concessionaria(Integer codigo, String nomeConcessionaria, String nomeModelo) {
        this.codigo = codigo;
        this.nomeConcessionaria = nomeConcessionaria;
        this.nomeModelo = nomeModelo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Concessionaria setCodigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }

    public Concessionaria setNomeConcessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
        return this;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public Concessionaria setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
        return this;
    }

    public void novoCarro() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Concessionaria{" +
                "codigo=" + codigo +
                ", nomeConcessionaria='" + nomeConcessionaria + '\'' +
                ", nomeModelo="+ nomeModelo + '\'' +
                '}';
    }
}
