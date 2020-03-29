package com.example.aurolib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class AuroUtil {

    public static void openMainActivity(Context context) {
        Intent myIntent = new Intent(context, AuroQuizActivity.class);
        context.startActivity(myIntent);
    }

}
