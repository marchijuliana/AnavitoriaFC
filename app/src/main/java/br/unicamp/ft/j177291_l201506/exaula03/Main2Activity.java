package br.unicamp.ft.j177291_l201506.exaula03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent in = getIntent();
        if (in != null){
            Encapsulador capsula = (Encapsulador) in.getSerializableExtra("capsula");
            if (capsula != null){
                ((TextView)findViewById(R.id.txt_user)).setText(capsula.getUser());
                ((TextView)findViewById(R.id.txt_email)).setText(capsula.getEmail());
                ((TextView)findViewById(R.id.txt_senha)).setText(capsula.getSenha());
                ((TextView)findViewById(R.id.txt_genero)).setText(capsula.getGenero());
                ((TextView)findViewById(R.id.txt_fav)).setText(capsula.getFav());
                ((TextView)findViewById(R.id.txt_goodies)).setText(capsula.getGoodies());
            }
            else{
                Toast.makeText(this,"Algo deu errado. Tente novamente.", Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(this,"Algo deu errado. Tente novamente.", Toast.LENGTH_LONG).show();
        }
    }
}
