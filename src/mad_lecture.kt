fun main(){
    val a=String.format("%07d",31416)
    val b=String.format("%+.4f",3.141592)
    val c=String.format("%07d",31416)
    val helloString = String.format("%s %S", "hello", "world")
    println(helloString)
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    riversArray += "Mississippi"
    println(riversArray.joinToString())
    val asc = Array(10) { i -> ((3 * i)/8.0).toString() }
    println(asc.joinToString())
    println("Enter 1:Addition, 2:Sunstraction, 3:Multiplication, 4:Division")
    val i=readln()
    val x=2
    val y=2
    when (i) {
        "1" -> println("${x+y}")
        "2" -> println("${x-y}")
        "3" -> println("${x*y}")
        "4" -> println("${x/y}")
    }
    var isPrime = true
    print("Enter any number : ")
    var num = readln().toInt()

    for (i in 2..num/2)
        if (num % i == 0)
            isPrime = false

    println(
        if(isPrime)
            "$num is prime"
        else
            "$num is not prime"
    )
    var p=Person()
}
class Person(){
    var age:Int = 0
    var batch:String = "CE"
    init {
        println("Age: $age , Batch:$batch")
    }
}

