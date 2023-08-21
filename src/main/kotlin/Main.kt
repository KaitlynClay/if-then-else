fun main(args: Array<String>) {

    print("Please enter your temperature: ")
    val temperature = readLine()!!.toDouble()
    val low = 97.5
    val high = 99.5

    if (temperature < low)
        println("Your temperature is low.")
    else if (temperature <= high)
        println("Your temperature is normal.")
    else
        println("Your temperature is high.")


}