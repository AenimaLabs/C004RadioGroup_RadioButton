package cl.aenimalabs.c004radiogroup_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt1, txt2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;
    private Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt_1); // castear
        txt2 = (EditText) findViewById(R.id.txt_2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);

    }

    public void Calcular(View view) {
        String valor1_String = txt1.getText().toString();
        String valor2_String = txt2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if (rb1.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (rb2.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        } else if (rb3.isChecked() == true) {
            int multiplicar = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicar);
            tv1.setText(resultado);
        } else if (rb4.isChecked() == true) {

            if (valor2_int != 0) {
                int dividir = valor1_int / valor2_int;
                String resultado = String.valueOf(dividir);
                tv1.setText(resultado);
            } else {
                Toast.makeText(this, "El segundo valor debe ser distinto de cero", Toast.LENGTH_LONG).show();
            }

        }

    }
}