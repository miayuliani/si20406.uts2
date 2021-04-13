package com.example.aplikasi_to_do;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public CheckBox kerja1, kerja2, kerja3, kerja4, kerja5;
    private EditText input;
    private String pekerjaan;
    private Button tambah, hapus, hapus2, hapus3, hapus4, hapus5;
    private TextView texthasil;

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;
    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kerja1 = (CheckBox) findViewById(R.id.kerja1);
        kerja2 = (CheckBox) findViewById(R.id.kerja2);
        kerja3 = (CheckBox) findViewById(R.id.kerja3);
        kerja4 = (CheckBox) findViewById(R.id.kerja4);
        kerja5 = (CheckBox) findViewById(R.id.kerja5);
        texthasil = (TextView) findViewById(R.id.texthasil);
        input = (EditText) findViewById(R.id.input);
        tambah = (Button) findViewById(R.id.tambah);
        hapus = (Button) findViewById(R.id.hapus);
        hapus2 = (Button) findViewById(R.id.hapus2);
        hapus3 = (Button) findViewById(R.id.hapus3);
        hapus4 = (Button) findViewById(R.id.hapus4);
        hapus5 = (Button) findViewById(R.id.hapus5);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (kerja1.isChecked()) {
                    CheckBox kerja1 = (CheckBox) findViewById(R.id.kerja1);
                    kerja1.setPaintFlags(kerja1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
                if (kerja2.isChecked()) {
                    pekerjaan = "Pekerjaan 2 Selesai";
                }

                if (kerja3.isChecked()) {
                    CheckBox kerja3 = (CheckBox) findViewById(R.id.kerja3);
                    kerja1.setPaintFlags(kerja3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                } else if (!kerja3.isChecked()) {
                    pekerjaan = " ";
                }

                if (kerja4.isChecked()) {
                    CheckBox kerja4 = (CheckBox) findViewById(R.id.kerja4);
                    kerja1.setPaintFlags(kerja4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                } else if (!kerja4.isChecked()) {
                    pekerjaan = " ";
                }

                if (kerja5.isChecked()) {
                    pekerjaan = "Pekerjaan 5 Selesai";
                } else if (!kerja5.isChecked()) {
                    pekerjaan = " ";
                }

                if (!kerja1.isChecked() && !kerja2.isChecked() && !kerja3.isChecked() && !kerja4.isChecked() && !kerja5.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Tidak Ada Pekerjaan yang selesai", Toast.LENGTH_SHORT).show();
                } else {
                    // Menampilkan Hasil Pekerjaan Yang Di Input Dari User
                    Toast.makeText(getApplicationContext(), "Pekerjaan Selesai", Toast.LENGTH_SHORT).show();

                   TextView texthasil = (TextView) findViewById(R.id.texthasil);
                   texthasil.setText(pekerjaan);
                   texthasil.setPaintFlags(texthasil.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void setButtonListener() {
    }

    private void setCheckBoxListener() {
        kerja1 = (CheckBox) findViewById(R.id.kerja1);
        kerja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    Toast.makeText(MainActivity.this, "Pekerjaan 1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kerja2 = (CheckBox) findViewById(R.id.kerja2);
        kerja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    Toast.makeText(MainActivity.this, "Pekerjaan 2", Toast.LENGTH_SHORT).show();
            }
        }
    });

        kerja2 = (CheckBox) findViewById(R.id.kerja2);
        kerja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    Toast.makeText(MainActivity.this, "Pekerjaan 2", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




        }


