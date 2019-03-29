package com.example.laboevaluacion1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.R.attr.data
import com.example.laboevaluacion1.AppConstants.EMAIL_KEY
import com.example.laboevaluacion1.AppConstants.USER_KEY
import com.example.laboevaluacion1.AppConstants.TOTAL_KEY
import com.example.laboevaluacion1.AppConstants.P1_KEY
import com.example.laboevaluacion1.AppConstants.P2_KEY
import com.example.laboevaluacion1.AppConstants.P3_KEY
import com.example.laboevaluacion1.AppConstants.P4_KEY
import com.example.laboevaluacion1.AppConstants.P5_KEY
import com.example.laboevaluacion1.AppConstants.P6_KEY
import com.example.laboevaluacion1.AppConstants.P7_KEY
import com.example.laboevaluacion1.AppConstants.P8_KEY
import com.example.laboevaluacion1.AppConstants.P9_KEY
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import org.json.JSONException

import org.json.JSONObject


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val mIntent = intent
        val extras = mIntent!!.extras
        var data = bundleToJson(extras)
        if (mIntent != null) {
            et_user2.text = et_user2.text.toString() + extras.getString(USER_KEY)
            et_email2.text = et_email2.text.toString() + extras.getString(EMAIL_KEY)
            tv_total.text = extras.getString(TOTAL_KEY)
            tv_1_2.text = extras.getString(P1_KEY)
            tv_2_2.text = extras.getString(P2_KEY)
            tv_3_2.text = extras.getString(P3_KEY)
            tv_4_2.text = extras.getString(P4_KEY)
            tv_5_2.text = extras.getString(P5_KEY)
            tv_6_2.text = extras.getString(P6_KEY)
            tv_7_2.text = extras.getString(P7_KEY)
            tv_8_2.text = extras.getString(P8_KEY)
            tv_9_2.text = extras.getString(P9_KEY)

        }
        btn2_submit.setOnClickListener({ v ->

            val mIntent2 = Intent()
            mIntent2.putExtra(Intent.EXTRA_TEXT, data)
            mIntent2.type = "text/plain"
            mIntent2.action = Intent.ACTION_SEND

            startActivity(mIntent2)
        })

    }

    fun bundleToJson(bundle: Bundle): String {
        val json = JSONObject()
        val keys = bundle.keySet()
        for ( i in keys) {
            try {
                json.put( i, bundle.get(i))

            } catch (e: JSONException) {

            }

        }

        return json.toString()
    }
}
