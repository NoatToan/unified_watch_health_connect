package com.huawei.wear.oversea.util;

import defpackage.xnd;

/* JADX INFO: loaded from: classes20.dex */
public abstract class PropertyUtil {
    private static final String TAG = "PropertyUtil";

    public static String getProp(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (IllegalAccessException unused) {
            xnd.d(TAG, "IllegalAccessException can not get language and region:IllegalAccessException", false);
            return "";
        } catch (Exception unused2) {
            xnd.d(TAG, "can not get language and region Exception", false);
            return "";
        }
    }
}
