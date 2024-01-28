/**
 * Ejercicio 4.6¶
 * Realizar el ejercicio 1 de Conjuntos de los "Ejercicios básicos con Kotlin" (Ejercicio 3.3.1) orientado a objetos.
 *
 * Te proporciono algunas pistas de una posible solución:
 *
 * /**
 * * Clase Compra
 * * @param cliente cliente que realizo la compra
 * * @param dia dia de la compra
 * * @param monto monto de la compra
 * * @constructor Crea una compra con cliente, dia y monto
 * */
 * /**
 *  * Clase Cliente
 *  * @param nombre nombre del cliente
 *  * @param domicilio domicilio del cliente
 *  * @constructor Crea un cliente con nombre y domicilio
 *  */
 *  ```
 * /** * Clase Domicilio * @param calle calle del domicilio * @param numero numero del domicilio * @constructor Crea un domicilio con calle y numero */ ```
 * La clase Domicilio tendrá un método llamado dirCompleta()que retornará el domicilio completo con la calle y el número.
 *
 * Las clases Compra, Cliente y Domicilio se establecerán como data class, es decir, delante de class incluirán el modificador data en la declaración de dichas clases.
 *
 * Para entender mejor que es una data class, visualizar el siguiente enlace: Data classes
 *
 * /**
 *  * Clase RepositorioCompras
 *  * @constructor Crea un repositorio de compras
 *  */
 * La clase RepositorioCompras tendrá un método para agregar una compra al repositorio y un método domicilios para retornar los domicilios de cada cliente al cual se le debe enviar una factura de compra. Esta función retorna una estructura que contenga cada domicilio una sola vez.
 */


fun main() {
    // Creamos los domicilios, clientes y compras
    val domicilio1 = Domicilio("Juan Juanito", 3)
    val domicilio2 = Domicilio("Calle perinavo", 38)

    val cliente1 = Cliente("Antonio", domicilio1)
    val cliente2 = Cliente("Pedrto", domicilio2)

    val compra1 = Compra(cliente1, "3", 34.4)
    val compra2 = Compra(cliente1, "5", 566.7)
    val compra3 = Compra(cliente2, "2", 18.7)
    val compra4 = Compra(cliente2, "15", 69.7)
    val compra5 = Compra(cliente2, "6", 8.7)

    // Añadimos las compras al repositorio
    val repositorio = RepositorioCompras()
    repositorio.agregarCompra(compra1)
    repositorio.agregarCompra(compra2)
    repositorio.agregarCompra(compra3)
    repositorio.agregarCompra(compra4)
    repositorio.agregarCompra(compra5)

    // Imprimimos los domicilios unicos
    println("Domicilios unicos: ")
    repositorio.domicilios().forEach { println(it) }

}