package br.com.etechoracio.descartesustentavel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_DESCARTE_ELETRONICO", schema = "dbo")
public class DescarteEletronico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DESCARTE")
    private Long id;

    @Column(name = "TX_MATRICULA_ALUNO")
    private String matriculaAluno;

    @Column(name = "TX_TIPO_ITEM")
    private String tipoItem;

    @Column(name = "NR_PESO_GRAMAS")
    private Double pesoGramas;

    @Column(name = "NR_PONTOS_GERADOS")
    private Integer pontosGerados;

    @Column(name = "CHK_VALIDADO")
    private Boolean validado;
}