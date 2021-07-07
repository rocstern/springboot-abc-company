package com.company.abc.dto;

import com.company.abc.domain.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MemberInsertDTO {

    private String name;

    private String phoneNumber;

    private String job;

    private int career;

    private Long teamId;
}
