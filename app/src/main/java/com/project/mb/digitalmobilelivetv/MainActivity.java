package com.project.mb.digitalmobilelivetv;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button watch, news24, rtv, jamunatv, atnNews, independent , ntv, anandatv, gtv, banglavison,
            aljezeera, skynews, news18, arynews, abcnews, abpnews, cnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        watch = (Button) findViewById(R.id.button);
        news24 = (Button) findViewById(R.id.news24);
        rtv = (Button) findViewById(R.id.rtv);
        jamunatv = (Button) findViewById(R.id.jamunatv);
        atnNews = (Button) findViewById(R.id.atnNews);
        independent = (Button) findViewById(R.id.independent);
        ntv = (Button) findViewById(R.id.ntv);
        anandatv = (Button) findViewById(R.id.anandatv);
        gtv = (Button) findViewById(R.id.gtv);
        banglavison = (Button) findViewById(R.id.banglavison);
        aljezeera = (Button) findViewById(R.id.aljezeera);
        skynews = (Button) findViewById(R.id.skynews);
        news18 = (Button) findViewById(R.id.news18);
        arynews = (Button) findViewById(R.id.arynews);
        abcnews = (Button) findViewById(R.id.abcnews);
        abpnews = (Button) findViewById(R.id.abpnews);
        cnn = (Button) findViewById(R.id.cnn);

        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PlayerActivity.class);
                startActivity(intent);
            }
        });

       news24.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent news24 = new Intent(getApplicationContext(),Channel24Player.class);
               startActivity(news24);
           }
       });

       rtv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent rtv = new Intent(getApplicationContext(), RtvPlayer.class);
               startActivity(rtv);
           }
       });

        jamunatv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jamunatv = new Intent(getApplicationContext(), JamunaPlayer.class);
                startActivity(jamunatv);
            }
        });

        atnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atnNews = new Intent(getApplicationContext(), AtnNewsPlayer.class);
                startActivity(atnNews);
            }
        });

        independent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent independent = new Intent(getApplicationContext(), IndependentNewsPlayer.class);
                startActivity(independent);
            }
        });

        ntv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ntv = new Intent(getApplicationContext(), NtvPlayer.class);
                startActivity(ntv);
            }
        });

        anandatv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anandatv = new Intent(getApplicationContext(), AnandaTvPlayer.class);
                startActivity(anandatv);
            }
        });

        gtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gtv = new Intent(getApplicationContext(), GtvPlayer.class);
                startActivity(gtv);
            }
        });

        banglavison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent banglavison = new Intent(getApplicationContext(), BanglavisonPlayer.class);
                startActivity(banglavison);
            }
        });

        aljezeera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlJezeeraPlayer.class);
                startActivity(intent);
            }
        });

        skynews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SkyNews.class);
                startActivity(intent);
            }
        });

        news18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), News18.class);
                startActivity(intent);
            }
        });

        arynews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AryNews.class);
                startActivity(intent);
            }
        });

        abcnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AbcNewsPlayer.class);
                startActivity(intent);
            }
        });

        abpnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AbpNews.class);
                startActivity(intent);
            }
        });

        cnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CnnNews18.class);
                startActivity(intent);
            }
        });

    }
}
