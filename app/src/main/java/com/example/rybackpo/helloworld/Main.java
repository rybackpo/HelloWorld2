package com.example.rybackpo.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    private TextView tv_out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        getInputValues();
        //printDay();
    }

    private void getInputValues(){
        EditText et_day = (EditText) findViewById(R.id.edittextday);
        EditText et_month = (EditText) findViewById(R.id.edittextmonth);
        EditText et_year = (EditText) findViewById(R.id.edittextyear);

        int day = Integer.parseInt(et_day.getText().toString());
        int month = Integer.parseInt(et_month.getText().toString());
        int year = Integer.parseInt(et_year.getText().toString());
        compute(day, month, year);
    }

    private void compute(int day, int month, int year){

    }

    void onClickCompute(View view){
        tv_out.setText("Hello Button!");
    }
    private void printDay(){
       String day_text = "Tuesday";
       tv_out = (TextView) findViewById(R.id.textviewoutput);
       tv_out.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
