package br.com.fiap.tds.jadv.blogs.BlogWriter.domainmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter UUID id;

    private @Getter @Setter String name;

    private @Getter @Setter String email;

    private @Getter @Setter String password;


}
