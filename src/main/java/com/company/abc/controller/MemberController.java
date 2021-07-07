package com.company.abc.controller;

import com.company.abc.domain.Member;
import com.company.abc.domain.Team;
import com.company.abc.dto.MemberInsertDTO;
import com.company.abc.service.MemberService;
import com.company.abc.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    TeamService teamService;

    @GetMapping
    public List<Member> getMembers()
    {
        return memberService.getMembers();
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id)
    {
        return memberService.getMember(id);
    }

    //post로 insert
    @PostMapping
    public Member insertMember(@RequestBody MemberInsertDTO req)
    {
        Team team = teamService.getTeam(req.getTeamId());
        Member member = new Member();


        member.setName(req.getName());
        member.setPhoneNumber(req.getPhoneNumber());
        member.setJob(req.getJob());
        member.setCareer(req.getCareer());
        member.setTeam(team);

        return memberService.saveMember(member);
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Long id, @RequestBody MemberInsertDTO req)
    {
        Member member = memberService.getMember(id);
        Team team = teamService.getTeam(req.getTeamId());

        member.setName(req.getName());
        member.setPhoneNumber(req.getPhoneNumber());
        member.setJob(req.getJob());
        member.setCareer(req.getCareer());
        member.setTeam(team);

        return memberService.saveMember(member);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Long id)
    {
        memberService.deleteMember(id);
    }








}
