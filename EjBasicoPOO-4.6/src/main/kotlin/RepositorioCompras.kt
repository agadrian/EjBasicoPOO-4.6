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
        val domiciliosUnicos = mutableSetOf<String>()
        for (compra in listaCompras){
            domiciliosUnicos.add(compra.cliente.domicilio.dirCompleta())
        }
        return domiciliosUnicos
    }
}