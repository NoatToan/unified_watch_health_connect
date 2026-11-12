package com.huawei.hianalytics;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11591b;

    public p(String str, String str2) {
        this.f11590a = str;
        this.f11591b = str2;
    }

    public static String b(Context context) {
        l0 l0VarA = k.b().a();
        if (TextUtils.isEmpty(l0VarA.d)) {
            l0VarA.d = s.b(context);
        }
        return l0VarA.d;
    }

    public final int a() {
        y yVarA = o.a(this.f11590a, this.f11591b);
        int i = 0;
        int i2 = (yVarA == null || !yVarA.f11728c) ? 0 : 4;
        y yVarA2 = o.a(this.f11590a, this.f11591b);
        int i3 = (yVarA2 == null || !yVarA2.f11726a) ? 0 : 2;
        y yVarA3 = o.a(this.f11590a, this.f11591b);
        if (yVarA3 != null && yVarA3.f11727b) {
            i = 1;
        }
        return i2 | i3 | i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    public static String a(Context context) {
        String deviceId;
        l0 l0VarA = k.b().a();
        if (TextUtils.isEmpty(l0VarA.f11574b)) {
            if (t.a(context, "android.permission.READ_PHONE_STATE")) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        deviceId = telephonyManager.getDeviceId();
                    } else {
                        deviceId = "";
                    }
                } catch (SecurityException unused) {
                    HiLog.e("DeviceIdUtils", "no permissions");
                }
            } else {
                deviceId = "";
            }
            l0VarA.f11574b = deviceId;
        }
        return l0VarA.f11574b;
    }
}
