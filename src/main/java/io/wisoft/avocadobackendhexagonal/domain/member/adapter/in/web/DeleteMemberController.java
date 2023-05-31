package io.wisoft.avocadobackendhexagonal.domain.member.adapter.in.web;

import io.wisoft.avocadobackendhexagonal.domain.member.application.port.in.DeleteMemberUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeleteMemberController {

    private final DeleteMemberUseCase deleteMemberUseCase;

    @DeleteMapping("/api/members/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable("id") final Long id) {
        deleteMemberUseCase.delete(id);
        return ResponseEntity.ok().build();
    }
}
