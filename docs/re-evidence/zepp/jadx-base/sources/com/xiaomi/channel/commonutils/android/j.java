package com.xiaomi.channel.commonutils.android;

/* JADX INFO: loaded from: classes18.dex */
public class j {
    public static String a(String str, String str2) {
        try {
            return (String) k.a(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
