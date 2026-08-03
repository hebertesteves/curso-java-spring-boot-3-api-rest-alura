package med.voll.api.dto.request;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
        @NotNull Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
