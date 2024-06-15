package com.examen.agenda.services;

import com.examen.agenda.entities.Tarea;
import com.examen.agenda.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    @Override
    public List<Tarea> findAll() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea findById(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }

    @Override
    public Tarea create(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public Tarea update(Long id, Tarea tarea) {
        if (tareaRepository.existsById(id)) {
            tarea.setId(id);
            return tareaRepository.save(tarea);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (tareaRepository.existsById(id)) {
            tareaRepository.deleteById(id);
        }
    }
}
