package io.wisoft.avocadobackendhexagonal.domain.member.application.port.out;

import io.wisoft.avocadobackendhexagonal.domain.member.domain.Member;

public interface DeleteMemberPort {
    void delete(final Member member);
}
