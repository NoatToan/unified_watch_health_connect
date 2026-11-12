package com.google.androidbrowserhelper.trusted;

import a7.b;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public class Utils {
    private static void addSystemUiVisibilityFlag(Activity activity, int i14) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        rootView.setSystemUiVisibility(i14 | rootView.getSystemUiVisibility());
    }

    public static Bitmap convertDrawableToBitmap(Context context, int i14) {
        Drawable drawable = b.getDrawable(context, i14);
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static float luminanceOfColorComponent(float f14) {
        float f15 = f14 / 255.0f;
        return f15 < 0.03928f ? f15 / 12.92f : (float) Math.pow((f15 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static void setNavigationBarColor(Activity activity, int i14) {
        activity.getWindow().setNavigationBarColor(i14);
        if (shouldUseDarkIconsOnBackground(i14)) {
            addSystemUiVisibilityFlag(activity, 16);
        }
    }

    public static void setStatusBarColor(Activity activity, int i14) {
        activity.getWindow().setStatusBarColor(i14);
        if (shouldUseDarkIconsOnBackground(i14)) {
            addSystemUiVisibilityFlag(activity, 8192);
        }
    }

    private static boolean shouldUseDarkIconsOnBackground(int i14) {
        return Math.abs(1.05f / (((luminanceOfColorComponent((float) Color.blue(i14)) * 0.0722f) + ((luminanceOfColorComponent((float) Color.green(i14)) * 0.7152f) + (luminanceOfColorComponent((float) Color.red(i14)) * 0.2126f))) + 0.05f)) < 3.0f;
    }
}
