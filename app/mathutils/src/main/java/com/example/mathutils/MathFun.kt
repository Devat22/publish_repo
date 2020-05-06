package com.example.mathutils

class MathFun {
    fun add(a:Int, b:Int): Int = a+b
    fun mutiply(a: Int, b: Int): Int = a * b
    fun abstract(a: Int, b: Int) : Int = a - b
    fun div(a: Int, b: Int): Int = if (b==0) -1 else a/b
}