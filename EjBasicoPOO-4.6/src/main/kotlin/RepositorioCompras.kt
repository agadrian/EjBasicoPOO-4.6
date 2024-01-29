/**
 * Clase RepositorioCompras
 * @constructor Crea un repositorio de compras
 */
class RepositorioCompras(){
    private val listaCompras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra){
        listaCompras.add(compra)
    }

    fun domicilios(): Set<String>{

        return listaCompras.map {it.cliente.domicilio.dirCompleta()}.toSet() // <-- Lo mismo que abajo de una mejor forma


        /*val domiciliosUnicos = mutableSetOf<String>()
        for (compra in listaCompras){
            domiciliosUnicos.add(compra.cliente.domicilio.dirCompleta())
        }
        return domiciliosUnicos*/
    }
}