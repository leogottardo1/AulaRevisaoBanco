package crud

import entidades.CaixaDAgua
import enumeradores.Material

fun cadastarCaixa(){
    /*
    class CaixaDAgua (
    val material: Material,
    val capacidade: Double?,
    val altura: Double,
    val largura: Double,
    val profundida: Double,
    val blablablabla: String,
     PLASTICO, PVC, METAL, ARGAMASSA
    */
    println("Escolha o material de qual a caixa é composta:")
    println("1 - Plastico")
    println("2 - PVC")
    println("3 - Metal")
    println("4 - Argamassa")
    val opcao = readln().toInt()
    var material : Material
    when(opcao) {
        1-> material = Material.PLASTICO
        2-> material = Material.PVC
        3-> material = Material.METAL
        4-> material = Material.ARGAMASSA
        else -> material = Material.PLASTICO
    }
    println("Capacidade da Caixa em Litros:")
    val litros = readln().toDouble()

    println("Largura da caixa:")

    //salvar as variaveis agora dentro da classe
    CaixaDAgua(
        material = material,
        blablablabla = bla,
        profundida = prof,
        largura = larg,
        altura = alt,
    )

}
fun editarCaixa(){

}
fun listarCaixas(){

}
fun excluirCaixa(){

}