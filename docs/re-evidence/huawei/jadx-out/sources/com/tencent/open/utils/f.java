package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;

/* JADX INFO: loaded from: classes20.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31103b;

    private f() {
        this.f31102a = "";
        this.f31103b = "";
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static f f31104a = new f();
    }

    public static f a() {
        return a.f31104a;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f31103b;
        if (str == null || str.trim().isEmpty()) {
            this.f31103b = sharedPreferences.getString("build_model", "");
            SLog.i("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f31103b);
        }
        String str2 = this.f31102a;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f31102a = sharedPreferences.getString("build_device", "");
            SLog.i("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f31102a);
        }
    }

    public String b(Context context) {
        return this.f31102a;
    }

    public String c(Context context) {
        return this.f31103b;
    }

    public String b() {
        return this.f31103b;
    }

    public void a(Context context, String str) {
        SLog.i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f31103b = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f31103b;
        if (str2 != null && str2.equals(str)) {
            SLog.i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f31103b = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f31103b).commit();
            SLog.i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }
}
