package jp.techacademy.keisuke.kotlinlog
//メンバ変数hobbyを宣言する
import android.util.Log
//抽象クラスAnimalを継承、Thinkbleインターフェイスを実装？
open class Human:Animal,Thinkable {
    // 引数付きコンストラクタ
    var hobby: String

    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby

    }
    //this.hobby = hobby これ

    // sayメソッド
    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "です。年は" + this.age + "歳です。")
    }

    //thinkメソッド
    override fun think(){

        Log.d("kotlintest","私は"+this.hobby+"について考える。")

    }
}

