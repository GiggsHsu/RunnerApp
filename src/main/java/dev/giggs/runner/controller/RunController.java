package dev.giggs.runner.controller;
import dev.giggs.runner.model.Run;
import dev.giggs.runner.repository.RunRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RunController {

    private final RunRepository runRepository;

    List<Run> findAll() {
        return null;
    }
}
