package models

class Receta {

    val agua=Agua()
    val leche=Leche()
    val carne=Carne()
    val verdura=Verduras()
    val fruta=Frutas()
    val cereal=Cereal()
    val huevo=Huevos()
    val aceite=Aceites()

    protected var seleccion = Array(8,{s->""})
    fun setSeleccion(i: Int, value: String) {
        seleccion.set(i, value)
    }

    fun getSeleccion(): String {
        var cadena = ""

        for(c in seleccion){
            if (!(c.equals(""))){
                cadena += " $c -"}
        }
        return cadena
    }

    //Menu de hacer receta
    fun makeRecipe() {
        var response: String?
        do {
            println(
                """
Hacer receta
Selecciona por categoría el ingrediente que buscas
1. Agua
2. Leche
3. Carne
4. Verduras
5. Frutas
6. Cereal
7. Huevos
8. Aceites
9. Atras""".trimMargin()
            )
            print("Opción: ")
            response = readLine()
            println()
            when (response) {
                "1" -> agua.getMenu(seleccion,1)
                "2" ->leche.getMenu(seleccion,2)
                "3" -> carne.getMenu(seleccion,3)
                "4" -> verdura.getMenu(seleccion,4)
                "5" ->fruta.getMenu(seleccion,5)
                "6" -> cereal.getMenu(seleccion,6)
                "7" ->huevo.getMenu(seleccion,7)
                "8" -> aceite.getMenu(seleccion,8)
                "9" -> println("Retrocediendo...")
                else -> println("Opción incorrecta")
            }
        } while (!(response.equals("9")))
    }

    //Menu de ver receta
    fun viewRecipe() {
        println("Tu recetas es: " + getSeleccion())
    }
}