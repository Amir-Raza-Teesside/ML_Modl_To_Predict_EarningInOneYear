package uk.ac.tees.aad.ml_model_to_predict_minimunearningthrashold;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"as",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"abs",Toast.LENGTH_LONG).show();
    }
}