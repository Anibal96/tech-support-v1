import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    //Atributo que se encarga de elegir la respuesta.
    private Random eleccion;
    //Coleccion que almacena las respuesta.
    private ArrayList<String> respuestas;
    //Atributo que almacena las palabras claves con su mensaje
    private HashMap<String, String> palabrasClave;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        eleccion = new Random();
        respuestas = new ArrayList<String>();
        palabrasClave = new HashMap<String, String>();
        respuestas.add("Suena interesante, dime mas ...");
        respuestas.add("Necesito mas informacion ...");
        respuestas.add("Puedes ser mas concreto ...");
        respuestas.add("No te entiendo ...");
        respuestas.add("Nose como ayudarte necesito mas informacion ...");

        palabrasClave.put("pepe", "Hola Pepe");
        palabrasClave.put("juan", "Que tal Juan");
        palabrasClave.put("alba", "Como estas Alba");
        palabrasClave.put("pepito", "Buenas Pepito");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String clave)
    {
        String respuesta;
        respuesta = palabrasClave.get(clave);
        if (respuesta == null){
            respuesta = respuestas.get(eleccion.nextInt(respuestas.size()));
        }
        return respuesta;
    }

    /**
     * Metodo que genera las respuestas a las palabras claves
     */
    public String generateResponseSpecials(String clave){
        return palabrasClave.get(clave);
    }
}
