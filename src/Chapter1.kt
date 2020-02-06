fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0} //can't have a null value
    println("The oldest is: $oldest")

    println(max(3,4))

    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    if (args.size > 0) {
        println("Again name: ${args[0]}!")
    }

    println("Hello hello hello, ${if (args.size > 0) args[0] else "Someone!"}")


    println(Color.BLUE.rgb())

}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Statement vs Expression
// expression has a value, which can be used as part of another expression, whereas a statement
// is always a top-level element in its enclosing block and does not have a value of it's own.

// Properties val generates a getter var generates and getter and setter

data class Person(val name: String, val age: Int? = null)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}

enum class Color (val r: Int, val g: Int, val b: Int) {
    RED(255,0,0), ORANGE(255, 165, 0), YELLOW(255,255,0),
    GREEN(0,255,0), BLUE(0,0,255),
    INDIGO(75,0,130), VIOLET(238,130,238);

    fun rgb() = (r * 256 + g) * 256 + b
}