/*
package deprecated;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.martinsaad.hackidc.AsyncResponse;
import com.example.martinsaad.hackidc.Constants;
import com.example.martinsaad.hackidc.DatePicker;
import com.example.martinsaad.hackidc.HttpRequest;
import com.example.martinsaad.hackidc.R;
import com.example.martinsaad.hackidc.Request;
import com.example.martinsaad.hackidc.User;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button registerButton = (Button) findViewById(R.id.button_Register_buttonRegister);
        final EditText firstName = (EditText) findViewById(R.id.editText_Register_firstName);
        final EditText lastName = (EditText) findViewById(R.id.editText_Register_lastName);
        final DatePicker birthDate = (DatePicker) findViewById(R.id.datePicker_Register_birthDay);
        final Switch gender = (Switch) findViewById(R.id.switch_Register_gender);
        final EditText email = (EditText) findViewById(R.id.editText_Register_email);
        final EditText password = (EditText) findViewById(R.id.editText_Register_password);
        final EditText repeatPassword = (EditText) findViewById(R.id.editText_Register_repeatPassword);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = password.getText().toString();
                String repeatPass = repeatPassword.getText().toString();

                if (firstName.getText().toString().isEmpty() == false && lastName.getText().toString().isEmpty() == false && email.getText().toString().isEmpty() == false && password.getText().toString().isEmpty() == false && repeatPassword.getText().toString().isEmpty() == false && birthDate.getText().toString().isEmpty() == false){
                    if (pass.equals(repeatPass)){
                        String gend = gender.isChecked() ? "Male" : "Female";
                        User user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), pass, gend, birthDate.getText().toString());

                        Gson gson = new Gson();
                        String json = gson.toJson(user);
                        List<String> parameters = new ArrayList<String>();
                        parameters.add(Constants.TRAINEES);
                        Request r = new Request("POST", parameters, json);
                        try {
                            new HttpRequest(new AsyncResponse() {
                                @Override
                                public void processFinish(String output) {

                                }
                            }).execute(r, null, null);
                        }catch (Exception e){
                            Log.d("error", e.toString());
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "passwords are not equal", Toast.LENGTH_SHORT).show();
                    }
                }

                else {
                    Toast.makeText(getApplicationContext(), "not all fields are full", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
*/
