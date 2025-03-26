package com.freelance.fundoscope_backend.application.dto.patient;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PatientResponseDto {

    private Long id;

    private String name;

    private String age;

    private String gender;

    private String address;

    private String email;

    private String state;

    private String dateOfBirth;

    private String phoneNumber;

    private String imageBase64;

}
