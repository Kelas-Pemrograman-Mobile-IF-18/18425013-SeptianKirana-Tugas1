package com.septian.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNPM, edtNamaLengkap, edtProdi, edtNoTelpon;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTampil = (TextView) findViewById(R.id.txtBiodata);
        edtNPM = (EditText) findViewById(R.id.edtNPM);
        edtNamaLengkap = (EditText) findViewById(R.id.edtNamaLengkap);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        edtNoTelpon = (EditText) findViewById(R.id.edtNoTelpon);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNPM = edtNPM.getText().toString();
                String strNamaLengkap = edtNamaLengkap.getText().toString();
                String strProdi = edtProdi.getText().toString();
                String strNoTelpon = edtNoTelpon.getText().toString();

                txtTampil.setText(strNPM + "\n" + strNamaLengkap + "\n" + strProdi + "\n" + strNoTelpon);

            }
        });
    }
}