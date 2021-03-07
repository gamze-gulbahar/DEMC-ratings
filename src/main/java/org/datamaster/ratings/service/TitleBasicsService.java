package org.datamaster.ratings.service;

import org.datamaster.ratings.dto.EpisodeRatingsDto;
import org.datamaster.ratings.repository.TitleBasicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TitleBasicsService {

    private final TitleBasicsRepository titleBasicsRepository;

    @Autowired
    public TitleBasicsService(TitleBasicsRepository titleBasicsRepository) {
        this.titleBasicsRepository = titleBasicsRepository;
    }

    public List<EpisodeRatingsDto> getEpisodeRatingsByTitle(String title){
        return titleBasicsRepository.findEpisodeRatingsByTitle(title)
                .stream().map(this::convertResult).collect(Collectors.toList());
    }

    private EpisodeRatingsDto convertResult(Object[] objects) {
        return new EpisodeRatingsDto((String) objects[0], (Float) objects[1], (Integer) objects [2], (Integer) objects[3]);
    }

}
