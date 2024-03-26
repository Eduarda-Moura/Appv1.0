package moura.eduarda.erick.appv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { // representa a tela principal (cuida do comportamento da tela)

    @Override
    protected void onCreate(Bundle savedInstanceState) { // cria a tela (é chamado toda vez que a tela é utilizada) -- chamada pelo OS
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // constrói a interface na tela

        Button btnEnviar = findViewById(R.id.btn_enviar); // obtém o botão enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() { // configura o botão ("ouvidor de cliques")
            @Override
            public void onClick(View v) { // executado quando o botão é clicado
                /*
                Button b = (Button) v;

                float a = 1.5f;
                int b = (int) a;
                */

                EditText etDigiteAqui = findViewById(R.id.et_digite_aqui); // obtém a caixa de texto digitável
                String textoDigitado = etDigiteAqui.getText().toString(); // obtém o texto digitado na caixa de texto e converte para string

                Intent i = new Intent(MainActivity.this, NextActivity.class); // sinaliza a intenção de mudar de tela
                i.putExtra("texto",textoDigitado); // acrescenta texto à intenção
                startActivity(i); // executa a mudança de tela

                // startActivityForResult(); -- executa uma intenção esperando uma ação específica a ser realizada pelo usuário
            }

        });
    }
}