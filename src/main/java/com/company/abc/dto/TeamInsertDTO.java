package com.company.abc.dto;

import com.company.abc.domain.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeamInsertDTO {

    private String name;

    private Long companyId;

}
