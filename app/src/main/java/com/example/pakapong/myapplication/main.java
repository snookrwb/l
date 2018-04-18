package com.example.pakapong.myapplication;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;


public class main extends Activity implements View.OnClickListener{
    Button buttonnext;
    EditText edit_w,edit_h,edit_age,edit_name;
    double bmr;
    RadioButton rdmale,rdfemale;
    boolean gender= true;
    String calorie;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main);
        init();

        rdmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rdmale.setChecked(true);
                rdfemale.setChecked(false);
                gender = true;
            }
        });
        rdfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rdmale.setChecked(false);
                rdfemale.setChecked(true);
                gender = false;
            }
        });
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),bmr.class);
                double w = Double.parseDouble(edit_w.getText().toString());
                double h = Double.parseDouble(edit_h.getText().toString());
                double age = Double.parseDouble(edit_age.getText().toString());


                if(gender == true){
                    bmr  = 66+(13.7*w)+(5*h)-(6.8*age);

                }
                else if(gender == false){
                    bmr = 665+(9.6*w)+(1.8*h)- (4.7*age);
                }
                calorie = bmr + " kcal.";
                intent.putExtra("total",calorie);
                startActivity(intent);
            }
        });

    }
    public void init(){
        buttonnext = (Button) findViewById(R.id.btn_next);
        edit_age = (EditText) findViewById(R.id.edit_age);
        edit_w = (EditText) findViewById(R.id.edit_w);
        edit_h = (EditText) findViewById(R.id.edit_h);
        edit_name = (EditText) findViewById(R.id.edit_name);
        rdmale = (RadioButton) findViewById(R.id.male);
        rdfemale = (RadioButton) findViewById(R.id.female);
        buttonnext.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent intent = null;
        switch(view.getId()){
            //case R.id.btn_next:
                //intent = new Intent(getApplicationContext(),bmr.class);

                //break;

        }
        //startActivity(intent);
    }


}