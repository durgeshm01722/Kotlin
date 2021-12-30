fun main() {
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    println(peopleAges)
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)
    peopleAges["Fred"] = 31
    println(peopleAges)
    
    peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    
    val filteredNames = peopleAges.filter { it.key.length < 4 }
	println(filteredNames)
}