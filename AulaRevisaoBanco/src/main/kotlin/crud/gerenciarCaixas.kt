package crud

import entidades.CaixaDAgua
import enumeradores.Material
import java.sql.Connection

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

    fun criarTabelaCaixa(){
        val conectar = EntidadeJDBC(
            url = "jdbc:postgresql://localhost:5432/revisao",
            usuario = "postgres",
            senha = "5432"
        )
        conectar.conectarComBanco()
        val sql = "Create table if not exists CaixaDAgua " +
                " (id serial NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                " material varchar (255), " +
                " capacidade float, " +
                " altura float, " +
                " largura float, " +
                " profundidade float, " +
                " blablablabla float, " +
                ")"
        //cada coluna da tabela precisa ter o mesmo dos atiributos da Entidade
        //BigDecima no banco sera uma string, por exemplo o preço
        val banco = conectar.conectarComBanco()
        val enviarParaBanco = banco!!.createStatement().execute(sql)

        println(enviarParaBanco)

        banco.close()//Encerra a conexão com o banco
    }

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