package com.paygo.basespringapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity(name = "")
@RequiredArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
}
