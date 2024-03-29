package com.study.chat.member.adapter.output.repository

import com.study.chat.member.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member, Long> {
    fun findByUsername(username: String): Member?
}
