package com.examen.agenda.controllers;

import com.examen.agenda.entities.Tarea;
import com.examen.agenda.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> getTareas() {
        return tareaService.findAll();
    }

    @GetMapping("/{id}")
    public Tarea getTarea(@PathVariable Long id) {
        return tareaService.findById(id);
    }

    @PostMapping
    public Tarea saveTarea(Tarea tarea) {
        return tareaService.create(tarea);
    }

    @PutMapping("/{id}")
    public Tarea updateTarea(@PathVariable Long id, Tarea tarea) {
        return tareaService.update(id, tarea);
    }

    @DeleteMapping("/{id}")
    public void deleteTarea(@PathVariable Long id) {
        tareaService.delete(id);
    }

}
