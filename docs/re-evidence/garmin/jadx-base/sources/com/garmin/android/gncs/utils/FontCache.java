package com.garmin.android.gncs.utils;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class FontCache {
    private static final String TAG = "FontCache";
    private static HashMap<String, Typeface> fontCache = new HashMap<>();

    public static Typeface getTypeface(String str, Context context) {
        Typeface typeface = fontCache.get(str);
        if (typeface != null) {
            return typeface;
        }
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
            fontCache.put(str, typefaceCreateFromAsset);
            return typefaceCreateFromAsset;
        } catch (Exception e4) {
            e4.getMessage();
            return null;
        }
    }
}
