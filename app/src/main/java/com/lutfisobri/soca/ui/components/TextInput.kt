package com.lutfisobri.soca.ui.components

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class TextInput: AppCompatEditText {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}