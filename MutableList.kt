fun main() {
    val entrees = mutableListOf<String>()
    // val entrees: MutableList<String> = mutableListOf()
    println("Entrees: $entrees")
    println("Add noodles: ${entrees.add("noodles")}")
	println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
	println("Entrees: $entrees")
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
	println("Entrees: $entrees")
    
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
	println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
	println("Entrees: $entrees")
    println("Remove first element: ${entrees.removeAt(0)}")
	println("Entrees: $entrees")
    
    entrees.clear()
	println("Entrees: $entrees")
    println("Empty? ${entrees.isEmpty()}")
}