package com.ust.jpapractice.controller;

import com.ust.jpapractice.exception.ResourceNotFoundException;
import com.ust.jpapractice.model.Climber;
import com.ust.jpapractice.repository.ClimberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClimberController {
    @Autowired
    private ClimberRepository climberRepository;

    // get all climbers
    @GetMapping
    public List<Climber> getAllClimber() {
        return climberRepository.findAll();
    }

    // create all climbers REST API
    @PostMapping
    public Climber createClimber(@RequestBody Climber climber) {
        return climberRepository.save(climber);
    }

    // get climber by id REST API
    @GetMapping("/climbers/{id}")
    public ResponseEntity<Climber> getClimberById(@PathVariable long id) {
        Climber climber = climberRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Climber does not exist with id: " + id));
    }

    // update climber by REST API
    @PutMapping("/climber/{id}")
    public ReponseEntity<Climber> updateClimber(@PathVariable Long id, @RequestBody Climber climberDetails) {
        Climber climber =
    }


}
