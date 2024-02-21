package med.voli.api.dto.medico;

import med.voli.api.dto.endereco.CadastroEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, CadastroEndereco cadastroEndereco) {

}
