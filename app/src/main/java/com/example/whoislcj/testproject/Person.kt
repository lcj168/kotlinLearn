package com.example.whoislcj.testproject

import android.util.Log

/**
 * Created by whoislcj on 2018/3/12.
 */
 open class Person {
    var age:Int=0;//定义一个人的年龄
    var name:String="";//定义一个人的名字

    constructor()

    constructor(age:Int,name:String)

    constructor(age:Int){
        this.age=age;
    }

    fun test() {
        Log.e("person","test")
    }

}