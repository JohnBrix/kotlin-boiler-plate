package com.school.proj

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.school.proj.databinding.ActivityMainBinding
import com.school.proj.view.InformationData
import com.school.proj.view.PersonData
import com.school.proj.viewmodel.PersonViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding /*<- LATEINIT is global declared*/
    private lateinit var pvm: PersonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*TODO always declare this in order to get this patter*/
        //TODO view -> viewmodel -> service -> adapter

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        pvm = ViewModelProvider(this).get(PersonViewModel::class.java)
        binding.personViewModel = pvm
        binding.lifecycleOwner = this@MainActivity

        /*Instantiate,Constructor and setter*/
        val data = PersonData() /*<- Model*/
        data.active = true
        data.username = "Johnbrix"

        /*Instantiate*/
        val infoData = InformationData() /*<- Model*/
        infoData.address = "Brgy hamod"
        infoData.contactNum = "099954312863"
        data.infoData = infoData

        pvm.ourMethod(data)
    }
}
