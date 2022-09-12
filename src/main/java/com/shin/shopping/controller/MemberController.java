package com.shin.shopping.controller;

import com.shin.shopping.domain.member.Member;
import com.shin.shopping.domain.member.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/login/oauth2")
    public String login(){
        return "success";
    }

    @GetMapping("/member/signup")
    public String signup(){
        return "/joinForm";
    }

    @PostMapping("/member/signup")
    public String signup(Member member){
        System.out.println(member);
        signupMember(member);
        return "redirect:/";
    }

    /**
     * 회원가입 메서드
     * @param member
     */
    private void signupMember(Member member){
        member.setRole(Role.USER);
        member.setCreateDate(LocalDateTime.now());
        String encodePassword = bCryptPasswordEncoder.encode(member.getPassword());
        member.setPassword(encodePassword);
    }
}
