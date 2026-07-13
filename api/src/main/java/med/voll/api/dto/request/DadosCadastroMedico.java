package med.voll.api.dto.request;

import med.voll.api.enums.Especialidade;

public record DadosCadastroMedico(String nome,
                                  String email,
                                  String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {
}
