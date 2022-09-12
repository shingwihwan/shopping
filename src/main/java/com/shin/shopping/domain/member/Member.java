package com.shin.shopping.domain.member;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // username = google_1123213123123
    private String username;
    // password = "암호화(겟인데어)"
    private String password;
    private String email;
    private Role role;

    private String provider;
    private String providerId;

    private LocalDateTime createDate;

    @Builder
    public Member(String username, String password, String email, Role role, String provider, String providerId, LocalDateTime createDate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
        this.createDate = createDate;
    }
}
