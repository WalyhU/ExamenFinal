package com.examen.agenda.services;

import com.examen.agenda.entities.Tarea;

import java.util.List;

public interface TareaService {
    public List<Tarea> findAll();
    public Tarea findById(Long id);
    public Tarea create(Tarea tarea);
    public Tarea update(Long id, Tarea tarea);
    public void delete(Long id);
}
