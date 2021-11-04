package com.example.myfirstandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;//Bundle:束バンドルにデータを詰めて、アクティビティ移動時にデータを一緒に移動して、取り出したりできる（例：カメラ　起動したときに保存するときに決めるファイル名を覚えておいたりなど）
//でもあんまり使わない
import android.util.Log;

import static java.lang.Integer.sum;

public class MainActivity<helloAndroid> extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ここにプログラムを追記していく
        //String hello = "Hello World!";//宣言と代入が同時に行われている

        //宣言と代入を別々に行う場合
        //String hello;
        //hello = "Hello World!";
        //Log.d("MainActivity","hello");//msgの中にはString型が入らなければいけない
        //msgにint型を入れたい場合は下記のように書く
        //Log.d("MainActivity,""+intValue);

        //String hello = "Hello, World!";
        //int intValue= 12345;
        //long longValue = 12345L;
        //double doubleValue = 12.345;
        //float floatValue = 12.345F;
        //boolean booleanValue = true;

        //Log.d("Main Activity", hello);
        //Log.d("Main Activity",""+intValue);
        //Log.d("MainActivity",""+longValue);
        //Log.d("MainActivity",""+doubleValue);
        //Log.d("MainActivity",""+floatValue);
        //Log.d("MainActivity",""+booleanValue);

        //int a = 3;
        //int b = a + 2;
        //Log.d("MainActivity",""+b);

        //int n1 = 1;
        //int n2 = 1;
        //int n3 = n1 + n2;
        //Log.e("MainActivity",""+n3);

        //String s1 = "1";
        //String s2 = "1";
        //String s3 = s1 + s2;
        //Log.e("MainActivity",s3);

        //メソッドを呼んでる(変数の記入）（上から下に読まれていく
        //int result = sum(1,2) + 3;
        //int result2 = sum(2,2);
        //int result3 = sum(3,2);
        //int result4 = sum(4,2);
        //Log.d("MainActivity",""+result5);ここだとresult5のエラーが出るのはまだ読まれていないから
        //int result5 = sub(1, 3);
        //Log.d("MainActivity",""+result5);

        //int number = sum(357,557);
        //Log.d("MainActivity",""+number);

        //d("Hello,World!");
        //Log.d("MainActivity","" + result);
        // }

        //メソッドの定義、関数の中に関数の定義は基本的にかけないからoncreatedの外に書いた
        //メソッドの定義は下に書いてもいい（Javaの決まり）
        //private int sum(int a,int b) { //重要！関数のメリット：入れる値がどれだけあったとしても、同じ動作をしてくれる.

        //a = 3;
        //b = 4;　逆に何を入れても同じ値しか返さないものであれば関数である必要がない
        //   return a + b;
        //returnとLogcatとは関係ない
        //}

        //private int sub(int a,int b){
        //  return a - b;
        //}

        //private int sum(int a, int b) {
        //  return a + b;
        //}

        //private void d(String message) {
        //Log.d("MainActivity",message);
        //}

        //下記はすべてprivateになるのでStringの前にかけない
        String helloWorld;
        helloWorld = "Hello, World!";
        //"World"をAndroidに置き換えた文字列を作る
        String helloAndroid = helloWorld.replace("World","Android");
        Log.d("MainActivity",helloAndroid);
    }


}