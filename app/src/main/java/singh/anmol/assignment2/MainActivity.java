package singh.anmol.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name,mob,mail,pass;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.et_name);
        mob=findViewById(R.id.et_mob);
        mail=findViewById(R.id.et_mail);
        pass=findViewById(R.id.et_pass);

        submit=findViewById(R.id.btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sName,sMob,sMail,sPass;
                sName=name.getText().toString();
                sMob=mob.getText().toString();
                sMail=mail.getText().toString();
                sPass=pass.getText().toString();

                if (sName.equals("")||sMob.equals("")||sMail.equals("")||sPass.equals("")){
                    Toast.makeText(MainActivity.this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Your details submitted!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
