package me.arok.hellospring;

import me.arok.hellospring.repository.MemberRepository;
import me.arok.hellospring.repository.MemoryMemberRepository;
import me.arok.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
