//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/** Поправь форматирование, лишние строки и отступы */
fun main() {


    //task 1

    var serverStatus = "processing"

    while (serverStatus != "success") {

        println("Статус: $serverStatus")
        serverStatus = "processing"
        serverStatus = "processing"
        serverStatus = "processing"
        serverStatus = "success"


    }

    println("Цикл завершен - $serverStatus")

    //task 2

    for (i in 1..5) {
        /** Тут необходимо использовать when для переменной i, у меня одна переменная принимает несколько значений возможных, when гораздо лучше читается в таких случаях */
        if  (i in 1..3 )println("Test $i: In process...")
        if  (i == 4 )println("Test 4 Failed")
        if  (i == 5 )println("Test 5 Success")

    }


    //task 3


    val duration = (1..30)
    val complexity = (1..5)

    when {

        duration < 10 -> println("Fast test")
        //не знаю как добавить в When доп условие
        duration in (10..30) and complexity in (1..3) -> {
            println("Standart test")
        }
        duration in (10..30) and complexity in (4..5) -> println("Difficult test")
        duration > 30 -> println("Long test")


    }







}
