package com.schiphol.alpha.persistence.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Driver {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String carType;
    @Column(unique = true)
    private String ipAddress;
    private String lat;
    private String lng;
    private LocalDateTime lastUpdateTime;
    private String emailId;
}
