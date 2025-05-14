package com.mycompany.clinica.validadores;

import com.mycompany.clinica.models.Cita;
import java.util.List;

public class ValidadorBase implements ValidadorDeCitas {
    @Override
    public boolean esValida(Cita nuevaCita, List<Cita> citasExistentes) {
        return true; // Validación base siempre pasa
    }
}