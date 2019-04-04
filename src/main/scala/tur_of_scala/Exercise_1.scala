package tur_of_scala

object Exercise_1 extends App {
    //    println(1) // 1
    //    println(1 + 1) // 2
    //    println("Hello!") // Hello!
    //    println("Hello," + " world!") // Hello, world!

    println("============")
    println("const init with 'val'")
    val x = 1 + 1
    println(x)

    val y: Int = 1 + 1

    println("============")
    println("variables init with 'var'")
    var z = "1" + 1
    //    z = 3
    println(z)

    println("============")
    println("blocks")
    println({
        val x = 5 + 5
        x + this.x
    })

    println("============")
    println("functions")
    val addOne = (x: Int) => x + 1
    println(addOne(5))

    val addTwoNumber = (x: Int, y: Int) => x + y
    println(addTwoNumber(5,7))

    val getMsg = () => "msg"
    println(getMsg())
}
