package com.senob.querydsl.repository;

import com.senob.querydsl.dto.MemberSearchCondition;
import com.senob.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
