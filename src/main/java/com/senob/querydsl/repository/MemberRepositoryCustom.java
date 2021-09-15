package com.senob.querydsl.repository;

import com.senob.querydsl.dto.MemberSearchCondition;
import com.senob.querydsl.dto.MemberTeamDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageCo(MemberSearchCondition condition, Pageable pageable);
}
