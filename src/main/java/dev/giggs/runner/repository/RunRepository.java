package dev.giggs.runner.repository;

import dev.giggs.runner.model.Run;
import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import dev.giggs.runner.model.Location;
import dev.giggs.runner.model.Run;
import org.springframework.stereotype.Repository;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    public void init() {
        runs.add(new Run(1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(1, ChronoUnit.HOURS),
                3,
                Location.INDOOR));
    }
}
