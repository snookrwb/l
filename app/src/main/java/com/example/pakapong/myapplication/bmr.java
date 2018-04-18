package com.example.pakapong.myapplication;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class bmr extends Activity implements View.OnClickListener{

    Button bback;
    TextView totalcal;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.bmr);
        init();
        Bundle bundle = getIntent().getExtras();
        String total = bundle.getString("total");
        totalcal.setText(total);

    }

    public void init(){
        totalcal = (TextView) findViewById(R.id.text_calorei);
        bback = (Button) findViewById(R.id.btn_back);
        bback.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        //Intent intent = null;
        switch(view.getId()){
            case R.id.btn_back:
            finish();

            break;

        }
        //startActivity(intent);
    }
}
