package com.example.my_radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button showButton,genderButton;
    private RadioGroup radioGroup;
    private TextView result_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showButton = findViewById(R.id.showButton_Id);

        radioGroup = findViewById(R.id.Radio_Group_Id);
        result_TextView = findViewById(R.id.result_TextView_Id);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selected = radioGroup.getCheckedRadioButtonId();
                genderButton = findViewById(selected);

                String value = genderButton.getText().toString();
                result_TextView.setText("You have selected : "+value);

            }
        });

    }
}