package com.careforeyou.library.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public class PrefsUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences.Editor f4043c;
    private SharedPreferences e;

    public PrefsUtil(Context context) {
        this.e = null;
        this.f4043c = null;
        SharedPreferences sharedPreferences = context.getSharedPreferences("chipsea", 0);
        this.e = sharedPreferences;
        this.f4043c = sharedPreferences.edit();
    }
}
