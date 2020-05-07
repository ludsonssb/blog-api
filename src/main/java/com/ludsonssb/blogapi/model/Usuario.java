package com.ludsonssb.blogapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataCadastro;
    private boolean proprietario;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "usuario")
    private List<Publicacao> publicacao;

}
