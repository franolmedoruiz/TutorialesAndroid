package net.tutoriales.tutorial01;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //Get the UserName value.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.USERNAME);
        TextView txtMessage = (TextView)findViewById(R.id.txtMessage);
        txtMessage.setText("Hello " + message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.message, menu);
        return true;
    }
    
}
