package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.content_layout_id);


//        setContentView(R.layout.content_layout_id);
//
//        final Button button = findViewById(R.id.button_id);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Code here executes on main thread after user presses button
//            }
//        });
        //addKeyListener();

    }

//    public void addKeyListener() {
//
//        // get edittext component
//        edittext = (EditText) findViewById(R.id.myText);
//
//        // add a keylistener to monitor the keaybord avitvity...
//        edittext.setOnKeyListener(new OnKeyListener() {
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//
//                // if the users pressed a button and that button was "0"
//                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_0)) {
//
//                    // display the input text....
//                    Toast.makeText(MainActivity.this,edittext.getText(), Toast.LENGTH_LONG).show();
//                    return true;
//
//                    // if the users pressed a button and that button was "9"
//                } else if ((event.getAction() == KeyEvent.ACTION_DOWN)  && (keyCode == KeyEvent.KEYCODE_9)) {
//
//                    // display message
//                    Toast.makeText(MainActivity.this, "Number 9 is pressed!", Toast.LENGTH_LONG).show();
//                    return true;
//                }
//
//                return false;
//            }
//        });
//    }


}
