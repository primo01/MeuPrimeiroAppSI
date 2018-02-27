package br.usjt.ftce.progmulti.meuprimeiroappsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View View){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText text = (EditText)findViewById(R.id.edit_message);
        String mensagem = text.getText().toString();
        System.out.println(mensagem);
        intent.putExtra(EXTRA_MESSAGE, mensagem);
        startActivity(intent);
    }
}
