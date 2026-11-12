package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes34.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16573b = "z";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f16574a;

    public void a(String str, String str2) {
        this.f16574a.edit().putString(str, str2).apply();
    }

    public String a(String str) {
        String string = this.f16574a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        Log.i(f16573b, "Get String from sp failed " + str);
        return "";
    }

    public static z a(Context context) {
        return new z(context);
    }

    private z(Context context) {
        this.f16574a = context.createDeviceProtectedStorageContext().getSharedPreferences("safetydetect.token", 0);
    }
}
