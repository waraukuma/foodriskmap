package com.hangaramit.foodriskmap.entity;


import jakarta.persistence.*;
import lombok.Data;


@SequenceGenerator(name = "MEMBER_SEQ", allocationSize = 1)
@Entity
@Data
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ")
    private Long id;

    @Column(length = 255)
    private String email;
    @Column(nullable = false, length = 255)
    private String pwd;

}
