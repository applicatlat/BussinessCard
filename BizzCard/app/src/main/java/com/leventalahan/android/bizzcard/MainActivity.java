package com.leventalahan.android.bizzcard;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();

        imageView1 = (ImageView) findViewById(R.id.gallery);
        ((AnimationDrawable) imageView1.getDrawable()).start();
        Context context = getApplicationContext();
        CharSequence text = "Click on Icons for Direct Access";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();    }
        public void mapper(View view){
            Uri gmmIntentUri = Uri.parse("https://www.google.com.tr/maps/place/Alternatif+At%C3%B6lye/@40.9710178,29.0729662,13.96z/data=!4m12!1m6!3m5!1s0x0:0x688ada978aca882d!2sAlternatif+At%C3%B6lye!8m2!3d40.974404!4d29.07552!3m4!1s0x0:0x688ada978aca882d!8m2!3d40.974404!4d29.07552");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        public void phoneOne (View view){
            String phone = "+902164675618";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);
        }
    public void phoneTwo (View view){
        String phone = "+905324677773";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }
    public void phoneThree (View view){
        String phone = "+905301232415";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }
    public void webber (View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.alternatifatolye.com/"));
        startActivity(intent);
    }
    public void mailer (View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL  , new String[] { "alternatifatolye@gmail.com" });
        startActivity(Intent.createChooser(intent, "Email via..."));


    }
    }



