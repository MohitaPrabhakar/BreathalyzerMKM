package ca.humber.mkmdevelopers.mkm_breathalyzer;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
private FirebaseAuth auth;
    ;

    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();

        Button B5 = (Button)findViewById(R.id.B5);
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (auth.getCurrentUser() != null) {

                    auth.signOut();
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();
                }
            }
        });


        Button B1 = (Button)findViewById(R.id.B1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Intent I1 = new Intent(MainActivity.this, BreathalyzerTest.class);
                        startActivity(I1);

            }
        });






    }

}
