package com.huawei.hms.scankit.p;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16432a = "y3";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Bundle f16433b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f16434c = "";
    public static HashSet d = new HashSet();

    public static String b(Context context) {
        if (f16434c.length() == 0) {
            f16434c = context.getPackageName();
        }
        return f16434c;
    }

    public static boolean a(String str, HashSet hashSet) {
        if (str.length() == 0) {
            return true;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Bundle a(Context context) {
        if (context == null) {
            return new Bundle();
        }
        if (f16433b == null) {
            Bundle bundle = new Bundle();
            try {
                String string = AGConnectServicesConfig.fromContext(context).getString(AgConnectInfo.AgConnectKey.APPLICATION_ID);
                if (string == null) {
                    string = context.getPackageName();
                }
                bundle.putString("appid", string);
            } catch (RuntimeException unused) {
                Log.e(f16432a, "getAppInfo: RuntimeException");
            } catch (Exception unused2) {
                Log.e(f16432a, "getAppInfo: Exception");
            }
            f16433b = bundle;
        }
        return f16433b;
    }

    public static HashSet a() {
        if (d.size() == 0) {
            d.add("com.huawei.scanner");
            d.add("com.huawei.hitouch");
        }
        return d;
    }
}
