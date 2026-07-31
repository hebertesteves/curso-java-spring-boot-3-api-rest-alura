package med.voll.api.dto.response;

import med.voll.api.entity.Medico;
import med.voll.api.enums.Especialidade;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
