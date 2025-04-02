package br.com.fiap.tds.jadv.blogs.BlogWriter.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

public class Profile {

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "PROFILE_")
    @ToString
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private @Getter
        @Setter UUID id;

        @Column(length = 60, nullable = false)
        private @Getter @Setter String name;

        @Column(length = 60, nullable = false)
        private @Getter @Setter String email;

        @Column(length = 60, nullable = false)
        private @Getter @Setter String password;

        @Column(length = 60, nullable = false)
        private @Getter @Setter String profilePictureURL;

        @OneToOne
        @JoinColumn (name="user_id", foreignKey = )


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof br.com.fiap.tds.jadv.blogs.BlogWriter.domainmodel.User profile)) return false;
            return Objects.equals(id, profile.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }
    }

    }

