package com.pedroroig.dialogfragmenttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val customDialogFragment: DialogFragment  = CustomDialogFragment()
            customDialogFragment.show(supportFragmentManager, "CustomDialogFragment")
        }
    }
}
