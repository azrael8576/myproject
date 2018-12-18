package com.alex

fun main(args: Array<String>) {
//    println("Hello Kotlin")
    val h = Human()
    h.hello()
    var age : Int = 25
    age = age.plus(1)
    val weight = 65.5
    val enroll = true
    println(enroll)
}
class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}