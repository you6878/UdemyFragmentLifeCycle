package com.bpplatform.howlfragmentlifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var myFragment = MyFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout_main,myFragment).commit()


        button_del.setOnClickListener {

            supportFragmentManager.beginTransaction().remove(myFragment).commit()
        }
    }
}
