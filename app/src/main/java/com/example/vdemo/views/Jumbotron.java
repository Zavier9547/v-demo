package com.example.vdemo.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.vdemo.R;

/**
 * Created by 11070545 on 2017/10/8.
 */

public class Jumbotron extends RelativeLayout {

    private TextView textViewAbove;
    private TextView textViewMiddle;
    private TextView textViewBelow;

    private String textAbove;
    private String textMiddle;
    private String textBelow;


    public Jumbotron(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        initTypedArray(context, attributeSet);
        initView(context);

    }

    private void initTypedArray(Context context, AttributeSet attributeSet) {

        TypedArray typedArray = context.obtainStyledAttributes(attributeSet,
                R.styleable.Jumbotron);

        textAbove = typedArray.getString(R.styleable.Jumbotron_text_above);
        textMiddle = typedArray.getString(R.styleable.Jumbotron_text_middle);
        textBelow = typedArray.getString(R.styleable.Jumbotron_text_below);

        typedArray.recycle();
    }

    private void initView(Context context) {

        LayoutInflater.from(context).inflate(R.layout.jumbotron,this,true);

        textViewAbove = findViewById(R.id.textAbove);
        textViewMiddle = findViewById(R.id.textMiddle);
        textViewBelow = findViewById(R.id.textBelow);

        textViewAbove.setText(textAbove);
        textViewMiddle.setText(textMiddle);
        textViewBelow.setText(textBelow);
    }
}
