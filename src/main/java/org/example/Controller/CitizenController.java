package org.example.Controller;

import org.example.dto.CitizenDto;
import org.example.service.custom.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citizen")

@CrossOrigin
public class CitizenController {
    @Autowired
    CitizenService citizenService;
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean save(@RequestBody CitizenDto dto){
        return citizenService.save(dto);
    }
}
