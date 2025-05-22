package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();
    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position){
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }
}
