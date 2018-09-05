package pe.com.moviles.interactionbetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //TODO 1: Crear la UI en el Layout: activity_first.xml

        //TODO 2: Existen dos formas de agregar un evento a una view
            //Primera forma: En el evento onClick de la view(botón) agregar el nombre "enviarMensaje"
    }


    public void enviarParametros(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.txtNombreCompleto);
        String message = editText.getText().toString();
        intent.putExtra("paramNombreCompleto", message);
        startActivity(intent);
    }
}
