//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/** Поправь форматирование, лишние строки и отступы */
//поправил форматирование, по отступам хотел уточнить
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

    //task 2 - поправил
    for (i in 1..5) {
        /** Тут необходимо использовать when для переменной i, у меня одна переменная принимает несколько значений возможных, when гораздо лучше читается в таких случаях */
        when (i) {
            in 1..3 -> println("Test $i: In process...")
            4 -> println("Test 4 Failed")
            5 -> println("Test 5 Success")
        }
    }

    //task 3 - переделал
    fun difficultyCheck(duration: Int, complexity: Int): String {
    return when  {
        duration < 10 -> "Fast test"
        duration in 10..30 && complexity in 1..3 -> "Standart Test"
        duration in 10..30 && complexity in 4..5 -> "Difficult Test"
        duration > 30 -> "Long Test"
        else -> "Super Long Test"
    }
}
    println(difficultyCheck(23,55))
}
