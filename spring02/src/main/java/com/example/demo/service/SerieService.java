package com.example.demo.service;

import com.example.demo.models.Serie;
import com.example.demo.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    public List<Serie> listarTodas() {
        return serieRepository.findAll();
    }

    public Optional<Serie> buscarPorId(Long id) {
        return serieRepository.findById(id);
    }

    public Serie guardar(Serie serie) {
        return serieRepository.save(serie);
    }

    public void eliminar(Long id) {
        serieRepository.deleteById(id);
    }
}