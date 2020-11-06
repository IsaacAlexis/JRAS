package com.example.proyecto_jras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnNuevo;
    private ImageButton btnImage;
    private EditText etCodigo;
    private EditText etProducto;
    private TextView tvPreoducto;

    private Button btnNuevo2;
    private ImageButton btnImage2;
    private EditText etCodigo2;
    private EditText etProducto2;
    private TextView tvPreoducto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}