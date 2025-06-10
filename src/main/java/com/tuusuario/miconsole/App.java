package com.tuusuario.miconsole;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
  {
  String texto = "Hola Maven en la nube  ";
    System.out.println("¿Texto está en blanco?: " + StringUtils.isBlank(texto));
    System.out.println("Texto sin espacios: '" + StringUtils.trim(texto) + "'");
    
    Persona persona = new Persona("Brayan", 30);
    String json = new Gson().toJson(persona);
    System.out.println("Persona en JSON: " + json);
  }
}









