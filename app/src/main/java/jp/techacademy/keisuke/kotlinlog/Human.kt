package jp.techacademy.keisuke.kotlinlog

import android.util.Log
//抽象クラスAnimalを継承、Thinkbleインターフェイスを実装？
open class Human:Animal,Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age,hobby) {
    }

    // sayメソッド
    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "です。年は" + this.age + "歳です。")
    }

    //thinkメソッド
    override fun think(){
        Log.d("kotlintest","私は"+this.hobby+"について考える。")

    }
}

