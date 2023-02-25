import java.lang.StringBuilder
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    //Zadatak 1: Ispiši svoje ime na konzolu
    val myname = "ZlatkoSalitrezic"
    println("My name is $myname")

    //Zadatak 2: ime da bude u navodnicima
    println("My name is \"Zlatko\"")

    //zadatak 3: Ispiši string "Two types of slashes : \ and /" na konzolu
    println("Two types of slashes: \\ and /")

    //zadatak 4: DZ ispiši zeca, spremi svaki red u zasebnu varijablu (asciart)
    println("(\\(\\")
    println("(-,-)")
    println("o_(\")(\")")

    //string
    val myName1 ="renato"
    println("My name is ${myName1.capitalize()}")
    println("Length of ma name: ${myName1.length}")

    var myText = "   lot of spaces   "
    println("myText: $myText")
    println("myText: length before trimming: ${myText.length}")

    myText = myText.trim()
    println("myText: $myText")
    println("myText: length before trimming: ${myText.length}")

    val myPet = "Cat"
    println(myPet[0])
    println(myPet.substring(1))
    println(myPet.substring(0,2))

    val myPet2 = "crocodile"
    println(myPet2.substring(2,5))
    println("----------------------------")

    //zadatak: Definiraj broj jabuka i banana u trgovini te ispisi "The total number of fruit is X" gdje je x zbroj količine jabuka i banana
    val jabuka = 2
    val banana = 3
    println("Total number is ${jabuka + banana}")
    println(jabuka::class.java)  //ispisuje da je broj int

    val num1 = 20           //immutable proučiti
    val num2 = 3.14F
    println(num1 + num2)
    val result: Int = (num1 * num2).roundToInt()
    println(result)

    var myBoolean1 = true
    var myBoolean2 = false
    myBoolean1 = !myBoolean1 // ! okreće u negaciju
    println(myBoolean1 || myBoolean2) // || ili
    println(myBoolean1 && myBoolean2) // && i
    print(myBoolean1)
}
