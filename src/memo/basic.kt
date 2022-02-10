package memo

fun main(args:Array<String>){
    println(bigger(1,2))
    println(biggerOneline(1,2))
    nothing(1,2)
    unit(1,2)
    testVal()
    testVar()
    testType(1)
    testType("1")
    testCollection()

    testLet(1)
    testWith("a")
    inline()
    testFunParam(1,fun (p:Int):Int{
         println("testFunParam")
        return p+1
    })
}

//fun
fun bigger(a:Int,b:Int):Int {
    if (a>b)
        return a
    else
        return b

}
//one line fun
fun biggerOneline(a:Int,b:Int) = if (a>b)  a else b

//no return
fun nothing(a:Int,b:Int){
    println("nothing")
}

//no return
fun unit(a:Int,b:Int):Unit{
    println("nothing to return")
}

//val( can set value only once)
fun testVal(){
    val a:Int =1
    val b =1

    val c:Int
    c = 1

    //complie error
    //c=2
}

//var( can set for many times)
fun testVar(){
    var x= 5
    x=4
    x=3

    println("testVar $x")
}

/**
 *
 * this is comment have many lines
 *
 */

//is ,Any
fun testType(v: Any){
    if ( v is Int){
        println("v is int")
    }

    if (v is String){
        println("v is string")
    }
}

//listof,filter,foreach,it
fun testCollection(){
   var sum =0
    listOf(1,2,3,4,5,6).filter { it >3 }.forEach {
        sum+=it
    }
    println("testLoop sum is $sum")
}

fun testLet(v: Int?)= println( v?.let{
    it+1
})

fun testWith(v: String){
    var V=with(v){
        toUpperCase()
    }
    println("testWith: $V")
}


/**
 * 呼び出し元で、関数呼び出さずに関数の内容をそのまま実行
 * 内容をCpoyする、frontend no include
 */
inline fun inline() {
    println("i am inline")
}

//param is fun
fun testFunParam(v:Int,someFun:(p:Int)->Int) :Int{
    return someFun(v)
}