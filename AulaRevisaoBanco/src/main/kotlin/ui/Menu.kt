package ui

fun menu(){
    do {
        println("1 - Cadastrar Caixa D Agua")
        println("2 - Editar Caixa de Agua")
        println("3 - Listar Caixa de Agua")
        println("4 - Excluir Caixa de Agua")
        println("0 - Sair")

        val opcao = readln().toInt()
        when (opcao) {
            0 -> println("Adeus amigo")
            1 -> println("Cadastrando caixa....")
            2 -> println("Editando Caixa.......")
            3 -> println("Listar caixas......")
            4 -> println("Cadastrando caixa de agua...")
            else -> println("Opcao invalida...")
        }
        }while (opcao != 0 )
    }