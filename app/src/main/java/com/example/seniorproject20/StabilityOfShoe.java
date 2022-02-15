package com.example.seniorproject20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class StabilityOfShoe extends AppCompatActivity {

    Shoe shoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stability_of_shoe);

        //Grabs the intent and grabs the shoe
        Intent intent = getIntent();
        shoe = intent.getParcelableExtra("radioChosen");
    }

//    //Called when the user taps the button
//    //Sets the shoes need stability to a number in the 100s place
//    //Moves to the next page (pronation)
    public void onRadioStability(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.stable:
                if (checked) {
                    shoe.setStable(100);
                }
                break;
            case R.id.unstable:
                if (checked) {
                    shoe.setStable(200);
                }
                break;
        }
        Intent intent = new Intent(this, PronationOfFoot.class);
        intent.putExtra("radioChosen", shoe);
        startActivity(intent);
    }
}