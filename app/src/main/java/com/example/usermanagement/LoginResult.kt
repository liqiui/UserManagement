package com.example.usermanagement

data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)
