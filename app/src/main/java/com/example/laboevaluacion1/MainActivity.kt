package com.example.laboevaluacion1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val clickListener = View.OnClickListener { view ->

            when (view.getId()) {
                R.id.tv_1 -> tv_1.setText((tv_1.text.toString().toInt() + 1).toString())
                R.id.tv_2 -> tv_2.setText((tv_2.text.toString().toInt() + 1).toString())
                R.id.tv_3 -> tv_3.setText((tv_3.text.toString().toInt() + 1).toString())
                R.id.tv_4 -> tv_4.setText((tv_4.text.toString().toInt() + 1).toString())
                R.id.tv_5 -> tv_5.setText((tv_5.text.toString().toInt() + 1).toString())
                R.id.tv_6 -> tv_6.setText((tv_6.text.toString().toInt() + 1).toString())
                R.id.tv_7 -> tv_7.setText((tv_7.text.toString().toInt() + 1).toString())
                R.id.tv_8 -> tv_8.setText((tv_8.text.toString().toInt() + 1).toString())
                R.id.tv_9 -> tv_9.setText((tv_9.text.toString().toInt() + 1).toString())

                R.id.btn_submit -> {
                    val intentinfo = Intent(this, Main2Activity::class.java)
                    var extras = Bundle()
                    extras.putString(AppConstants.USER_KEY, et_user.text.toString())
                    extras.putString(AppConstants.EMAIL_KEY, et_email.text.toString())
                    extras.putString(
                        AppConstants.TOTAL_KEY,
                        (tv_1.text.toString().toInt() + tv_2.text.toString().toInt() + tv_3.text.toString().toInt() +
                                tv_4.text.toString().toInt() + tv_5.text.toString().toInt() +
                                tv_6.text.toString().toInt() + tv_7.text.toString().toInt() + tv_8.text.toString().toInt() +
                                tv_9.text.toString().toInt()).toString()
                    )
                    extras.putString(AppConstants.P1_KEY, tv_1.text.toString())
                    extras.putString(AppConstants.P2_KEY, tv_2.text.toString())
                    extras.putString(AppConstants.P3_KEY, tv_3.text.toString())
                    extras.putString(AppConstants.P4_KEY, tv_4.text.toString())
                    extras.putString(AppConstants.P5_KEY, tv_5.text.toString())
                    extras.putString(AppConstants.P6_KEY, tv_6.text.toString())
                    extras.putString(AppConstants.P7_KEY, tv_7.text.toString())
                    extras.putString(AppConstants.P8_KEY, tv_8.text.toString())
                    extras.putString(AppConstants.P9_KEY, tv_9.text.toString())

                    intentinfo.putExtras(extras)
                    startActivity(intentinfo)


                }

            }
        }
        tv_1.setOnClickListener(clickListener)
        tv_2.setOnClickListener(clickListener)
        tv_3.setOnClickListener(clickListener)
        tv_4.setOnClickListener(clickListener)
        tv_5.setOnClickListener(clickListener)
        tv_6.setOnClickListener(clickListener)
        tv_7.setOnClickListener(clickListener)
        tv_8.setOnClickListener(clickListener)
        tv_9.setOnClickListener(clickListener)

        btn_submit.setOnClickListener(clickListener)


    }


}




