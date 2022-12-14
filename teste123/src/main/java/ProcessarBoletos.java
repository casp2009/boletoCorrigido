import java.util.List;
import java.util.function.Function;

public class ProcessarBoletos {

    private Function<String, List<Boleto>> leituraRetorno;

    public ProcessarBoletos(Function<String, List<Boleto>> leituraRetorno) {

        this.leituraRetorno = leituraRetorno;

    }

    public void processar(String nomeArquivo){

       var teste = leituraRetorno.apply(nomeArquivo);

       teste.forEach(System.out::println);

    }

    public void setLeituraRetorno(Function<String, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
