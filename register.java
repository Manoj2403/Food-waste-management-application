package bd.edu.rifat.foodDonationApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity implements View.OnClickListener {

    public Button btn1,btn2,btn3;
public TextView textViewAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Home");
        btn1=(Button)findViewById(R.id.button6);
        btn3=(Button)findViewById(R.id.button8);
//textViewAbout = findViewById(R.id.textViewAbout);
        btn1.setOnClickListener(this);
       btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
/*textViewAbout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, AboutUs.class));
    }
});*/
        /*tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Act4.class);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");
                
                myRef.setValue("Hello, World!");

                // Read from the database
                myRef.addValueEventListener(new ValueEventListener() {
                    private String TAG;

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        String value = dataSnapshot.getValue(String.class);
                        Log.d(TAG, "Value is: " + value);
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });
                startActivity(intent);
            }
        });*/




    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button6)
        {
            Intent intent = new Intent(this,LoginUser.class);
            startActivity(intent);
        }


    }
}
