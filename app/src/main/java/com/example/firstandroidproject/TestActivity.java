package com.example.firstandroidproject;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    private Button mButtonTrue;
    private Button mButtonFlase;
    private TextView mQuestionText;
    int mGreenColor= Color.GREEN;
    int mRedColor=Color.RED;
    int mGravityTop= Gravity.TOP;
    int mGravityBottom= Gravity.BOTTOM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViews();
        setListeners();


    }
    public static void showToast(Context context, int resId, int color,int gravity) {
        Toast toast = Toast.makeText(context, resId, Toast.LENGTH_LONG);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(30);
        toastTV.setGravity(gravity);
        toastTV.setTextColor(color);
        toast.show();
    }

    private void setListeners() {
        mButtonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showToast(TestActivity.this, R.string.toast_true,mGreenColor,mGravityBottom);
                mQuestionText.setTextColor(mGreenColor);


            }
        });

        mButtonFlase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(TestActivity.this, R.string.toast_false,mRedColor,mGravityTop);
                mQuestionText.setTextColor(mRedColor);
            }
        });
    }

    private void findViews() {
        mButtonTrue = findViewById(R.id.btn_true);
        mButtonFlase = findViewById(R.id.btn_false);
        mQuestionText = findViewById(R.id.txtView_question_text);
    }


}

