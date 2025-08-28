package com.back.domain.member.member.service;

import com.back.domain.member.member.dto.Member;
import com.back.domain.member.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member findById(int i) {
        return memberRepository.findById(i);
    }

    public Member findByUsername(String username) {
        return memberRepository.findByUsername(username);
    }
}