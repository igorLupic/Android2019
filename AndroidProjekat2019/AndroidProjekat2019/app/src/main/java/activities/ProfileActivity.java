package activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.igor.androidprojekat2019.R;

public class ProfileActivity extends AppCompatActivity {


    private NavigationView navigation;
    private Toolbar toolbar;
    private TextView toolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initView();

        setSupportActionBar(toolbar);
    }
    private void initView(){
        toolbar = findViewById(R.id.toolbar);
        toolbarText = toolbar.findViewById(R.id.toolbar_text);
        toolbarText.setText("Profile");
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
