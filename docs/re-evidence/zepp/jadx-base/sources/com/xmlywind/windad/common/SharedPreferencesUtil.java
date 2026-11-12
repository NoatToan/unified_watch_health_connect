package com.xmlywind.windad.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.xmlywind.sdk.common.utils.m;

/* JADX INFO: loaded from: classes22.dex */
public final class SharedPreferencesUtil {
    public static final String DEFAULT_PREFERENCE_NAME = "WindAdSettings";

    private SharedPreferencesUtil() {
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        m.a.a(context);
        return context.getSharedPreferences(DEFAULT_PREFERENCE_NAME, 0);
    }

    public static SharedPreferences getSharedPreferences(Context context, String str) {
        m.a.a(context);
        m.a.a(str);
        return context.getSharedPreferences(str, 0);
    }
}
