package com.example.whoislcj.testproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
      var person:Person? = null;

   private  fun Person.test1(str:String):Unit{
        Log.e("String",str);
        age+=1;
        Log.e("String",age.toString());
    }

   fun  Person.test():Unit{
        Log.e("String","扩展函数");
    }

    private fun Person?.test2():String{
        if(this==null){
            return "";
        }
        Log.e("String",name);
        return name;
    }

    var Person.address:String

    get():String {
        return "HZ"
    }

    set(value){
        Log.e("value",value)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        person=Person(2);
        person!!.name="lcj";
        person!!.test1("hhh")
        person!!.test();
        person!!.test2();
        person!!.address="CD"
        Log.e("String",person!!.address);
        val textView = findViewById<TextView>(R.id.text_test)
        textView.text = String.format("%d", getAge(1, 3))
        textView.text = dealStrings("who", "is", "lcj")
        val sum: (Int, Int) -> Int = { a, b -> a + b }
        textView.text = String.format("%d", sum(1, 3))
        textView.setOnClickListener({

        });

        textView.setOnClickListener(View.OnClickListener{


        });

        initData()

        val myCustomData =MyCustomData(10);
        Log.e("size",myCustomData.size.toString())
        val myCustomData1=myCustomData.copy(size = 12);

        Log.e("size",myCustomData1.size.toString())
        val(size)=myCustomData;
        Log.e("size","$size")

        var box=Box(1);
        var box1=Box("lcj");

        Log.e("box",box.value.toString())

        Log.e("box",box1.value)
    }




    fun getAge(a: Int, b: Int): Int {
        val person = Person(20)
        person.test();
        return a + b
    }

    fun initData(): Unit {
        var value = 1
        value += 1

        //类型后面加?表示可为空
        var age: String? = "23"
        //抛出空指针异常
        val ages = age!!.toInt()
        //不做处理返回 null
        val ages1 = age.toInt()
        //age为空返回-1
        val ages2 = age.toInt()
    }

    private fun dealStrings(vararg strs: String): String {
        val string = StringBuilder()
        for (s in strs) {
            string.append(s)
        }
        Log.d("result", string.toString())
        return string.toString()
    }


}
