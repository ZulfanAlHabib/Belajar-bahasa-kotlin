package app

import Data.Car

fun main() {
    val ninja = Car(paramMerek = "kawasaki")

    println(ninja.merek)
    println(ninja.year)
}