package sdu.cs.wongsathorn.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Expicit
    String nameString,userString,passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปลบน java กับ xml
        final EditText nameEditText = findViewById(R.id.edtName);
        final EditText userEditText = findViewById(R.id.edtUsername);
        final EditText passEditText = findViewById(R.id.edtPassword);
        Button loginButton = findViewById(R.id.btnLogin);

        //onClick Login Button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                //check ค่าว่าง
                if ((nameString.length()==0)||(userString.length()==0)||(passString.length()==0)) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกข้อความให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                }
            }
        });//end setonclicklistener

    }//end onCreate
}//end class
