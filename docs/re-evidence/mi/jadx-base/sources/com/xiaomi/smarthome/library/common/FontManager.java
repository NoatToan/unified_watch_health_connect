package com.xiaomi.smarthome.library.common;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FontManager {
    private static final HashMap<String, Typeface> mFontMap = new HashMap<>();

    public static void destroy() {
        mFontMap.clear();
    }

    public static Typeface getFont(Context context, String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(0);
        if (TextUtils.isEmpty(str)) {
            return typefaceDefaultFromStyle;
        }
        Typeface typefaceCreateFromAsset = mFontMap.get(str);
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (typefaceCreateFromAsset != null) {
                mFontMap.put(str, typefaceCreateFromAsset);
            }
        }
        return typefaceCreateFromAsset != null ? typefaceCreateFromAsset : typefaceDefaultFromStyle;
    }
}
