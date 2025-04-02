package br.com.fiap.tds.jadv.blogs.BlogWriter.domainmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter UUID id;

    @Column(length = 60, nullable = false )
    private @Getter @Setter String name;

    @Column(length = 60, nullable = false )
    private @Getter @Setter String email;

    @Column(length = 20, nullable = false )
    private @Getter @Setter String password;

    @OneToOne( mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private @Getter @Setter Profile profile;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
