package moura.eduarda.erick.appv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //cria a tela 2
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); //obtém a inetnção da tela MAIN
        String textoDigitado = i.getStringExtra("texto"); //obtém o texto da intenção da tela MAIN
        TextView tv_texto = findViewById(R.id.tv_texto); //localiza a textview
        tv_texto.setText(textoDigitado); //coloca o texto obtido na tela atraves do textview
    }
    //comentário qualquer
    ;
}