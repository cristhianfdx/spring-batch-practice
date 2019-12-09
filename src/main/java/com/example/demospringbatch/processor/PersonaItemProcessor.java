package com.example.demospringbatch.processor;

import com.example.demospringbatch.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class PersonaItemProcessor implements ItemProcessor<Persona, Persona> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaItemProcessor.class);

    @Override
    public Persona process(Persona item) throws Exception {
        String nombre = item.getNombre().toUpperCase();
        String apellido = item.getApellido().toUpperCase();
        String telefono = item.getTelefono();

        Persona persona = new Persona(nombre, apellido, telefono);

        LOGGER.info("Convirtiendo (" + item + ") anterior a (" + persona + ")");
        return persona;
    }
}
