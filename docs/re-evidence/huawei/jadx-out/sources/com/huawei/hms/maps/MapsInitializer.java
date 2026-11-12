package com.huawei.hms.maps;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.utils.MapClientUtil;
import com.huawei.hms.maps.utils.MapsAdvUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class MapsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f14143a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f14144b;

    public static void initialize(Context context) {
        synchronized (MapsInitializer.class) {
            BitmapDescriptorFactory.setContext(context);
            if (context != null) {
                if (f14143a) {
                    return;
                }
                mac.a(context, f14144b);
                f14143a = true;
            }
        }
    }

    public static void initialize(Context context, String str) {
        synchronized (MapsInitializer.class) {
            f14144b = str;
            initialize(context);
        }
    }

    public static void setGrsCountryCode(String str) {
        synchronized (MapsInitializer.class) {
            if (MapClientUtil.validCountryCodeWithoutRegions(str)) {
                f14144b = str;
                MapClientIdentify.setCountryCode(str);
            }
        }
    }

    public static void setAppId(String str) {
        MapClientIdentify.setAppId(str);
    }

    public static void setApiKey(String str) {
        MapClientIdentify.setApiKey(str);
    }

    public static void setAccessToken(String str) {
        MapsAdvUtil.setAccessToken(str);
    }

    protected static boolean a() {
        return f14143a;
    }
}
