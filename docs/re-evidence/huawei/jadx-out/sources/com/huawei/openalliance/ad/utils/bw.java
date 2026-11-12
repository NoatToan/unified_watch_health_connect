package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class bw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte f20520a = 1;

    public static boolean c(Context context) {
        Object objC;
        Object objA;
        bv bvVarA = com.huawei.openalliance.ad.ce.a(context).a();
        if (bvVarA instanceof bx) {
            objC = bx.c();
        } else {
            objC = by.c();
        }
        boolean zBooleanValue = (objC == null || (objA = cr.a(objC, "isMultiSimEnabled", (Class<?>[]) null, (Object[]) null)) == null || !(objA instanceof Boolean)) ? false : ((Boolean) objA).booleanValue();
        hw.b("mutiCardFactory", "isHwGeminiSupport1 %s", String.valueOf(zBooleanValue));
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        byte b2 = f20520a;
        if (b2 != 1) {
            return b2 == 3 || b2 == 4;
        }
        if (a()) {
            f20520a = (byte) 4;
            return true;
        }
        if (c(context)) {
            f20520a = (byte) 3;
            return true;
        }
        f20520a = (byte) 2;
        return false;
    }

    private static boolean a() {
        String str;
        boolean z;
        try {
            z = cr.a(Class.forName("com.mediatek.common.featureoption.FeatureOption").getDeclaredField("MTK_GEMINI_SUPPORT"), true).getBoolean(null);
        } catch (Error unused) {
            str = "MTK NoClassDefFoundError";
            hw.c("mutiCardFactory", str);
            z = false;
        } catch (Exception unused2) {
            str = "cannot find ext mtkapi";
            hw.c("mutiCardFactory", str);
            z = false;
        }
        hw.b("mutiCardFactory", "isMtkGeminiSupport %s", String.valueOf(z));
        return z;
    }

    public static bv a(Context context) {
        b(context);
        return f20520a == 4 ? new bz() : com.huawei.openalliance.ad.ce.a(context).a();
    }
}
