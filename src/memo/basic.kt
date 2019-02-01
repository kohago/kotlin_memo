package memo

//fun
fun sum(a:Int,b:Int):Int {
    if (a>b)
        return a + b
    else
        return b-a

}

fun sum1(a:Int,b:Int) = if (a>b)  a+b else b


fun nothin(a:Int,b:Int){
    print("nothing")
}

fun nothing1(a:Int,b:Int):Unit{
    print("nothing1")
}

//val( can set value only once)
fun testVal(){
    val a:Int =1
    val b =1

    val c:Int
    c = 1
}

//var( can set for many times)
fun testVar(){
    var x= 5
    x=4
    x=3

    print(x)
}

/**
 *
 * this is comment have many lines
 *
 */

//type , is ,Any

fun testType(v: Any){
    var a = 1
    if ( a is Int){
        print("a is int")
    }

    if (v is String){
        print("v is string")
    }
}

//loop
fun testLoop(){
    var vs:=Array<Int>{
        1,2,3,4
    }
}