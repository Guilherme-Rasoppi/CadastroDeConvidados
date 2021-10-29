fun main(args: Array<String>) {

    var convidados = mutableListOf(
        "Guilherme", "Carol", "Mariana", "Rafael", "Tiago", "Diogo"
    )

    while (true){

        print("Deseja prosseguir?: ")
        var simNao = readLine()!!

        if (simNao != "Sim"){
            break
        }
        var num = 0
        print("Digite 1 para adicionar um usuário" +
                "\nDigite 2 para remover um usuário" +
                "\nOu digite 3 para mostrar lista: ")
        num = readLine()!!.toInt()

        when(num){

             1 ->   if (num == 1){
                    print("Adicione uma pessoa para sua lista de convidados: ")
                    var nomeadicionado = readLine()!!
                    convidados.add(nomeadicionado)
                    }
             2 ->   if (num == 2){
                    print("Remova uma pessoa da sua lista de convidados: ")
                    var nomeremovido = readLine()!!
                    convidados.remove(nomeremovido)
                    }
             3 ->   if(num == 3){
                        println("\n$convidados")

                    }

        }


















    }



}