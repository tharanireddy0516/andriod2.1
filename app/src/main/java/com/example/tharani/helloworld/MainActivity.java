package com.example.tharani.helloworld;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   /*onCreate is the first method in the life cycle of an activity
   * setContentView is used to set layout for the activity
   *R is a resource*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
