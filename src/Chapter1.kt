fun main() {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0} //can't have a null value
    println("The oldest is: $oldest")

    println(max(3,4))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Statement vs Expression
// expression has a value, which can be used as part of another expression, whereas a statement
// is always a top-level element in its enclosing block and does not have a value of it's own.

data class Person(val name: String, val age: Int? = null)
