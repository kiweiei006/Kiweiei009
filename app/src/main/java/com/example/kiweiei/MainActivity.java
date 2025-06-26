package com.example.kiweiei;

import android.os.Bundle;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int numMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        numMessage = 10;
        Log.i("numMessage",""+numMessage);

        numMessage++;
        numMessage = numMessage+1;
        Log.i("numMessage",""+numMessage);

        boolean isFriend = true;
        Log.i("isFriend = ",""+isFriend);

        String contact = "Thanaphon";
        String message = "This is my first APP";
        Toast.makeText(this,"Message form " + contact, Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Message is " + message, Toast.LENGTH_SHORT).show();
        String command = "Go east";
        switch (command){
            case "go east":
                Log.i("message = ","player go to east ");
                break;
            case "go west":
                Log.i("message = ","player go to west ");
                break;
            default:
                Log.i("mesage = ","Defaul message");
                break;

        }
        Log.i("message:","In countUp method");
        int x = 0;
        // Now an apparently infinite while Loop
        while(true) {
            x++; // Add 1 to x each time
            Log.i("x =", ""+ x); //print x
            if(x == 3){
                break; //Get me out of here
            }
        }
        String mess = jointheses("Method","are","cool");
        Log.i("message = ",mess);
        float area = getAreaCircle(5f);
        Log.i("area = ",""+area);
    }
    String jointheses(String a, String b, String c){
        return a+b+c;
    }
    float getAreaCircle(float radius){
        return  3.14f*radius*radius;
    }
}