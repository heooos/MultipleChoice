package com.test.multiplechoice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private CheckBox cbA,cbB,cbC,cbD,cbE,cbF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        cbA = (CheckBox) findViewById(R.id.cbA);
        cbB = (CheckBox) findViewById(R.id.cbB);
        cbC = (CheckBox) findViewById(R.id.cbC);
        cbD = (CheckBox) findViewById(R.id.cbD);
        cbE = (CheckBox) findViewById(R.id.cbE);
        cbF = (CheckBox) findViewById(R.id.cbF);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isCheck;
                isCheck = cbA.isChecked() && cbB.isChecked() && cbD.isChecked() && cbF.isChecked() && !cbC.isChecked() && !cbE.isChecked();

                if (isCheck) {
                    Toast.makeText(MainActivity.this, R.string.correct_message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.error_message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
