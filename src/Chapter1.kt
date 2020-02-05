fun main() {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0} //can't have a null value
    println("The oldest is: $oldest")
}

data class Person(val name: String, val age: Int? = null)
