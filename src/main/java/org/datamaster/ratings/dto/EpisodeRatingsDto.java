package org.datamaster.ratings.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EpisodeRatingsDto {
    private String primaryTitle;
    private Float averageRating;
    private Integer seasonNumber;
    private Integer episodeNumber;
}
