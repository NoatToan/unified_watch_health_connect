package com.xiaomi.market.sdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes22.dex */
class SystemProperties {
    private static Class<?> sClazz;
    private static Method sMethodGet;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            sClazz = cls;
            sMethodGet = cls.getDeclaredMethod("get", String.class, String.class);
        } catch (Exception e) {
            Log.e(Utils.TAG, e.getMessage(), e);
        }
    }

    @NonNull
    public static String getString(String str, String str2) {
        try {
            String str3 = (String) sMethodGet.invoke(sClazz, str, str2);
            return !TextUtils.isEmpty(str3) ? str3 : str2;
        } catch (Exception e) {
            Log.e(Utils.TAG, e.getMessage(), e);
            return str2;
        }
    }
}
