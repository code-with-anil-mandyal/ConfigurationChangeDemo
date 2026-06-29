package com.codewithmandyal.configurationchangedemo.xml

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codewithmandyal.configurationchangedemo.R

class RegistrationForm : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText

    // Demo:
    // This field is intentionally NOT saved/restored using
    // onSaveInstanceState() to demonstrate what happens when
    // UI state isn't preserved.
    private lateinit var etPhone: EditText
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registration_form)

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPhone = findViewById(R.id.etPhone)
        radioGroup = findViewById(R.id.radioGroup)

        savedInstanceState?.let {
            etName.setText(it.getString("name"))
            etEmail.setText(it.getString("email"))

            // Phone is intentionally NOT restored.

            val checkedId = it.getInt("gender", -1)
            if (checkedId != -1) {
                radioGroup.check(checkedId)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("name", etName.text.toString())
        outState.putString("email", etEmail.text.toString())
        // Phone is intentionally NOT saved.
        outState.putInt("gender", radioGroup.checkedRadioButtonId)
    }
}