package memo

fun main(){
    //test open,override
    Cat().cry()
    Dog().cry()

    //test abstract
    Cat1().cry()
    Dog1().cry()

    testObject()
    //like java's static method
    Animal.create().cry()

    TestCompanion.cry()
}

/**
 * default class is can't be inherited.
 * so, have to add "open" to class
 */
open class Animal{

    /**
     * An object declaration inside a class can be marked with the companion keyword
     * The name of the companion object can be omitted
     */
    companion object{
        fun create():Animal=Animal()
    }

    /**
     * fun in class is the same, if you want ,
     * have to add "open" to the fun
     */
    open fun cry(){
        println("go away.")
    }
}

class Cat:Animal(){
    //have to add override
    override fun cry(){
        println("nyaa")
    }
}

class Dog:Animal(){
    //have to add override
    override fun cry(){
        println("wan")
    }
}

/**
 * abstract class must be inherited.
 * so, no need to add  "open" to class
 */
abstract class Animal1{
    /**
     * must be inherited
     */
    abstract fun cry()
}

class Cat1:Animal1(){
    //have to add override
    override fun cry(){
        println("nyaa,i am from abstract")
    }
}

class Dog1:Animal1(){
    //have to add override
    override fun cry(){
        println("wan,i am from abstract")
    }
}


/**
 * use object keyword to create object from  anonymous class
 */

fun testObject(){
    var helloWorld=object {
        val hello ="Hello"
        val world="World"

        fun printMe(){
            println("i am object from anonymous class. $hello,$world")
        }
    }
    helloWorld.printMe()
}

/**
 * companion object  is class level
 */
class TestCompanion (
    //here is property
    val name:String
){
    companion object {
        //here is class level fun
        fun cry(){
            println("i am companion !!")
        }
    }
}

/**
 * see kotlin from java
 * var -> set,get
 * val -> get
 * when use @jvmField,can use the property directly
 */
class KotlinClassA{
    @JvmField val a:Int = 1
    @JvmField var b:Int = 2
}