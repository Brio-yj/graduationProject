package com.example.msaauth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String email;

    private String password;
    @Column(name="username")
    private String userName;

    @Enumerated(EnumType.STRING)
    private Authority authority;
}
