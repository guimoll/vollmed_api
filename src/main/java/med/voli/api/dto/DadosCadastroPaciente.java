package med.voli.api.dto;

import med.voli.api.dto.endereco.CadastroEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, CadastroEndereco cadastroEndereco) {
}
