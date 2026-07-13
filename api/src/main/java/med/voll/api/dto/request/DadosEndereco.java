package med.voll.api.dto.request;

public record DadosEndereco(String logradouro,
                            String bairro,
                            String cep,
                            String cidade,
                            String uf,
                            String numero,
                            String complemento) {
}
