package com.example.vdemo.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.vdemo.R;

/**
 * Created by zhaiw on 2017/10/6.
 */

public class CustomTitleBar extends RelativeLayout {

    private Button backButton;
    private TextView textView;
    private Button infoButton;
    private String title;
    private Boolean right_btn_visible;
    private String right_btn_text;



    public CustomTitleBar(Context context, AttributeSet attrs){
        super(context, attrs);
        initTypedArray(context, attrs);
        initView(context);
    }

    private void initTypedArray(Context context,AttributeSet attrs){

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTitleBar);
        title= typedArray.getString(R.styleable.CustomTitleBar_title_text);
        right_btn_visible = typedArray.getBoolean(R.styleable.CustomTitleBar_right_btn_visible, false);
        if (right_btn_visible){
            right_btn_text = typedArray.getString(R.styleable.CustomTitleBar_right_text);
        }
        typedArray.recycle();

    }

    private void initView(Context context){

        LayoutInflater.from(context).inflate(R.layout.title_bar, this, true);

        backButton = findViewById(R.id.title_bar_left);
        textView = findViewById(R.id.title_bar_title);
        infoButton = findViewById(R.id.title_bar_right);

        textView.setText(title);

        if (right_btn_visible){
            infoButton.setVisibility(View.VISIBLE);
            infoButton.setText(right_btn_text);
        } else{
            infoButton.setVisibility(View.INVISIBLE);
        }

    }

    private void setLeftClickListener(OnClickListener onClickListener){
        backButton.setOnClickListener(onClickListener);
    }

    private void setRightClickListener(OnClickListener onClickListener) {
        infoButton.setOnClickListener(onClickListener);
    }
}
