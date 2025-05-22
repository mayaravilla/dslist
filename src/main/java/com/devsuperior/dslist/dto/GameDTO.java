package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameDTO(Game entity) {
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        title = entity.getTitle();
        id = entity.getId();
    }
}
