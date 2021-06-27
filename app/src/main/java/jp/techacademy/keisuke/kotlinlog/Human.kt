package jp.techacademy.keisuke.kotlinlog

import android.util.Log
//抽象クラスAnimalを継承
open class Human:Animal {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }
    val hobby="教育"

    // sayメソッド
    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "です。年は" + this.age + "歳です。")
    }

    //thinkメソッド
    fun think(){
        Log.d("kotlintest","私は"+hobby+"について考える。")

    }
}