package com.huawei.openalliance.ad.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.SystemProperties;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.tv;
import com.huawei.openalliance.ad.tw;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class aq {
    private static boolean a(int i) {
        return (i & 1048576) != 0;
    }

    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            boolean zA = a(new tw().a(k.d(context.getApplicationContext(), str), context));
            hw.b("HarmonyUtils", "isHarmonyApp: %s", Boolean.valueOf(zA));
            return zA;
        } catch (Throwable unused) {
            hw.c("HarmonyUtils", "isHarmonyApp exception");
            return false;
        }
    }

    public static Integer b(Context context) {
        String strA = dk.a(SystemProperties.HW_SC_BUILD_OS_API_VERSION);
        if (hw.a()) {
            hw.a("HarmonyUtils", "hmSdkInt: %s", strA);
        }
        return dg.j(strA);
    }

    public static boolean a(Context context, String str, String str2) {
        try {
            new tv().a(context, str, str2);
            return true;
        } catch (Throwable unused) {
            hw.c("HarmonyUtils", "handle harmony intent url fail");
            return false;
        }
    }

    public static boolean a(Context context, String str, ContentRecord contentRecord) {
        boolean zA;
        hw.b("HarmonyUtils", "open harmony app main page");
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        aVar.c(str).a(contentRecord, context);
        boolean z = false;
        try {
            zA = k.a(context, str, aVar.a());
        } catch (Throwable unused) {
            hw.c("HarmonyUtils", "open app main page fail");
            zA = false;
        }
        if (zA) {
            return true;
        }
        try {
            tv tvVar = new tv();
            List<Intent> listA = tvVar.a(str);
            if (!bm.a(listA)) {
                Intent intent = listA.get(0);
                intent.addFlags(268435456);
                tvVar.a(context, intent);
                z = true;
            }
            return z;
        } catch (Throwable unused2) {
            hw.c("HarmonyUtils", "open harmony app main page fail");
            return zA;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            return k.a(context.getApplicationContext(), str) || !bm.a(new tv().a(str));
        } catch (Throwable unused) {
            hw.c("HarmonyUtils", "check app installed fail");
            return false;
        }
    }

    public static boolean a(Context context, AppInfo appInfo, String str, ContentRecord contentRecord) {
        hw.b("HarmonyUtils", "openHarmonyApp intent");
        boolean z = false;
        if (appInfo == null) {
            return false;
        }
        if (!TextUtils.isEmpty(appInfo.A())) {
            try {
                String strA = appInfo.A();
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(str, strA));
                intent.addFlags(268435456);
                new tv().a(context, intent);
                z = true;
            } catch (Throwable unused) {
                hw.c("HarmonyUtils", "handle harmony intent url fail");
            }
        }
        if (z || TextUtils.isEmpty(appInfo.getIntentUri())) {
            return z;
        }
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        aVar.a(appInfo).a(contentRecord, context).c(str);
        return k.a(context, str, appInfo.getIntentUri(), aVar.a());
    }

    public static boolean a(Context context) {
        String strA = dk.a(SystemProperties.HW_SC_BUILD_OS_ENABLE);
        if (hw.a()) {
            hw.a("HarmonyUtils", "hmftype: %s", strA);
        }
        return Boolean.parseBoolean(strA);
    }

    public static String a() {
        return "harmonyos,android";
    }
}
