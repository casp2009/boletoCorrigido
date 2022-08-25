import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.nio.file.Files.newBufferedReader;

public class LeituraRetornoBancoBrasil { //implements LeituraRetorno {

    /*@Override
    public List<Boleto> lerArquivoBB(String nomeArquivo) {
        System.out.println("Lendo arquivo "+nomeArquivo);
        try(var reader = Files.newBufferedReader(Paths.get(nomeArquivo))) {
            String linha = null;
            var listaBoleto = new ArrayList<Boleto>();
            while ( (linha = reader.readLine()) != null) {
                var vetor = linha.split(";");
                var boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);

                var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                boleto.setDataVencimento(LocalDate.parse(vetor[2],format));
                boleto.setDataPagamento(LocalDate.parse(vetor[3], format));

                boleto.setCpfCliente(vetor[4]);
                boleto.setValor(Double.parseDouble(vetor[5]));
                boleto.setMulta(Double.parseDouble(vetor[6]));
                boleto.setJuros(Double.parseDouble(vetor[7]));
                listaBoleto.add(boleto);
            }
            return listaBoleto;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }//catch
    }//func*/

}
