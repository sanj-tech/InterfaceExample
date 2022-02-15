/*interface myInterface {
    val test: Int //abstract property

    fun foo(): String //abstract

    fun hello() { //non abstract method
        println("Hi")
    }
}
    class InterfaceImpl : myInterface {
        override var test: Int = 90
        override fun foo(): String {
            return "ajay"
        }
    }

    fun main() {

        var obj = InterfaceImpl()

        println("test = ${obj.test}")
        print("Calling hello(): ")

        obj.hello()

        print("Calling and printing foo(): ")
        println(obj.foo())

    }*/


/*
interface myInterface{
    var add:Int //abstract property
    fun calculate(a: Int, b: Int):Int //abstract function
    fun sumOfNumber(){
        println("Performing addtion of tw number")
    }


}
class InterfaceImpl:myInterface{
    override var add: Int = 10
    override fun calculate(a:Int,b:Int): Int {
        return a+b
    }

}
class InterfaceImpl1:myInterface{
    override var add: Int = 10
    override fun calculate(a:Int,b:Int): Int {
        return a-b
    }

}
class InterfaceImpl2:myInterface{
    override var add: Int = 10
    override fun calculate(a:Int,b:Int): Int {
        return a*b
    }

}
class InterfaceImpl3:myInterface{
    override var add: Int = 10
    override fun calculate(a:Int,b:Int): Int {
        return a/b
    }

}

fun main() {
    var obj=InterfaceImpl()
   println(obj.calculate(10,30))


    var obj1=InterfaceImpl1()
    println( obj1.calculate(30,20))

    var obj2=InterfaceImpl2()
    println( obj2.calculate(10,20))

    var obj3=InterfaceImpl3()
    println( obj3.calculate(100,20))

}


*/


/*
interface myInterface{
    fun showDetails(name:String,id:Int): String
}

class interfaceImpl:myInterface{
    override fun showDetails(name: String, id: Int): String {
       return name+id
    }

}
class interfaceImpl1:myInterface{
    override fun showDetails(name: String, id: Int): String {
        return name + id
    }

}

fun main() {
   var obj=interfaceImpl()
   println( obj.showDetails("anu",  1))

    var obj1=interfaceImpl1()
    println( obj1.showDetails("Sanj",  2))
}
*/

//Implementing Two or More Interfaces in a Class


interface A{
 fun hello(){
     println("i am from A")
 }
}
/*interface B{
    fun hi(){
        println("i am from b")
    }
}
class ShowImpl:A,B
fun main() {
    var obj=ShowImpl()
     obj.hi()
    obj.hello()
}*/


/*
interface A {

    fun callMe() {
        println("From interface A")
    }
}

interface B  {
    fun callMeToo() {
        println("From interface B")
    }
}

// implements two interfaces A and B
class Child: A, B

fun main(args: Array<String>) {
    val obj = Child()

    obj.callMe()
    obj.callMeToo()
}
*/

//Resolving overriding conflicts (Multiple Interface)
interface P{
    fun callMe(){
        println("you want to call me")
    }
}
interface Q{
    fun callMe(){
        println("Yes,I want to call you")
    }
}
class CallImpl:P,Q{
    override fun callMe() {
        super<P>.callMe()
        super<Q>.callMe()
    }

}

fun main(){
   var callimpl=CallImpl()
   callimpl.callMe()
}
