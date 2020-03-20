package com.example.df_user_dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;

public class MainActivity extends AppCompatActivity {

    CardView shopvisit,shopleft,shopassigned;
    HorizontalScrollView hc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shopvisit = findViewById(R.id.shopVisitId);
        shopleft = findViewById(R.id.shopleftId);
        shopassigned = findViewById(R.id.shopAssignedId);
        hc = findViewById(R.id.horizontalview);

           Animation leftSwipe = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_left_slide);
                Animation RightSwipe = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_right_slide);
        shopvisit.startAnimation(RightSwipe);
        shopleft.startAnimation(leftSwipe);
        shopassigned.startAnimation(leftSwipe);
        hc.startAnimation(RightSwipe);
//                RCT_advertiser.startAnimation(RightSwipe);
    }
}
