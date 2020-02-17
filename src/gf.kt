import java.lang.Math.random
import kotlin.random.Random

class Kvant(s: String, i: Int){


    var f = Kvantums()

}
class Kvantums{
var kvants:Array<String> = arrayOf("Аэро","Био","Айти","Робо","Гео")
    var g = Group( )
}
class Group (n:String,size : Int ) {
    var name = n
    var student: MutableList<Students> = MutableList(5, { Students() })
    var kv: Array<String> = arrayOf("Basic", "Hard", "Primary")
    fun display() {
        for (i in student) {
            i.display()
        }
    }
}

class Students {
    var names:Array<String> = arrayOf("Алина","Кристина","Властислав","Мстислав")
    var surnames:Array<String> = arrayOf("Кот","Блэк","Гришин","Твен")
    var third:Array<String> = arrayOf("Евгеньевич","Андреевна","Александровна","Васильевич")
    val birthdate = readLine()

    init {
        var names = names[Random.nextInt(names.size)]
        var surnames = surnames[Random.nextInt(surnames.size)]
        var third = third[Random.nextInt(third.size)]

    }
    fun display() {
        println(names +  " "+ surnames  + "" + third)
println(birthdate)

    }

}

    fun main(){
var m = Group("io",5)
m.display()


    }


