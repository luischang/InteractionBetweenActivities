package pe.com.moviles.interactionbetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Se obtiene el Intent que inicio esta actividad (FirstActivity) y se recibe el parámetro
        Intent intent = getIntent();
        String message = intent.getStringExtra("paramNombreCompleto");

        // Se obtiene el TextView de esta actividad y se asigna el valor del parámetro
        TextView textView = findViewById(R.id.textView);
        textView.setText("Bienvenido:" + message);

    }

    public void regresar(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
}
