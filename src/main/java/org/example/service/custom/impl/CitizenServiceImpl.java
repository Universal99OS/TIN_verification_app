package org.example.service.custom.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Entity.Citizen;
import org.example.dto.CitizenDto;
import org.example.repository.CitizenRepository;
import org.example.service.custom.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class CitizenServiceImpl implements CitizenService {
    @Autowired
    ObjectMapper mapper;

    @Autowired
    CitizenRepository citizenRepository;
    @Override
    public boolean save(CitizenDto dto) {
        Citizen citizen = mapper.convertValue(dto, Citizen.class);
        citizenRepository.save(citizen);
        System.out.println("repo");
        return true;
    }

    @Override
    public boolean update(CitizenDto dto) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<CitizenDto> getAll() {
        return null;
    }
}
