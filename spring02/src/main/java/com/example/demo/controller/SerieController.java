package com.example.demo.controller;

import com.example.demo.models.Serie;
import com.example.demo.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/series")
public class SerieController {

    @Autowired
    private SerieService serieService;


    @GetMapping
    public List<Serie> listarSeries() {
        return serieService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> obtenerSeriePorId(@PathVariable Long id) {
        Optional<Serie> serie = serieService.buscarPorId(id);
        if (serie.isPresent()) {
            return ResponseEntity.ok(serie.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<Serie> crearSerie(@RequestBody Serie serie) {
        Serie nuevaSerie = serieService.guardar(serie);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaSerie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarSerie(@PathVariable Long id) {
        try {
            serieService.eliminar(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}