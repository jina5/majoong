package com.example.majoong.map.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "saferoad")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SafeRoad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long safeRoadId;
    private double longitude;
    private double latitude;
    private String address;
    private Long safeRoadNumber;
}
