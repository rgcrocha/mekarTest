package com.example.corporalevaluation;

import com.example.corporalevaluation.PeopleActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);
    }
    public void bPatientsClick(View v){
        Intent it = new Intent (this, PeopleActivity.class);
       	startActivity(it);
    }
    public void bEvaluationsClick(View v){
        Intent it = new Intent (this, EvaluationsActivity.class);
       	startActivity(it);
    }
    public void bProtocolsClick(View v){
        Intent it = new Intent (this, ProtocolsActivity.class);
       	startActivity(it);
    }
    public void bExitClick(View v){
    	finish();
    }
    public void bAboutClick(View v){
        Intent it = new Intent (this, AboutActivity.class);
       	startActivity(it);
    }
    
}
