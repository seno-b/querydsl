package com.senob.querydsl.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberTeamDto {

    private Long memberId;
    private String username;
    private Integer age;
    private Long teamId;
    private String teamName;

    public MemberTeamDto(Long memberId, String username, Integer age, Long teamId, String teamName) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
        this.teamId = teamId;
        this.teamName = teamName;
    }
}
