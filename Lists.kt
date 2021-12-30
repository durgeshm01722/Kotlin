fun main() {
    val numbers = listOf(1,2,3,4,5)
    // val numbers: List<Int> = listOf(1,2,3,4,5)
    println("List: ${numbers}")
    println("List: ${numbers.size}")
    
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
	println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
	println("Last: ${numbers.last()}")
    
    println("Contains 4? ${numbers.contains(4)}")
	println("Contains 7? ${numbers.contains(7)}")
    
    println("Reversed list: ${numbers.reversed()}")
	println("List: $numbers")
    
    println("Sorted list: ${numbers.sorted()}")
}