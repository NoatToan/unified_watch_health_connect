package com.huawei.hianalytics.process;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.a0;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.j0;
import com.huawei.hianalytics.j2;
import com.huawei.hianalytics.k;
import com.huawei.hianalytics.s;
import com.huawei.hianalytics.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HiAnalyticsManager {
    public static void clearCachedData() {
        j0 j0VarA = j0.a();
        if (j0VarA.f11557b == null) {
            HiLog.sw("HADM", "sdk not init");
        } else {
            if (!j2.f11561b.a() || j0VarA.f11556a.size() <= 0) {
                return;
            }
            Iterator it = j0VarA.f11556a.values().iterator();
            while (it.hasNext()) {
                ((a0) it.next()).f11450c.clearCacheDataByTag();
            }
        }
    }

    public static String createUUID(Context context) {
        j0.a().getClass();
        if (context != null) {
            return s.c(context);
        }
        HiLog.sw("HADM", "sdk not init");
        return "";
    }

    public static void disableDefaultInstanceReport() {
        j0.a().f11556a.remove("ha_default_collection");
    }

    public static List<String> getAllTags() {
        j0 j0VarA = j0.a();
        j0VarA.getClass();
        return new ArrayList(j0VarA.f11556a.keySet());
    }

    public static boolean getInitFlag(String str) {
        j0 j0VarA = j0.a();
        if (str != null) {
            return j0VarA.f11556a.containsKey(str);
        }
        j0VarA.getClass();
        HiLog.sw("HADM", "tag can't be null");
        return false;
    }

    public static HiAnalyticsInstance getInstanceByTag(String str) {
        return j0.a().a(str);
    }

    public static boolean isDebugMode(Context context) {
        j0.a().getClass();
        if (context != null) {
            return TextUtils.equals(context.getPackageName(), System.getProperty("debug.huawei.hianalytics.app"));
        }
        HiLog.sw("HADM", "sdk not init");
        return false;
    }

    public static void setAppid(String str) {
        Context context = j0.a().f11557b;
        if (context == null) {
            HiLog.sw("HADM", "sdk not init");
            return;
        }
        String packageName = context.getPackageName();
        if (!v1.a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}")) {
            str = packageName;
        }
        k.b().a().g = str;
    }

    public static void setCacheSize(int i) {
        if (j0.a().f11557b == null) {
            HiLog.sw("HADM", "sdk not init");
            return;
        }
        int i2 = 10;
        if (i <= 10) {
            i2 = 5;
            if (i < 5) {
                HiLog.w("ParamCheckUtils", "parameter under size");
            }
            k.b().a().h = ((long) i) * 1048576;
        }
        HiLog.w("ParamCheckUtils", "parameter overlarge");
        i = i2;
        k.b().a().h = ((long) i) * 1048576;
    }

    public static void setCustomPkgName(String str) {
        if (j0.a().f11557b != null) {
            HiLog.sw("HADM", "sdk not init");
        } else if (TextUtils.isEmpty(str) || str.length() > 256) {
            HiLog.w("HADM", "customPkgName check failed");
        } else {
            k.b().a().o = str;
        }
    }
}
