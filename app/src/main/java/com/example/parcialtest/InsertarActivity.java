package com.example.parcialtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parcialtest.db.DbProductos;


public class InsertarActivity extends AppCompatActivity {

    EditText TextoNombre, TextoEquipo, TextoEdad;
    Button btn_guardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        btn_guardar.setOnClickListener(new View.OnClickListener());
        public void onClick(View v) {
            DbProductos dbProductos = new DbProductos(InsertarActivity.this);
            long id = dbProductos.insertarProducto(TextoNombre.getText().toString(), TextoEquipo.getText().toString(), TextoEdad.getText().toString());

            if (id > 0) { //validar si el registro se ingresó de forma correcta
                Toast.makeText(InsertarActivity.this, "Registro añadido de forma correcta", Toast.LENGTH_LONG).show();
                limpiar();
            } else {
                Toast.makeText(InsertarActivity.this, "El registro no se pudo añadir", Toast.LENGTH_LONG).show();
            }
        }
    });
}

    private void limpiar(){ //para limpiar el formulario
        TextoEquipo.setText("");
        TextoNombre.setText("");
        TextoEdad.setText("");
    }
}




