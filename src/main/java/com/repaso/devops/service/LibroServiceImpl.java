package com.repaso.devops.service;


import com.repaso.devops.entity.Libro;
import com.repaso.devops.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> getLibros(){
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> getLibro(Long id){
        return libroRepository.findById(id);
    }

    @Override
    public void guardarOActualizarLibro(Libro libro) {
        libroRepository.save(libro);
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}
