package Karlos.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.primerNumero);
        valor2 = (EditText) findViewById(R.id.segundoNumero);
        result = (TextView) findViewById(R.id.resultado);

        /*
        int matematicas = 5;
        int quimica = 5;
        int fisica = 5;
        int promedio = 0;

        promedio = (matematicas + fisica + quimica) / 3;

        if (promedio >= 6) {
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        } else if (promedio < 6) {
            Toast.makeText(this, "Reprobado", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // La actividad esta creada.*/
    }

    //Metodo para realizar la suma
    public void Sumar(View view){
        String val1 = valor1.getText().toString();
        String val2 = valor2.getText().toString();

        int numero1 = Integer.parseInt(val1);
        int numero2 = Integer.parseInt(val2);

        int suma = numero1 + numero2;

        String resultado = String.valueOf(suma);
        result.setText(resultado);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }

}