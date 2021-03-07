package org.datamaster.ratings.controller;

import org.datamaster.ratings.dto.EpisodeRatingsDto;
import org.datamaster.ratings.service.TitleBasicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final TitleBasicsService titleBasicsService;

    @Autowired
    public HomeController(TitleBasicsService titleBasicsService) {
        this.titleBasicsService = titleBasicsService;
    }

    @GetMapping(value = {"/", "/home"})
    public String home(Model model) {
        String title = "Breaking Bad Best Episodes";
        model.addAttribute("title", title);

        List<EpisodeRatingsDto> episodeList = titleBasicsService.getEpisodeRatingsByTitle("Breaking Bad");
        model.addAttribute("episodeList", episodeList);

        return "home";
    }
}
