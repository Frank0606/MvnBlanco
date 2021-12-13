package uv.mx.sistemasweb;

import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {

        get("/aprobado", (req, res) -> {

            return "Espero sacar 10";

        });

    }
}
