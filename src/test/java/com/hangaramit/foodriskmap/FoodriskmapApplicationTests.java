package com.hangaramit.foodriskmap;

import com.hangaramit.foodriskmap.entity.Member;
import com.hangaramit.foodriskmap.repository.MemberRepository;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@SpringBootTest
class FoodriskmapApplicationTests {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    HttpSession session;

    @Test
        //회원정보 바르게 저장 및 변경
    void MemberRepositoryTest() {
        Member member = new Member();

        member.setId(1L);
        member.setEmail("ggoreb@naver.com");
        member.setPwd("12345");
        memberRepository.save(member);
    }

    @Test
//     비밀번호 암호화 적용확인
    void PassworEncodingTest() {
        Member member = new Member();

    }
}