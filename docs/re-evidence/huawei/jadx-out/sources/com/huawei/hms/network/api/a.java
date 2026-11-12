package com.huawei.hms.network.api;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.PackageManagerCompat;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hms.framework.common.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f14468a = "DynamicLoadPermit";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14469b = "networkkit_";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f14470c = "dynamic_load";
    private static final String d = "networkkit_dynamic_load";
    private static final String e = "share_pre_config";
    private static final String f = "disable";

    private static boolean c(Context context) {
        String string = new PLSharedPreferences(context, "share_pre_config").getString("dynamic_load");
        Logger.d(f14468a, "dynamic load sp:" + string);
        return !f.equalsIgnoreCase(string);
    }

    private static boolean b(Context context) {
        String metaDataFromApp = PackageManagerCompat.getMetaDataFromApp(context, d, "");
        Logger.d(f14468a, "meta-data networkkit_dynamic_load:" + metaDataFromApp);
        return !f.equalsIgnoreCase(metaDataFromApp);
    }

    public static boolean a(Context context) {
        try {
            boolean zCheckCompatible = ReflectionUtils.checkCompatible("com.huawei.hms.network.AdvanceNetworkKitProvider");
            boolean zB = b(context);
            if (!zCheckCompatible || zB) {
                boolean zC = c(context);
                Logger.i(f14468a, "is dynamic load: " + zC + ", advance: " + zCheckCompatible);
                return zC;
            }
            Logger.i(f14468a, "is dynamic load: false, advance: true");
            return false;
        } catch (Exception e2) {
            Logger.e(f14468a, "get meta-data or sp error " + StringUtils.anonymizeMessage(e2.getMessage()));
            return true;
        }
    }
}
