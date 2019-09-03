package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_a, et_b, et_c ;

    TextView tv_ketqua;Button bt_gui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
        bt_gui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, c;
                String kq = "";
                a = Integer.parseInt(et_a.getText().toString());
                b = Integer.parseInt(et_b.getText().toString());
                c = Integer.parseInt(et_c.getText().toString());
                if (a == 0) {
                    Toast.makeText(MainActivity.this, "Phuong trinh bat 2 so a phai khac 0!", Toast.LENGTH_SHORT).show();

                } else {
                    double delta;
                    delta = b * b - 4 * a * c;


                    if (delta < 0) {
                        kq = "PT Vo Nghiem";
                    } else if (delta == 0) {
                        kq = "PT co nghiem kep : x1=x2" + -b / (2 * a);
                    } else if (delta > 0) {
                        kq = "PT co hai nghiem phan biet x1=" + (-b + Math.sqrt(delta)) / 2 * a + ", x2 =" + (-b - Math.sqrt(delta)) / 2 * a;
                    }
                }
                tv_ketqua.setText(kq);
            }
        });

    }

        public  void connectView(){
                et_a = (EditText)findViewById(R.id.et_a);
                et_b = (EditText)findViewById(R.id.et_b);
                et_c = (EditText)findViewById(R.id.et_c);
                bt_gui = (Button) findViewById(R.id.bt_gui);
                tv_ketqua = (TextView) findViewById(R.id.tv_ketqua);

        }
    }

