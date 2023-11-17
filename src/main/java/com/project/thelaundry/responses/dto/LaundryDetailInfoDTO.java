package com.project.thelaundry.responses.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.thelaundry.entities.Laundry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LaundryDetailInfoDTO {
    private Long id;
    private float price;
    private float from;
    private float to;
    private String unit;

    @JsonIgnore
    private Laundry laundry;
}
