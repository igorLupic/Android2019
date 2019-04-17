package activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.igor.androidprojekat2019.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


    }

    private void initViews(){
        button = findViewById(R.id.mainButton);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == button.getId()) {
            btnStartEmailsActivity();
        }
    }



    public void btnStartEmailsActivity(){
        Intent intent =new
                Intent(MainActivity.this,EmailsActivity.class);
        startActivity(intent);
    }

    @Override
    protected  void onStart(){
        super.onStart();
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
    }
    @Override
    protected  void onResume(){
        super.onResume();
    }
    @Override
    protected  void onPause(){
        super.onPause();
    }
    @Override
    protected  void onStop(){
        super.onStop();
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
    }

}
