import models.*

//Método principal donde inicia todo el programa
fun main(args:Array<String>){
    val receta=Receta()
    var response:String?

    do {
        println(
            """
:: Bienvenido a Recipes Maker ::


Selecciona la opción deseada:
1. Hacer la receta
2. Ver mis recetas
3. Salir
    """.trimMargin()
        )
        print("Opción:")
        response=readLine()

        when(response){
            "1" -> receta.makeRecipe()
            "2" -> receta.viewRecipe()
            "3" -> println("Saliendo...")
            else -> println ("Opción no válida")
        }
    }while(!(response.equals("3")))
}