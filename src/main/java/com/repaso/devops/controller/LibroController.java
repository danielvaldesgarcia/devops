package com.repaso.devops.controller;


import com.repaso.devops.entity.Libro;
import com.repaso.devops.service.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class LibroController {

    @Autowired
    private LibroServiceImpl libroServiceImpl;

    @GetMapping
    public List<Libro> obtenerTodos() {
        return this.libroServiceImpl.getLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibro(@PathVariable Long id) {
        return this.libroServiceImpl.getLibro(id);
    }

    @PostMapping
    void guardarOActualizar(@RequestBody Libro libro) {
        this.libroServiceImpl.guardarOActualizarLibro(libro);
    }

    @DeleteMapping("/{libroId}")
    void borrarLibro(@PathVariable("libroId") Long libroId) {
        this.libroServiceImpl.eliminarLibro(libroId);
    }

}
