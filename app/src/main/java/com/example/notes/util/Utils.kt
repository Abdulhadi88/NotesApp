package com.example.notes.util

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.core.content.getSystemService

fun hideKeyBoard(activity: Activity){
    val inputMethodManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    val currentFocusedView = activity.currentFocus
    currentFocusedView.let {
        inputMethodManager.hideSoftInputFromWindow(
            currentFocusedView?.windowToken, InputMethodManager.HIDE_NOT_ALWAYS
        )
    }

}