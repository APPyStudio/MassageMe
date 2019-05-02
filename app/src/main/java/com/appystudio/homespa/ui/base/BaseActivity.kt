package com.appystudio.homespa.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayout())
        requestData()
        setupView()
    }

    abstract fun setLayout(): Int

    abstract fun requestData()

    abstract fun setupView()

}


