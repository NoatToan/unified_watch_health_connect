package com.huawei.hms.mlkit.common.ha;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.huawei.hms.network.embedded.r3;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14321a = 0;

    public static String a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("get", String.class);
            return "HONOR".equals(Build.BRAND) ? (String) declaredMethod.invoke(cls, "ro.build.version.magic") : (String) declaredMethod.invoke(cls, "ro.build.version.emui");
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException | Exception unused2) {
            return "";
        }
    }

    public static String a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            int i = b.f14320a;
            if (!TextUtils.isEmpty("can not get android.permission.ACCESS_NETWORK_STATE.")) {
                Log.w("c", b.a("can not get android.permission.ACCESS_NETWORK_STATE."));
            }
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
        return "mobile network";
    }

    public static LinkedHashMap<String, String> a(HianalyticsLog hianalyticsLog) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("package", hianalyticsLog.f14311a);
        linkedHashMap.put("appid", hianalyticsLog.f14312b);
        linkedHashMap.put("version", hianalyticsLog.f14313c);
        linkedHashMap.put("service", hianalyticsLog.d);
        linkedHashMap.put("apiName", hianalyticsLog.e);
        linkedHashMap.put("result", null);
        linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, hianalyticsLog.f);
        linkedHashMap.put("callTime", hianalyticsLog.g);
        linkedHashMap.put("transId", hianalyticsLog.h);
        linkedHashMap.put("operator", hianalyticsLog.i);
        linkedHashMap.put(r3.y, hianalyticsLog.j);
        linkedHashMap.put("apkVersion", hianalyticsLog.l);
        linkedHashMap.put("appName", hianalyticsLog.m);
        linkedHashMap.put("countryCode", hianalyticsLog.n);
        linkedHashMap.put("deviceType", hianalyticsLog.o);
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, hianalyticsLog.p);
        linkedHashMap.put("androidVersion", hianalyticsLog.q);
        linkedHashMap.put("moduleName", hianalyticsLog.r);
        linkedHashMap.put("moduleVersion", hianalyticsLog.s);
        linkedHashMap.put("deviceCategory", hianalyticsLog.t);
        return linkedHashMap;
    }

    public static a a(Context context, Bundle bundle) {
        if (bundle == null) {
            return new a();
        }
        String string = bundle.getString("packageName");
        if (string == null || string.equals("")) {
            int i = b.f14320a;
            if (!TextUtils.isEmpty("packageName from bundle is null.")) {
                Log.w("c", b.a("packageName from bundle is null."));
            }
            string = context.getPackageName();
        }
        String str = string;
        String string2 = bundle.getString("appid");
        String string3 = bundle.getString("com.huawei.hms.client.service.name:ml-computer-vision");
        String string4 = bundle.getString("appName");
        boolean z = bundle.getBoolean("openHa");
        String string5 = bundle.getString("countryCode");
        Boolean.valueOf(z).getClass();
        return new a(str, string2, string3, string4, z, string5);
    }
}
