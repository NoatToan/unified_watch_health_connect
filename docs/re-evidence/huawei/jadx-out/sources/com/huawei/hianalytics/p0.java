package com.huawei.hianalytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hms.hihealth.data.DeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    public static String a(Context context, String str, String str2) {
        String string;
        Bundle bundle;
        Object obj;
        x xVarA = g1.a(str, str2);
        if (!TextUtils.isEmpty(xVarA != null ? xVarA.d : "")) {
            x xVarA2 = g1.a(str, str2);
            return xVarA2 != null ? xVarA2.d : "";
        }
        l0 l0VarA = k.b().a();
        if (TextUtils.isEmpty(l0VarA.n)) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("CHANNEL")) == null) {
                    string = DeviceInfo.STR_TYPE_UNKNOWN;
                } else {
                    string = obj.toString();
                    if (string.length() > 256) {
                        string = DeviceInfo.STR_TYPE_UNKNOWN;
                    }
                }
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                HiLog.e("DeviceIdUtils", "get channel error");
            }
            l0VarA.n = v1.a(256, "channel", string) ? string : "";
        }
        return l0VarA.n;
    }

    public static String a(String str, String str2) {
        x xVarA = g1.a(str, str2);
        if (!(xVarA != null ? xVarA.k : false)) {
            return "";
        }
        x xVarA2 = g1.a(str, str2);
        String strA = xVarA2 != null ? xVarA2.f11723a : "";
        if (TextUtils.isEmpty(strA)) {
            strA = c2.a("global_v2", str);
            if (!TextUtils.isEmpty(strA)) {
                if (strA.length() > 32) {
                    String strDecrypt = AesGcmKsWrapper.decrypt("HiAnalytics_Sdk_Uuid_Sp_Key", strA);
                    if (!TextUtils.isEmpty(strDecrypt)) {
                        c2.a("global_v2", str, strDecrypt);
                        strA = strDecrypt;
                    }
                }
                x xVarA3 = g1.a(str, str2);
                if (xVarA3 != null) {
                    xVarA3.f11723a = strA;
                }
            }
        }
        return TextUtils.isEmpty(strA) ? s.c(EnvUtils.getAppContext()) : strA;
    }
}
