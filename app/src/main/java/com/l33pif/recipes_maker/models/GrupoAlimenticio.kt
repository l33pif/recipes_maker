package models

abstract class GrupoAlimenticio()
{
    abstract var alimentos:Array<String>

    fun getAlimentos():String
    {
        var cadena=""
        for( (id,elemento) in alimentos.withIndex())
        {
            cadena+= ("${id+1}. $elemento \n")
        }
        return cadena
    }

    //Método que dibuja un menu generico para cada objeto de alimento
    fun getMenu(array:Array<String>,index:Int)
    {
        var response:String?
        println(
            "Escoje un alimento: \n" + getAlimentos()
        )
        print("Opcion: ")
        response = readLine()

        if ((response?.toInt() is Int) && (response?.toInt() <= alimentos.size)) {
            array.set(index-1, alimentos.get(response?.toInt()-1))
            println("Ingrediente agregado")
        } else {
            println("Opcion incorrecta")
        }
    }
}