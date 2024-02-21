package med.voli.api.dto.medico;

import jakarta.persistence.*;
import med.voli.api.dto.endereco.Endereco;


@Table(name = "medicos")

public class Medico {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String crm;


    @Enumerated
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;




}
