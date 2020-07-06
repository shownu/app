package com.example.closingcheck;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public final class Util {
        public String getTimeStampNow() {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            final String timeStamp = sdf.format(cal.getTime());
            return timeStamp;
        }
        public String getCurrentDate() {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            final String currentDate = sdf.format(cal.getTime());
            return currentDate;
        }
    }

    private void setTimeStamp(CheckBox cb, final TextView txt) {
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Util variable = new Util();
                String timeStamp = variable.getTimeStampNow();
                txt.setText(timeStamp);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail();
            }
        });

        CheckBox gfsub1_1 = (CheckBox)findViewById(R.id.gfsub1_1);
        CheckBox gfsub1_2 = (CheckBox)findViewById(R.id.gfsub1_2);
        CheckBox gfsub1_3 = (CheckBox)findViewById(R.id.gfsub1_3);
        final TextView gfsub1_1_txt = (TextView)findViewById(R.id.gfsub1_1_ts);
        final TextView gfsub1_2_txt = (TextView)findViewById(R.id.gfsub1_2_ts);
        final TextView gfsub1_3_txt = (TextView)findViewById(R.id.gfsub1_3_ts);
        setTimeStamp(gfsub1_1, gfsub1_1_txt);
        setTimeStamp(gfsub1_2, gfsub1_2_txt);
        setTimeStamp(gfsub1_3, gfsub1_3_txt);

        CheckBox gfsub2_1 = (CheckBox)findViewById(R.id.gfsub2_1);
        CheckBox gfsub2_2 = (CheckBox)findViewById(R.id.gfsub2_2);
        CheckBox gfsub2_3 = (CheckBox)findViewById(R.id.gfsub2_3);
        final TextView gfsub2_1_txt = (TextView)findViewById(R.id.gfsub2_1_ts);
        final TextView gfsub2_2_txt = (TextView)findViewById(R.id.gfsub2_2_ts);
        final TextView gfsub2_3_txt = (TextView)findViewById(R.id.gfsub2_3_ts);
        setTimeStamp(gfsub2_1, gfsub2_1_txt);
        setTimeStamp(gfsub2_2, gfsub2_2_txt);
        setTimeStamp(gfsub2_3, gfsub2_3_txt);

        CheckBox gfsub3_1 = (CheckBox)findViewById(R.id.gfsub3_1);
        CheckBox gfsub3_2 = (CheckBox)findViewById(R.id.gfsub3_2);
        final TextView gfsub3_1_txt = (TextView)findViewById(R.id.gfsub3_1_ts);
        final TextView gfsub3_2_txt = (TextView)findViewById(R.id.gfsub3_2_ts);
        setTimeStamp(gfsub3_1, gfsub3_1_txt);
        setTimeStamp(gfsub3_2, gfsub3_2_txt);

        CheckBox gfsub4_1 = (CheckBox)findViewById(R.id.gfsub4_1);
        CheckBox gfsub4_2 = (CheckBox)findViewById(R.id.gfsub4_2);
        CheckBox gfsub4_3 = (CheckBox)findViewById(R.id.gfsub4_3);
        CheckBox gfsub4_4 = (CheckBox)findViewById(R.id.gfsub4_4);
        CheckBox gfsub4_5 = (CheckBox)findViewById(R.id.gfsub4_5);
        final TextView gfsub4_1_txt = (TextView)findViewById(R.id.gfsub4_1_ts);
        final TextView gfsub4_2_txt = (TextView)findViewById(R.id.gfsub4_2_ts);
        final TextView gfsub4_3_txt = (TextView)findViewById(R.id.gfsub4_3_ts);
        final TextView gfsub4_4_txt = (TextView)findViewById(R.id.gfsub4_4_ts);
        final TextView gfsub4_5_txt = (TextView)findViewById(R.id.gfsub4_5_ts);
        setTimeStamp(gfsub4_1, gfsub4_1_txt);
        setTimeStamp(gfsub4_2, gfsub4_2_txt);
        setTimeStamp(gfsub4_3, gfsub4_3_txt);
        setTimeStamp(gfsub4_4, gfsub4_4_txt);
        setTimeStamp(gfsub4_5, gfsub4_5_txt);

        CheckBox gfsub5_1 = (CheckBox)findViewById(R.id.gfsub5_1);
        CheckBox gfsub5_2 = (CheckBox)findViewById(R.id.gfsub5_2);
        CheckBox gfsub5_3 = (CheckBox)findViewById(R.id.gfsub5_3);
        CheckBox gfsub5_4 = (CheckBox)findViewById(R.id.gfsub5_4);
        final TextView gfsub5_1_txt = (TextView)findViewById(R.id.gfsub5_1_ts);
        final TextView gfsub5_2_txt = (TextView)findViewById(R.id.gfsub5_2_ts);
        final TextView gfsub5_3_txt = (TextView)findViewById(R.id.gfsub5_3_ts);
        final TextView gfsub5_4_txt = (TextView)findViewById(R.id.gfsub5_4_ts);
        setTimeStamp(gfsub5_1, gfsub5_1_txt);
        setTimeStamp(gfsub5_2, gfsub5_2_txt);
        setTimeStamp(gfsub5_3, gfsub5_3_txt);
        setTimeStamp(gfsub5_4, gfsub5_4_txt);

        CheckBox gfsub6_1 = (CheckBox)findViewById(R.id.gfsub6_1);
        CheckBox gfsub6_2 = (CheckBox)findViewById(R.id.gfsub6_2);
        final TextView gfsub6_1_txt = (TextView)findViewById(R.id.gfsub6_1_ts);
        final TextView gfsub6_2_txt = (TextView)findViewById(R.id.gfsub6_2_ts);
        setTimeStamp(gfsub6_1, gfsub6_1_txt);
        setTimeStamp(gfsub6_2, gfsub6_2_txt);

        CheckBox gfsub7_1 = (CheckBox)findViewById(R.id.gfsub7_1);
        CheckBox gfsub7_2 = (CheckBox)findViewById(R.id.gfsub7_2);
        CheckBox gfsub7_3 = (CheckBox)findViewById(R.id.gfsub7_3);
        CheckBox gfsub7_4 = (CheckBox)findViewById(R.id.gfsub7_4);
        final TextView gfsub7_1_txt = (TextView)findViewById(R.id.gfsub7_1_ts);
        final TextView gfsub7_2_txt = (TextView)findViewById(R.id.gfsub7_2_ts);
        final TextView gfsub7_3_txt = (TextView)findViewById(R.id.gfsub7_3_ts);
        final TextView gfsub7_4_txt = (TextView)findViewById(R.id.gfsub7_4_ts);
        setTimeStamp(gfsub7_1, gfsub7_1_txt);
        setTimeStamp(gfsub7_2, gfsub7_2_txt);
        setTimeStamp(gfsub7_3, gfsub7_3_txt);
        setTimeStamp(gfsub7_4, gfsub7_4_txt);

        CheckBox gfsub8_1 = (CheckBox)findViewById(R.id.gfsub8_1);
        CheckBox gfsub8_2 = (CheckBox)findViewById(R.id.gfsub8_2);
        CheckBox gfsub8_3 = (CheckBox)findViewById(R.id.gfsub8_3);
        CheckBox gfsub8_4 = (CheckBox)findViewById(R.id.gfsub8_4);
        final TextView gfsub8_1_txt = (TextView)findViewById(R.id.gfsub8_1_ts);
        final TextView gfsub8_2_txt = (TextView)findViewById(R.id.gfsub8_2_ts);
        final TextView gfsub8_3_txt = (TextView)findViewById(R.id.gfsub8_3_ts);
        final TextView gfsub8_4_txt = (TextView)findViewById(R.id.gfsub8_4_ts);
        setTimeStamp(gfsub8_1, gfsub8_1_txt);
        setTimeStamp(gfsub8_2, gfsub8_2_txt);
        setTimeStamp(gfsub8_3, gfsub8_3_txt);
        setTimeStamp(gfsub8_4, gfsub8_4_txt);

        CheckBox gfsub9_1 = (CheckBox)findViewById(R.id.gfsub9_1);
        CheckBox gfsub9_2 = (CheckBox)findViewById(R.id.gfsub9_2);
        CheckBox gfsub9_3 = (CheckBox)findViewById(R.id.gfsub9_3);
        CheckBox gfsub9_4 = (CheckBox)findViewById(R.id.gfsub9_4);
        final TextView gfsub9_1_txt = (TextView)findViewById(R.id.gfsub9_1_ts);
        final TextView gfsub9_2_txt = (TextView)findViewById(R.id.gfsub9_2_ts);
        final TextView gfsub9_3_txt = (TextView)findViewById(R.id.gfsub9_3_ts);
        final TextView gfsub9_4_txt = (TextView)findViewById(R.id.gfsub9_4_ts);
        setTimeStamp(gfsub9_1, gfsub9_1_txt);
        setTimeStamp(gfsub9_2, gfsub9_2_txt);
        setTimeStamp(gfsub9_3, gfsub9_3_txt);
        setTimeStamp(gfsub9_4, gfsub9_4_txt);

        CheckBox gfsub10_1 = (CheckBox)findViewById(R.id.gfsub10_1);
        CheckBox gfsub10_2 = (CheckBox)findViewById(R.id.gfsub10_2);
        CheckBox gfsub10_3 = (CheckBox)findViewById(R.id.gfsub10_3);
        CheckBox gfsub10_4 = (CheckBox)findViewById(R.id.gfsub10_4);
        CheckBox gfsub10_5 = (CheckBox)findViewById(R.id.gfsub10_5);
        CheckBox gfsub10_6 = (CheckBox)findViewById(R.id.gfsub10_6);
        final TextView gfsub10_1_txt = (TextView)findViewById(R.id.gfsub10_1_ts);
        final TextView gfsub10_2_txt = (TextView)findViewById(R.id.gfsub10_2_ts);
        final TextView gfsub10_3_txt = (TextView)findViewById(R.id.gfsub10_3_ts);
        final TextView gfsub10_4_txt = (TextView)findViewById(R.id.gfsub10_4_ts);
        final TextView gfsub10_5_txt = (TextView)findViewById(R.id.gfsub10_5_ts);
        final TextView gfsub10_6_txt = (TextView)findViewById(R.id.gfsub10_6_ts);
        setTimeStamp(gfsub10_1, gfsub10_1_txt);
        setTimeStamp(gfsub10_2, gfsub10_2_txt);
        setTimeStamp(gfsub10_3, gfsub10_3_txt);
        setTimeStamp(gfsub10_4, gfsub10_4_txt);
        setTimeStamp(gfsub10_5, gfsub10_5_txt);
        setTimeStamp(gfsub10_6, gfsub10_6_txt);

        CheckBox ffsub1_1 = (CheckBox)findViewById(R.id.ffsub1_1);
        CheckBox ffsub1_2 = (CheckBox)findViewById(R.id.ffsub1_2);
        CheckBox ffsub1_3 = (CheckBox)findViewById(R.id.ffsub1_3);
        final TextView ffsub1_1_txt = (TextView)findViewById(R.id.ffsub1_1_ts);
        final TextView ffsub1_2_txt = (TextView)findViewById(R.id.ffsub1_2_ts);
        final TextView ffsub1_3_txt = (TextView)findViewById(R.id.ffsub1_3_ts);
        setTimeStamp(ffsub1_1, ffsub1_1_txt);
        setTimeStamp(ffsub1_2, ffsub1_2_txt);
        setTimeStamp(ffsub1_3, ffsub1_3_txt);

        CheckBox ffsub2_1 = (CheckBox)findViewById(R.id.ffsub2_1);
        CheckBox ffsub2_2 = (CheckBox)findViewById(R.id.ffsub2_2);
        CheckBox ffsub2_3 = (CheckBox)findViewById(R.id.ffsub2_3);
        final TextView ffsub2_1_txt = (TextView)findViewById(R.id.ffsub2_1_ts);
        final TextView ffsub2_2_txt = (TextView)findViewById(R.id.ffsub2_2_ts);
        final TextView ffsub2_3_txt = (TextView)findViewById(R.id.ffsub2_3_ts);
        setTimeStamp(ffsub2_1, ffsub2_1_txt);
        setTimeStamp(ffsub2_2, ffsub2_2_txt);
        setTimeStamp(ffsub2_3, ffsub2_3_txt);

        CheckBox ffsub3_1 = (CheckBox)findViewById(R.id.ffsub3_1);
        CheckBox ffsub3_2 = (CheckBox)findViewById(R.id.ffsub3_2);
        CheckBox ffsub3_3 = (CheckBox)findViewById(R.id.ffsub3_3);
        CheckBox ffsub3_4 = (CheckBox)findViewById(R.id.ffsub3_4);
        CheckBox ffsub3_5 = (CheckBox)findViewById(R.id.ffsub3_5);
        final TextView ffsub3_1_txt = (TextView)findViewById(R.id.ffsub3_1_ts);
        final TextView ffsub3_2_txt = (TextView)findViewById(R.id.ffsub3_2_ts);
        final TextView ffsub3_3_txt = (TextView)findViewById(R.id.ffsub3_3_ts);
        final TextView ffsub3_4_txt = (TextView)findViewById(R.id.ffsub3_4_ts);
        final TextView ffsub3_5_txt = (TextView)findViewById(R.id.ffsub3_5_ts);
        setTimeStamp(ffsub3_1, ffsub3_1_txt);
        setTimeStamp(ffsub3_2, ffsub3_2_txt);
        setTimeStamp(ffsub3_3, ffsub3_3_txt);
        setTimeStamp(ffsub3_4, ffsub3_4_txt);
        setTimeStamp(ffsub3_5, ffsub3_5_txt);

        CheckBox ffsub4_1 = (CheckBox)findViewById(R.id.ffsub4_1);
        CheckBox ffsub4_2 = (CheckBox)findViewById(R.id.ffsub4_2);
        CheckBox ffsub4_3 = (CheckBox)findViewById(R.id.ffsub4_3);
        CheckBox ffsub4_4 = (CheckBox)findViewById(R.id.ffsub4_4);
        final TextView ffsub4_1_txt = (TextView)findViewById(R.id.ffsub4_1_ts);
        final TextView ffsub4_2_txt = (TextView)findViewById(R.id.ffsub4_2_ts);
        final TextView ffsub4_3_txt = (TextView)findViewById(R.id.ffsub4_3_ts);
        final TextView ffsub4_4_txt = (TextView)findViewById(R.id.ffsub4_4_ts);
        setTimeStamp(ffsub4_1, ffsub4_1_txt);
        setTimeStamp(ffsub4_2, ffsub4_2_txt);
        setTimeStamp(ffsub4_3, ffsub4_3_txt);
        setTimeStamp(ffsub4_4, ffsub4_4_txt);

        CheckBox ffsub5_1 = (CheckBox)findViewById(R.id.ffsub5_1);
        CheckBox ffsub5_2 = (CheckBox)findViewById(R.id.ffsub5_2);
        CheckBox ffsub5_3 = (CheckBox)findViewById(R.id.ffsub5_3);
        CheckBox ffsub5_4 = (CheckBox)findViewById(R.id.ffsub5_4);
        final TextView ffsub5_1_txt = (TextView)findViewById(R.id.ffsub5_1_ts);
        final TextView ffsub5_2_txt = (TextView)findViewById(R.id.ffsub5_2_ts);
        final TextView ffsub5_3_txt = (TextView)findViewById(R.id.ffsub5_3_ts);
        final TextView ffsub5_4_txt = (TextView)findViewById(R.id.ffsub5_4_ts);
        setTimeStamp(ffsub5_1, ffsub5_1_txt);
        setTimeStamp(ffsub5_2, ffsub5_2_txt);
        setTimeStamp(ffsub5_3, ffsub5_3_txt);
        setTimeStamp(ffsub5_4, ffsub5_4_txt);

        CheckBox ffsub6_1 = (CheckBox)findViewById(R.id.ffsub6_1);
        CheckBox ffsub6_2 = (CheckBox)findViewById(R.id.ffsub6_2);
        CheckBox ffsub6_3 = (CheckBox)findViewById(R.id.ffsub6_3);
        CheckBox ffsub6_4 = (CheckBox)findViewById(R.id.ffsub6_4);
        CheckBox ffsub6_5 = (CheckBox)findViewById(R.id.ffsub6_5);
        final TextView ffsub6_1_txt = (TextView)findViewById(R.id.ffsub6_1_ts);
        final TextView ffsub6_2_txt = (TextView)findViewById(R.id.ffsub6_2_ts);
        final TextView ffsub6_3_txt = (TextView)findViewById(R.id.ffsub6_3_ts);
        final TextView ffsub6_4_txt = (TextView)findViewById(R.id.ffsub6_4_ts);
        final TextView ffsub6_5_txt = (TextView)findViewById(R.id.ffsub6_5_ts);
        setTimeStamp(ffsub6_1, ffsub6_1_txt);
        setTimeStamp(ffsub6_2, ffsub6_2_txt);
        setTimeStamp(ffsub6_3, ffsub6_3_txt);
        setTimeStamp(ffsub6_4, ffsub6_4_txt);
        setTimeStamp(ffsub6_5, ffsub6_5_txt);

        CheckBox ffsub7_1 = (CheckBox)findViewById(R.id.ffsub7_1);
        CheckBox ffsub7_2 = (CheckBox)findViewById(R.id.ffsub7_2);
        CheckBox ffsub7_3 = (CheckBox)findViewById(R.id.ffsub7_3);
        CheckBox ffsub7_4 = (CheckBox)findViewById(R.id.ffsub7_4);
        CheckBox ffsub7_5 = (CheckBox)findViewById(R.id.ffsub7_5);
        final TextView ffsub7_1_txt = (TextView)findViewById(R.id.ffsub7_1_ts);
        final TextView ffsub7_2_txt = (TextView)findViewById(R.id.ffsub7_2_ts);
        final TextView ffsub7_3_txt = (TextView)findViewById(R.id.ffsub7_3_ts);
        final TextView ffsub7_4_txt = (TextView)findViewById(R.id.ffsub7_4_ts);
        final TextView ffsub7_5_txt = (TextView)findViewById(R.id.ffsub7_5_ts);
        setTimeStamp(ffsub7_1, ffsub7_1_txt);
        setTimeStamp(ffsub7_2, ffsub7_2_txt);
        setTimeStamp(ffsub7_3, ffsub7_3_txt);
        setTimeStamp(ffsub7_4, ffsub7_4_txt);
        setTimeStamp(ffsub7_5, ffsub7_5_txt);

        CheckBox ffsub8_1 = (CheckBox)findViewById(R.id.ffsub8_1);
        CheckBox ffsub8_2 = (CheckBox)findViewById(R.id.ffsub8_2);
        CheckBox ffsub8_3 = (CheckBox)findViewById(R.id.ffsub8_3);
        CheckBox ffsub8_4 = (CheckBox)findViewById(R.id.ffsub8_4);
        CheckBox ffsub8_5 = (CheckBox)findViewById(R.id.ffsub8_5);
        CheckBox ffsub8_6 = (CheckBox)findViewById(R.id.ffsub8_6);
        final TextView ffsub8_1_txt = (TextView)findViewById(R.id.ffsub8_1_ts);
        final TextView ffsub8_2_txt = (TextView)findViewById(R.id.ffsub8_2_ts);
        final TextView ffsub8_3_txt = (TextView)findViewById(R.id.ffsub8_3_ts);
        final TextView ffsub8_4_txt = (TextView)findViewById(R.id.ffsub8_4_ts);
        final TextView ffsub8_5_txt = (TextView)findViewById(R.id.ffsub8_5_ts);
        final TextView ffsub8_6_txt = (TextView)findViewById(R.id.ffsub8_6_ts);
        setTimeStamp(ffsub8_1, ffsub8_1_txt);
        setTimeStamp(ffsub8_2, ffsub8_2_txt);
        setTimeStamp(ffsub8_3, ffsub8_3_txt);
        setTimeStamp(ffsub8_4, ffsub8_4_txt);
        setTimeStamp(ffsub8_5, ffsub8_5_txt);
        setTimeStamp(ffsub8_6, ffsub8_6_txt);

        CheckBox sfsub1_1 = (CheckBox)findViewById(R.id.sfsub1_1);
        CheckBox sfsub1_2 = (CheckBox)findViewById(R.id.sfsub1_2);
        CheckBox sfsub1_3 = (CheckBox)findViewById(R.id.sfsub1_3);
        final TextView sfsub1_1_txt = (TextView)findViewById(R.id.sfsub1_1_ts);
        final TextView sfsub1_2_txt = (TextView)findViewById(R.id.sfsub1_2_ts);
        final TextView sfsub1_3_txt = (TextView)findViewById(R.id.sfsub1_3_ts);
        setTimeStamp(sfsub1_1, sfsub1_1_txt);
        setTimeStamp(sfsub1_2, sfsub1_2_txt);
        setTimeStamp(sfsub1_3, sfsub1_3_txt);

        CheckBox sfsub2_1 = (CheckBox)findViewById(R.id.sfsub2_1);
        CheckBox sfsub2_2 = (CheckBox)findViewById(R.id.sfsub2_2);
        CheckBox sfsub2_3 = (CheckBox)findViewById(R.id.sfsub2_3);
        final TextView sfsub2_1_txt = (TextView)findViewById(R.id.sfsub2_1_ts);
        final TextView sfsub2_2_txt = (TextView)findViewById(R.id.sfsub2_2_ts);
        final TextView sfsub2_3_txt = (TextView)findViewById(R.id.sfsub2_3_ts);
        setTimeStamp(sfsub2_1, sfsub2_1_txt);
        setTimeStamp(sfsub2_2, sfsub2_2_txt);
        setTimeStamp(sfsub2_3, sfsub2_3_txt);

        CheckBox sfsub3_1 = (CheckBox)findViewById(R.id.sfsub3_1);
        CheckBox sfsub3_2 = (CheckBox)findViewById(R.id.sfsub3_2);
        CheckBox sfsub3_3 = (CheckBox)findViewById(R.id.sfsub3_3);
        final TextView sfsub3_1_txt = (TextView)findViewById(R.id.sfsub3_1_ts);
        final TextView sfsub3_2_txt = (TextView)findViewById(R.id.sfsub3_2_ts);
        final TextView sfsub3_3_txt = (TextView)findViewById(R.id.sfsub3_3_ts);
        setTimeStamp(sfsub3_1, sfsub3_1_txt);
        setTimeStamp(sfsub3_2, sfsub3_2_txt);
        setTimeStamp(sfsub3_3, sfsub3_3_txt);

        CheckBox sfsub4_1 = (CheckBox)findViewById(R.id.sfsub4_1);
        CheckBox sfsub4_2 = (CheckBox)findViewById(R.id.sfsub4_2);
        CheckBox sfsub4_3 = (CheckBox)findViewById(R.id.sfsub4_3);
        final TextView sfsub4_1_txt = (TextView)findViewById(R.id.sfsub4_1_ts);
        final TextView sfsub4_2_txt = (TextView)findViewById(R.id.sfsub4_2_ts);
        final TextView sfsub4_3_txt = (TextView)findViewById(R.id.sfsub4_3_ts);
        setTimeStamp(sfsub4_1, sfsub4_1_txt);
        setTimeStamp(sfsub4_2, sfsub4_2_txt);
        setTimeStamp(sfsub4_3, sfsub4_3_txt);

        CheckBox sfsub5_1 = (CheckBox)findViewById(R.id.sfsub5_1);
        CheckBox sfsub5_2 = (CheckBox)findViewById(R.id.sfsub5_2);
        final TextView sfsub5_1_txt = (TextView)findViewById(R.id.sfsub5_1_ts);
        final TextView sfsub5_2_txt = (TextView)findViewById(R.id.sfsub5_2_ts);
        setTimeStamp(sfsub5_1, sfsub5_1_txt);
        setTimeStamp(sfsub5_2, sfsub5_2_txt);

        CheckBox sfsub6_1 = (CheckBox)findViewById(R.id.sfsub6_1);
        CheckBox sfsub6_2 = (CheckBox)findViewById(R.id.sfsub6_2);
        CheckBox sfsub6_3 = (CheckBox)findViewById(R.id.sfsub6_3);
        CheckBox sfsub6_4 = (CheckBox)findViewById(R.id.sfsub6_4);
        CheckBox sfsub6_5 = (CheckBox)findViewById(R.id.sfsub6_5);
        final TextView sfsub6_1_txt = (TextView)findViewById(R.id.sfsub6_1_ts);
        final TextView sfsub6_2_txt = (TextView)findViewById(R.id.sfsub6_2_ts);
        final TextView sfsub6_3_txt = (TextView)findViewById(R.id.sfsub6_3_ts);
        final TextView sfsub6_4_txt = (TextView)findViewById(R.id.sfsub6_4_ts);
        final TextView sfsub6_5_txt = (TextView)findViewById(R.id.sfsub6_5_ts);
        setTimeStamp(sfsub6_1, sfsub6_1_txt);
        setTimeStamp(sfsub6_2, sfsub6_2_txt);
        setTimeStamp(sfsub6_3, sfsub6_3_txt);
        setTimeStamp(sfsub6_4, sfsub6_4_txt);
        setTimeStamp(sfsub6_5, sfsub6_5_txt);

        CheckBox sfsub7_1 = (CheckBox)findViewById(R.id.sfsub7_1);
        CheckBox sfsub7_2 = (CheckBox)findViewById(R.id.sfsub7_2);
        final TextView sfsub7_1_txt = (TextView)findViewById(R.id.sfsub7_1_ts);
        final TextView sfsub7_2_txt = (TextView)findViewById(R.id.sfsub7_2_ts);
        setTimeStamp(sfsub7_1, sfsub7_1_txt);
        setTimeStamp(sfsub7_2, sfsub7_2_txt);

        CheckBox sfsub8_1 = (CheckBox)findViewById(R.id.sfsub8_1);
        CheckBox sfsub8_2 = (CheckBox)findViewById(R.id.sfsub8_2);
        CheckBox sfsub8_3 = (CheckBox)findViewById(R.id.sfsub8_3);
        CheckBox sfsub8_4 = (CheckBox)findViewById(R.id.sfsub8_4);
        final TextView sfsub8_1_txt = (TextView)findViewById(R.id.sfsub8_1_ts);
        final TextView sfsub8_2_txt = (TextView)findViewById(R.id.sfsub8_2_ts);
        final TextView sfsub8_3_txt = (TextView)findViewById(R.id.sfsub8_3_ts);
        final TextView sfsub8_4_txt = (TextView)findViewById(R.id.sfsub8_4_ts);
        setTimeStamp(sfsub8_1, sfsub8_1_txt);
        setTimeStamp(sfsub8_2, sfsub8_2_txt);
        setTimeStamp(sfsub8_3, sfsub8_3_txt);
        setTimeStamp(sfsub8_4, sfsub8_4_txt);

        CheckBox bf_1 = (CheckBox)findViewById(R.id.bf_1);
        CheckBox bf_2 = (CheckBox)findViewById(R.id.bf_2);
        CheckBox bf_3 = (CheckBox)findViewById(R.id.bf_3);
        CheckBox bf_4 = (CheckBox)findViewById(R.id.bf_4);
        CheckBox bf_5 = (CheckBox)findViewById(R.id.bf_5);
        CheckBox bf_6 = (CheckBox)findViewById(R.id.bf_6);
        CheckBox bf_7 = (CheckBox)findViewById(R.id.bf_7);
        CheckBox bf_8 = (CheckBox)findViewById(R.id.bf_8);
        CheckBox bf_9 = (CheckBox)findViewById(R.id.bf_9);
        CheckBox bf_10 = (CheckBox)findViewById(R.id.bf_10);
        final TextView bf_1_txt = (TextView)findViewById(R.id.bf_1_ts);
        final TextView bf_2_txt = (TextView)findViewById(R.id.bf_2_ts);
        final TextView bf_3_txt = (TextView)findViewById(R.id.bf_3_ts);
        final TextView bf_4_txt = (TextView)findViewById(R.id.bf_4_ts);
        final TextView bf_5_txt = (TextView)findViewById(R.id.bf_5_ts);
        final TextView bf_6_txt = (TextView)findViewById(R.id.bf_6_ts);
        final TextView bf_7_txt = (TextView)findViewById(R.id.bf_7_ts);
        final TextView bf_8_txt = (TextView)findViewById(R.id.bf_8_ts);
        final TextView bf_9_txt = (TextView)findViewById(R.id.bf_9_ts);
        final TextView bf_10_txt = (TextView)findViewById(R.id.bf_10_ts);
        setTimeStamp(bf_1, bf_1_txt);
        setTimeStamp(bf_2, bf_2_txt);
        setTimeStamp(bf_3, bf_3_txt);
        setTimeStamp(bf_4, bf_4_txt);
        setTimeStamp(bf_5, bf_5_txt);
        setTimeStamp(bf_6, bf_6_txt);
        setTimeStamp(bf_7, bf_7_txt);
        setTimeStamp(bf_8, bf_8_txt);
        setTimeStamp(bf_9, bf_9_txt);
        setTimeStamp(bf_10, bf_10_txt);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    protected void sendEmail() {
        Log.i("Send email", "");

        String sf1_1 = getResources().getString(R.string.sfsub1_1) + " " + ((TextView)findViewById(R.id.sfsub1_1_ts)).getText().toString() + "<br>";
        String sf1_2 = getResources().getString(R.string.sfsub1_2) + " " + ((TextView)findViewById(R.id.sfsub1_2_ts)).getText().toString() + "<br>";
        String sf1_3 = getResources().getString(R.string.sfsub1_3) + " " + ((TextView)findViewById(R.id.sfsub1_3_ts)).getText().toString() + "<br>";
        String sf1 = getResources().getString(R.string.sf_subtitle1) + "<br>" + sf1_1 + sf1_2 + sf1_3 + "<br>";
        String sf2_1 = getResources().getString(R.string.sfsub2_1) + " " + ((TextView)findViewById(R.id.sfsub2_1_ts)).getText().toString() + "<br>";
        String sf2_2 = getResources().getString(R.string.sfsub2_2) + " " + ((TextView)findViewById(R.id.sfsub2_2_ts)).getText().toString() + "<br>";
        String sf2_3 = getResources().getString(R.string.sfsub2_3) + " " + ((TextView)findViewById(R.id.sfsub2_3_ts)).getText().toString() + "<br>";
        String sf2 = getResources().getString(R.string.sf_subtitle2) + "<br>" + sf2_1 + sf2_2 + sf2_3 + "<br>";
        String sf3_1 = getResources().getString(R.string.sfsub3_1) + " " + ((TextView)findViewById(R.id.sfsub3_1_ts)).getText().toString() + "<br>";
        String sf3_2 = getResources().getString(R.string.sfsub3_2) + " " + ((TextView)findViewById(R.id.sfsub3_2_ts)).getText().toString() + "<br>";
        String sf3_3 = getResources().getString(R.string.sfsub3_3) + " " + ((TextView)findViewById(R.id.sfsub3_3_ts)).getText().toString() + "<br>";
        String sf3 = getResources().getString(R.string.sf_subtitle3) + "<br>" + sf3_1 + sf3_2 + sf3_3 + "<br>";
        String sf4_1 = getResources().getString(R.string.sfsub4_1) + " " + ((TextView)findViewById(R.id.sfsub4_1_ts)).getText().toString() + "<br>";
        String sf4_2 = getResources().getString(R.string.sfsub4_2) + " " + ((TextView)findViewById(R.id.sfsub4_2_ts)).getText().toString() + "<br>";
        String sf4_3 = getResources().getString(R.string.sfsub4_3) + " " + ((TextView)findViewById(R.id.sfsub4_3_ts)).getText().toString() + "<br>";
        String sf4 = getResources().getString(R.string.sf_subtitle4) + "<br>" + sf4_1 + sf4_2 + sf4_3 + "<br>";
        String sf5_1 = getResources().getString(R.string.sfsub5_1) + " " + ((TextView)findViewById(R.id.sfsub5_1_ts)).getText().toString() + "<br>";
        String sf5_2 = getResources().getString(R.string.sfsub5_2) + " " + ((TextView)findViewById(R.id.sfsub5_2_ts)).getText().toString() + "<br>";
        String sf5 = getResources().getString(R.string.sf_subtitle5) + "<br>" + sf5_1 + sf5_2 + "<br>";
        String sf6_1 = getResources().getString(R.string.sfsub6_1) + " " + ((TextView)findViewById(R.id.sfsub6_1_ts)).getText().toString() + "<br>";
        String sf6_2 = getResources().getString(R.string.sfsub6_2) + " " + ((TextView)findViewById(R.id.sfsub6_2_ts)).getText().toString() + "<br>";
        String sf6_3 = getResources().getString(R.string.sfsub6_3) + " " + ((TextView)findViewById(R.id.sfsub6_3_ts)).getText().toString() + "<br>";
        String sf6_4 = getResources().getString(R.string.sfsub6_4) + " " + ((TextView)findViewById(R.id.sfsub6_4_ts)).getText().toString() + "<br>";
        String sf6_5 = getResources().getString(R.string.sfsub6_5) + " " + ((TextView)findViewById(R.id.sfsub6_5_ts)).getText().toString() + "<br>";
        String sf6 = getResources().getString(R.string.sf_subtitle6) + "<br>" + sf6_1 + sf6_2 + sf6_3 + sf6_4 + sf6_5 + "<br>";
        String sf7_1 = getResources().getString(R.string.sfsub7_1) + " " + ((TextView)findViewById(R.id.sfsub7_1_ts)).getText().toString() + "<br>";
        String sf7_2 = getResources().getString(R.string.sfsub7_2) + " " + ((TextView)findViewById(R.id.sfsub7_2_ts)).getText().toString() + "<br>";
        String sf7 = getResources().getString(R.string.sf_subtitle7) + "<br>" + sf7_1 + sf7_2 + "<br>";
        String sf8_1 = getResources().getString(R.string.sfsub8_1) + " " + ((TextView)findViewById(R.id.sfsub8_1_ts)).getText().toString() + "<br>";
        String sf8_2 = getResources().getString(R.string.sfsub8_2) + " " + ((TextView)findViewById(R.id.sfsub8_2_ts)).getText().toString() + "<br>";
        String sf8_3 = getResources().getString(R.string.sfsub8_3) + " " + ((TextView)findViewById(R.id.sfsub8_3_ts)).getText().toString() + "<br>";
        String sf8_4 = getResources().getString(R.string.sfsub8_4) + " " + ((TextView)findViewById(R.id.sfsub8_4_ts)).getText().toString() + "<br>";
        String sf8 = getResources().getString(R.string.sf_subtitle8) + "<br>" + sf8_1 + sf8_2 + sf8_3 + sf8_4 + "<br>";
        String sf_comments = "Comments: <i>" + ((TextView)findViewById(R.id.comments_sf)).getText().toString() + "</i>";
        String sf = "<b>" + getResources().getString(R.string.sf_title) + "</b><br><br>" + sf1 + sf2 + sf3 + sf4 + sf5 + sf6 + sf7 + sf8 + sf_comments + "<br><br>";

        String ff1_1 = getResources().getString(R.string.ffsub1_1) + " " + ((TextView)findViewById(R.id.ffsub1_1_ts)).getText().toString() + "<br>";
        String ff1_2 = getResources().getString(R.string.ffsub1_2) + " " + ((TextView)findViewById(R.id.ffsub1_2_ts)).getText().toString() + "<br>";
        String ff1_3 = getResources().getString(R.string.ffsub1_3) + " " + ((TextView)findViewById(R.id.ffsub1_3_ts)).getText().toString() + "<br>";
        String ff1 = getResources().getString(R.string.ff_subtitle1) + "<br>" + ff1_1 + ff1_2 + ff1_3 + "<br>";
        String ff2_1 = getResources().getString(R.string.ffsub2_1) + " " + ((TextView)findViewById(R.id.ffsub2_1_ts)).getText().toString() + "<br>";
        String ff2_2 = getResources().getString(R.string.ffsub2_2) + " " + ((TextView)findViewById(R.id.ffsub2_2_ts)).getText().toString() + "<br>";
        String ff2_3 = getResources().getString(R.string.ffsub2_3) + " " + ((TextView)findViewById(R.id.ffsub2_3_ts)).getText().toString() + "<br>";
        String ff2 = getResources().getString(R.string.ff_subtitle2) + "<br>" + ff2_1 + ff2_2 + ff2_3 + "<br>";
        String ff3_1 = getResources().getString(R.string.ffsub3_1) + " " + ((TextView)findViewById(R.id.ffsub3_1_ts)).getText().toString() + "<br>";
        String ff3_2 = getResources().getString(R.string.ffsub3_2) + " " + ((TextView)findViewById(R.id.ffsub3_2_ts)).getText().toString() + "<br>";
        String ff3_3 = getResources().getString(R.string.ffsub3_3) + " " + ((TextView)findViewById(R.id.ffsub3_3_ts)).getText().toString() + "<br>";
        String ff3_4 = getResources().getString(R.string.ffsub3_4) + " " + ((TextView)findViewById(R.id.ffsub3_4_ts)).getText().toString() + "<br>";
        String ff3_5 = getResources().getString(R.string.ffsub3_5) + " " + ((TextView)findViewById(R.id.ffsub3_5_ts)).getText().toString() + "<br>";
        String ff3 = getResources().getString(R.string.ff_subtitle3) + "<br>" + ff3_1 + ff3_2 + ff3_3 + ff3_4 + ff3_5 + "<br>";
        String ff4_1 = getResources().getString(R.string.ffsub4_1) + " " + ((TextView)findViewById(R.id.ffsub4_1_ts)).getText().toString() + "<br>";
        String ff4_2 = getResources().getString(R.string.ffsub4_2) + " " + ((TextView)findViewById(R.id.ffsub4_2_ts)).getText().toString() + "<br>";
        String ff4_3 = getResources().getString(R.string.ffsub4_3) + " " + ((TextView)findViewById(R.id.ffsub4_3_ts)).getText().toString() + "<br>";
        String ff4_4 = getResources().getString(R.string.ffsub4_4) + " " + ((TextView)findViewById(R.id.ffsub4_4_ts)).getText().toString() + "<br>";
        String ff4 = getResources().getString(R.string.ff_subtitle4) + "<br>" + ff4_1 + ff4_2 + ff4_3 + ff4_4 + "<br>";
        String ff5_1 = getResources().getString(R.string.ffsub5_1) + " " + ((TextView)findViewById(R.id.ffsub5_1_ts)).getText().toString() + "<br>";
        String ff5_2 = getResources().getString(R.string.ffsub5_2) + " " + ((TextView)findViewById(R.id.ffsub5_2_ts)).getText().toString() + "<br>";
        String ff5_3 = getResources().getString(R.string.ffsub5_3) + " " + ((TextView)findViewById(R.id.ffsub5_3_ts)).getText().toString() + "<br>";
        String ff5_4 = getResources().getString(R.string.ffsub5_4) + " " + ((TextView)findViewById(R.id.ffsub5_4_ts)).getText().toString() + "<br>";
        String ff5 = getResources().getString(R.string.ff_subtitle5) + "<br>" + ff5_1 + ff5_2 + ff5_3 + "<br>";
        String ff6_1 = getResources().getString(R.string.ffsub6_1) + " " + ((TextView)findViewById(R.id.ffsub6_1_ts)).getText().toString() + "<br>";
        String ff6_2 = getResources().getString(R.string.ffsub6_2) + " " + ((TextView)findViewById(R.id.ffsub6_2_ts)).getText().toString() + "<br>";
        String ff6_3 = getResources().getString(R.string.ffsub6_3) + " " + ((TextView)findViewById(R.id.ffsub6_3_ts)).getText().toString() + "<br>";
        String ff6_4 = getResources().getString(R.string.ffsub6_4) + " " + ((TextView)findViewById(R.id.ffsub6_4_ts)).getText().toString() + "<br>";
        String ff6_5 = getResources().getString(R.string.ffsub6_5) + " " + ((TextView)findViewById(R.id.ffsub6_5_ts)).getText().toString() + "<br>";
        String ff6 = getResources().getString(R.string.ff_subtitle6) + "<br>" + ff6_1 + ff6_2 + ff6_3 + ff6_4 + ff6_5 + "<br>";
        String ff7_1 = getResources().getString(R.string.ffsub7_1) + " " + ((TextView)findViewById(R.id.ffsub7_1_ts)).getText().toString() + "<br>";
        String ff7_2 = getResources().getString(R.string.ffsub7_2) + " " + ((TextView)findViewById(R.id.ffsub7_2_ts)).getText().toString() + "<br>";
        String ff7_3 = getResources().getString(R.string.ffsub7_3) + " " + ((TextView)findViewById(R.id.ffsub7_3_ts)).getText().toString() + "<br>";
        String ff7_4 = getResources().getString(R.string.ffsub7_4) + " " + ((TextView)findViewById(R.id.ffsub7_4_ts)).getText().toString() + "<br>";
        String ff7_5 = getResources().getString(R.string.ffsub7_5) + " " + ((TextView)findViewById(R.id.ffsub7_5_ts)).getText().toString() + "<br>";
        String ff7 = getResources().getString(R.string.ff_subtitle7) + "<br>" + ff7_1 + ff7_2 + ff7_3 + ff7_4 + ff7_5 + "<br>";
        String ff8_1 = getResources().getString(R.string.ffsub8_1) + " " + ((TextView)findViewById(R.id.ffsub8_1_ts)).getText().toString() + "<br>";
        String ff8_2 = getResources().getString(R.string.ffsub8_2) + " " + ((TextView)findViewById(R.id.ffsub8_2_ts)).getText().toString() + "<br>";
        String ff8_3 = getResources().getString(R.string.ffsub8_3) + " " + ((TextView)findViewById(R.id.ffsub8_3_ts)).getText().toString() + "<br>";
        String ff8_4 = getResources().getString(R.string.ffsub8_4) + " " + ((TextView)findViewById(R.id.ffsub8_4_ts)).getText().toString() + "<br>";
        String ff8_5 = getResources().getString(R.string.ffsub8_5) + " " + ((TextView)findViewById(R.id.ffsub8_5_ts)).getText().toString() + "<br>";
        String ff8_6 = getResources().getString(R.string.ffsub8_6) + " " + ((TextView)findViewById(R.id.ffsub8_6_ts)).getText().toString() + "<br>";
        String ff8 = getResources().getString(R.string.ff_subtitle8) + "<br>" + ff8_1 + ff8_2 + ff8_3 + ff8_4 + ff8_5 + ff8_6 + "<br>";
        String ff_comments = "Comments: <i>" + ((TextView)findViewById(R.id.comments_ff)).getText().toString() + "</i>";
        String ff = "<b>" + getResources().getString(R.string.ff_title) + "</b><br><br>" + ff1 + ff2 + ff3 + ff4 + ff5 + ff6 + ff7 + ff8 + ff_comments + "<br><br>";

        String gf1_1 = getResources().getString(R.string.gfsub1_1) + " " + ((TextView)findViewById(R.id.gfsub1_1_ts)).getText().toString() + "<br>";
        String gf1_2 = getResources().getString(R.string.gfsub1_2) + " " + ((TextView)findViewById(R.id.gfsub1_2_ts)).getText().toString() + "<br>";
        String gf1_3 = getResources().getString(R.string.gfsub1_3) + " " + ((TextView)findViewById(R.id.gfsub1_3_ts)).getText().toString() + "<br>";
        String gf1 = getResources().getString(R.string.gf_subtitle1) + "<br>" + gf1_1 + gf1_2 + gf1_3 + "<br>";
        String gf2_1 = getResources().getString(R.string.gfsub2_1) + " " + ((TextView)findViewById(R.id.gfsub2_1_ts)).getText().toString() + "<br>";
        String gf2_2 = getResources().getString(R.string.gfsub2_2) + " " + ((TextView)findViewById(R.id.gfsub2_2_ts)).getText().toString() + "<br>";
        String gf2_3 = getResources().getString(R.string.gfsub2_3) + " " + ((TextView)findViewById(R.id.gfsub2_3_ts)).getText().toString() + "<br>";
        String gf2 = getResources().getString(R.string.gf_subtitle2) + "<br>" + gf2_1 + gf2_2 + gf2_3 + "<br>";
        String gf3_1 = getResources().getString(R.string.gfsub3_1) + " " + ((TextView)findViewById(R.id.gfsub3_1_ts)).getText().toString() + "<br>";
        String gf3_2 = getResources().getString(R.string.gfsub3_2) + " " + ((TextView)findViewById(R.id.gfsub3_2_ts)).getText().toString() + "<br>";
        String gf3 = getResources().getString(R.string.gf_subtitle3) + "<br>" + gf3_1 + gf3_2 + "<br>";
        String gf4_1 = getResources().getString(R.string.gfsub4_1) + " " + ((TextView)findViewById(R.id.gfsub4_1_ts)).getText().toString() + "<br>";
        String gf4_2 = getResources().getString(R.string.gfsub4_2) + " " + ((TextView)findViewById(R.id.gfsub4_2_ts)).getText().toString() + "<br>";
        String gf4_3 = getResources().getString(R.string.gfsub4_3) + " " + ((TextView)findViewById(R.id.gfsub4_3_ts)).getText().toString() + "<br>";
        String gf4_4 = getResources().getString(R.string.gfsub4_4) + " " + ((TextView)findViewById(R.id.gfsub4_4_ts)).getText().toString() + "<br>";
        String gf4_5 = getResources().getString(R.string.gfsub4_5) + " " + ((TextView)findViewById(R.id.gfsub4_5_ts)).getText().toString() + "<br>";
        String gf4 = getResources().getString(R.string.gf_subtitle4) + "<br>" + gf4_1 + gf4_2 + gf4_3 + gf4_4 + gf4_5 + "<br>";
        String gf5_1 = getResources().getString(R.string.gfsub5_1) + " " + ((TextView)findViewById(R.id.gfsub5_1_ts)).getText().toString() + "<br>";
        String gf5_2 = getResources().getString(R.string.gfsub5_2) + " " + ((TextView)findViewById(R.id.gfsub5_2_ts)).getText().toString() + "<br>";
        String gf5_3 = getResources().getString(R.string.gfsub5_3) + " " + ((TextView)findViewById(R.id.gfsub5_3_ts)).getText().toString() + "<br>";
        String gf5_4 = getResources().getString(R.string.gfsub5_4) + " " + ((TextView)findViewById(R.id.gfsub5_4_ts)).getText().toString() + "<br>";
        String gf5 = getResources().getString(R.string.gf_subtitle5) + "<br>" + gf5_1 + gf5_2 + gf5_3 + gf5_4 + "<br>";
        String gf6_1 = getResources().getString(R.string.gfsub6_1) + " " + ((TextView)findViewById(R.id.gfsub6_1_ts)).getText().toString() + "<br>";
        String gf6_2 = getResources().getString(R.string.gfsub6_2) + " " + ((TextView)findViewById(R.id.gfsub6_2_ts)).getText().toString() + "<br>";
        String gf6 = getResources().getString(R.string.gf_subtitle6) + "<br>" + gf6_1 + gf6_2 + "<br>";
        String gf7_1 = getResources().getString(R.string.gfsub7_1) + " " + ((TextView)findViewById(R.id.gfsub7_1_ts)).getText().toString() + "<br>";
        String gf7_2 = getResources().getString(R.string.gfsub7_2) + " " + ((TextView)findViewById(R.id.gfsub7_2_ts)).getText().toString() + "<br>";
        String gf7_3 = getResources().getString(R.string.gfsub7_3) + " " + ((TextView)findViewById(R.id.gfsub7_3_ts)).getText().toString() + "<br>";
        String gf7_4 = getResources().getString(R.string.gfsub7_4) + " " + ((TextView)findViewById(R.id.gfsub7_4_ts)).getText().toString() + "<br>";
        String gf7 = getResources().getString(R.string.gf_subtitle7) + "<br>" + gf7_1 + gf7_2 + gf7_3 + gf7_4 + "<br>";
        String gf8_1 = getResources().getString(R.string.gfsub8_1) + " " + ((TextView)findViewById(R.id.gfsub8_1_ts)).getText().toString() + "<br>";
        String gf8_2 = getResources().getString(R.string.gfsub8_2) + " " + ((TextView)findViewById(R.id.gfsub8_2_ts)).getText().toString() + "<br>";
        String gf8_3 = getResources().getString(R.string.gfsub8_3) + " " + ((TextView)findViewById(R.id.gfsub8_3_ts)).getText().toString() + "<br>";
        String gf8_4 = getResources().getString(R.string.gfsub8_4) + " " + ((TextView)findViewById(R.id.gfsub8_4_ts)).getText().toString() + "<br>";
        String gf8 = getResources().getString(R.string.gf_subtitle8) + "<br>" + gf8_1 + gf8_2 + gf8_3 + gf8_4 + "<br>";
        String gf9_1 = getResources().getString(R.string.gfsub9_1) + " " + ((TextView)findViewById(R.id.gfsub9_1_ts)).getText().toString() + "<br>";
        String gf9_2 = getResources().getString(R.string.gfsub9_2) + " " + ((TextView)findViewById(R.id.gfsub9_2_ts)).getText().toString() + "<br>";
        String gf9_3 = getResources().getString(R.string.gfsub9_3) + " " + ((TextView)findViewById(R.id.gfsub9_3_ts)).getText().toString() + "<br>";
        String gf9_4 = getResources().getString(R.string.gfsub9_4) + " " + ((TextView)findViewById(R.id.gfsub9_4_ts)).getText().toString() + "<br>";
        String gf9 = getResources().getString(R.string.gf_subtitle9) + "<br>" + gf9_1 + gf9_2 + gf9_3 + gf9_4 + "<br>";
        String gf10_1 = getResources().getString(R.string.gfsub10_1) + " " + ((TextView)findViewById(R.id.gfsub10_1_ts)).getText().toString() + "<br>";
        String gf10_2 = getResources().getString(R.string.gfsub10_2) + " " + ((TextView)findViewById(R.id.gfsub10_2_ts)).getText().toString() + "<br>";
        String gf10_3 = getResources().getString(R.string.gfsub10_3) + " " + ((TextView)findViewById(R.id.gfsub10_3_ts)).getText().toString() + "<br>";
        String gf10_4 = getResources().getString(R.string.gfsub10_4) + " " + ((TextView)findViewById(R.id.gfsub10_4_ts)).getText().toString() + "<br>";
        String gf10_5 = getResources().getString(R.string.gfsub10_5) + " " + ((TextView)findViewById(R.id.gfsub10_5_ts)).getText().toString() + "<br>";
        String gf10_6 = getResources().getString(R.string.gfsub10_6) + " " + ((TextView)findViewById(R.id.gfsub10_6_ts)).getText().toString() + "<br>";
        String gf10 = getResources().getString(R.string.gf_subtitle10) + "<br>" + gf10_1 + gf10_2 + gf10_3 + gf10_4 + gf10_5 + gf10_6 + "<br>";
        String gf_comments = "Comments: <i>" + ((TextView)findViewById(R.id.comments_gf)).getText().toString() + "</i>";
        String gf = "<b>" + getResources().getString(R.string.gf_title) + "</b><br><br>" + gf1 + gf2 + gf3 + gf4 + gf5 + gf6 + gf7 + gf8 + gf9 + gf10 + gf_comments + "<br><br>";

        String bf_1 = getResources().getString(R.string.bf_1) + " " + ((TextView)findViewById(R.id.bf_1_ts)).getText().toString() + "<br>";
        String bf_2 = getResources().getString(R.string.bf_2) + " " + ((TextView)findViewById(R.id.bf_2_ts)).getText().toString() + "<br>";
        String bf_3 = getResources().getString(R.string.bf_3) + " " + ((TextView)findViewById(R.id.bf_3_ts)).getText().toString() + "<br>";
        String bf_4 = getResources().getString(R.string.bf_4) + " " + ((TextView)findViewById(R.id.bf_4_ts)).getText().toString() + "<br>";
        String bf_5 = getResources().getString(R.string.bf_5) + " " + ((TextView)findViewById(R.id.bf_5_ts)).getText().toString() + "<br>";
        String bf_6 = getResources().getString(R.string.bf_6) + " " + ((TextView)findViewById(R.id.bf_6_ts)).getText().toString() + "<br>";
        String bf_7 = getResources().getString(R.string.bf_7) + " " + ((TextView)findViewById(R.id.bf_7_ts)).getText().toString() + "<br>";
        String bf_8 = getResources().getString(R.string.bf_8) + " " + ((TextView)findViewById(R.id.bf_8_ts)).getText().toString() + "<br>";
        String bf_9 = getResources().getString(R.string.bf_9) + " " + ((TextView)findViewById(R.id.bf_9_ts)).getText().toString() + "<br>";
        String bf_10 = getResources().getString(R.string.bf_10) + " " + ((TextView)findViewById(R.id.bf_10_ts)).getText().toString() + "<br>";
        String bf_comments = "Comments: <i>" + ((TextView)findViewById(R.id.comments_bf)).getText().toString() + "</i>";
        String bf = "<b>" + getResources().getString(R.string.bf_title) + "</b><br><br>" + bf_1 + bf_2 + bf_3 + bf_4 + bf_5 + bf_6 + bf_7 + bf_8 + bf_9 + bf_10 + "<br>" + bf_comments + "<br><br>";

        String greeting = getResources().getString(R.string.greeting) + "<br><br>";
        String intro = getResources().getString(R.string.intro) + "<br><br>";
        String outro = "Regards, <br><br>" +  ((EditText)findViewById(R.id.checked_by)).getText().toString();

        final String emailBody = greeting + intro + sf + ff + gf + bf + outro;
        Util variable = new Util();
        String currentDate = variable.getCurrentDate();
        String[] TO = {((EditText)findViewById(R.id.emailBox)).getText().toString()};
        String[] CC = {};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setType("text/html");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Closing Checklist " + currentDate);
        emailIntent.putExtra(Intent.EXTRA_TEXT, emailBody);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);

        try {
            startActivity(Intent.createChooser(emailIntent, "Select email client..."));
            finish();
            Log.i("Email sent!", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if ( v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int)event.getRawX(), (int)event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = null;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
                        imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.CUPCAKE) {
                        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    }
                }
            }
        }
        return super.dispatchTouchEvent( event );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

