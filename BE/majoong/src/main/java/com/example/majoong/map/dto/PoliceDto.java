package com.example.majoong.map.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoliceDto {
    private Long policeId;
    private double longitude;
    private double latitude;
    private String address;
}