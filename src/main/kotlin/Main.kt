
fun main() {
    print("Enter your current city: ")
    val city = readlnOrNull()?.trim()

    if (city.isNullOrEmpty()) {
        println("You didn't enter a city!")
    } else {
        println("User lives in $city!")
    }
}