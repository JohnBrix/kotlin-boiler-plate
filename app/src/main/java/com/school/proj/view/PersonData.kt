package com.school.proj.view

data class PersonData(
    /*New*/
    var username: String? = null,
    var password: String? = null,
    var contactNum: Int? = null,
    var active: Boolean? = null,
    /*Object*/
    var infoData: InformationData? = null
)