package com.vbs.vds.controller;

import com.vbs.vds.models.History;
import com.vbs.vds.repositories.HistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HistoryController {
    @Autowired
    HistoryRepo historyRepo;

    @GetMapping("/histories")
    public List<History> getHistory()
    {
        return historyRepo.findAll();
    }
}
