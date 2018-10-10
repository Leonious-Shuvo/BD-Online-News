package com.example.shubratodev.onlineshoppinghelper;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WebViewActivity extends AppCompatActivity {
    public Drawable a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        a =(Drawable) findViewById(R);
        b =(ImageView) findViewById(R.id.);
        c =(ImageView) findViewById(R.id.prothomaloi);
        d =(ImageView) findViewById(R.id.prothomaloi);
        e =(ImageView) findViewById(R.id.prothomaloi);
        f =(ImageView) findViewById(R.id.prothomaloi);
        g =(ImageView) findViewById(R.id.prothomaloi);
        h =(ImageView) findViewById(R.id.prothomaloi);
        i =(ImageView) findViewById(R.id.prothomaloi);
        j =(ImageView) findViewById(R.id.prothomaloi);
        k =(ImageView) findViewById(R.id.prothomaloi);
        l =(ImageView) findViewById(R.id.prothomaloi);
        m =(ImageView) findViewById(R.id.prothomaloi);
        n =(ImageView) findViewById(R.id.prothomaloi);
        o =(ImageView) findViewById(R.id.prothomaloi);
        p =(ImageView) findViewById(R.id.prothomaloi);
        q =(ImageView) findViewById(R.id.prothomaloi);
        r =(ImageView) findViewById(R.id.prothomaloi);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(newsIntent);

            }
        });

    }


}
