package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String gameName;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Player playerOne;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Player playerTwo;

    private Integer playerOneScore;

    private Integer playerTwoScore;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Player winner;
}