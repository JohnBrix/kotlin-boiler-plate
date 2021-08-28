package com.school.proj.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.school.proj.view.PersonData

class PersonViewModel : ViewModel() { /*<- : colon meaning dynamic implements or extends*/

    /*ALWAYS DECLARE THIS in order to get data binding*/
    var hello = MutableLiveData<String>()
    var textField = MutableLiveData<String>()

    /*EQUAL TO*/
    // public String text(){}
    fun ourMethod(data: PersonData):String{
        textField.value = "Testing MVVM mo" /*Setter*/
        hello.value = "$data" /*Pass thru*/
        return "this is return string"
    }
}