import java.util.Random;
import java.util.ArrayList;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        eleccion = new Random();
        respuestas = new ArrayList<String>();
        respuestas.add("Suena interesante, dime mas ...");
        respuestas.add("Necesito mas informacion ...");
        respuestas.add("Puedes ser mas concreto ...");
        respuestas.add("No te entiendo ...");
        respuestas.add("Nose como ayudarte necesito mas informacion ...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(eleccion.nextInt(respuestas.size()));
    }
}
