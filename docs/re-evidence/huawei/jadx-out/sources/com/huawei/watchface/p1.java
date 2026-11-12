package com.huawei.watchface;

import android.content.Context;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.IHiAd;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class p1 {
    public static IHiAd a(Context context) {
        try {
            return HiAd.getInstance(context.getApplicationContext());
        } catch (IllegalArgumentException e) {
            HwLog.e("HiAdHelper", "system IllegalArgumentException" + HwLog.printException((Exception) e));
            HwLog.e("HiAdHelper", "getHiAdInstance return null");
            return null;
        } catch (NoClassDefFoundError e2) {
            e = e2;
            HwLog.e("HiAdHelper", "system error,NoSuchMethodError" + HwLog.printException(e));
            HwLog.e("HiAdHelper", "getHiAdInstance return null");
            return null;
        } catch (NoSuchFieldError e3) {
            HwLog.e("HiAdHelper", "system error,NoSuchFieldError" + HwLog.printException((Error) e3));
            HwLog.e("HiAdHelper", "getHiAdInstance return null");
            return null;
        } catch (NoSuchMethodError e4) {
            e = e4;
            HwLog.e("HiAdHelper", "system error,NoSuchMethodError" + HwLog.printException(e));
            HwLog.e("HiAdHelper", "getHiAdInstance return null");
            return null;
        }
    }

    public static void b(Context context) {
        IHiAd iHiAdA = a(context);
        if (iHiAdA == null) {
            return;
        }
        iHiAdA.enableUserInfo(e4.a("HEALTHUSERINFOKEY", true));
    }

    public static void a(Context context, boolean z, int i) {
        IHiAd iHiAdA = a(context);
        if (iHiAdA == null) {
            return;
        }
        try {
            iHiAdA.initLog(z, i);
        } catch (IllegalArgumentException e) {
            HwLog.e("HiAdHelper", "system IllegalArgumentException" + HwLog.printException((Exception) e));
        } catch (NoClassDefFoundError e2) {
            e = e2;
            HwLog.e("HiAdHelper", "system error,NoSuchMethodError" + HwLog.printException(e));
        } catch (NoSuchMethodError e3) {
            e = e3;
            HwLog.e("HiAdHelper", "system error,NoSuchMethodError" + HwLog.printException(e));
        }
    }

    public static void a(Context context, String str) {
        IHiAd iHiAdA = a(context);
        if (iHiAdA == null) {
            return;
        }
        try {
            iHiAdA.initGrs(str);
        } catch (IllegalArgumentException e) {
            HwLog.e("HiAdHelper", "system IllegalArgumentException" + HwLog.printException((Exception) e));
        } catch (NoClassDefFoundError e2) {
            e = e2;
            HwLog.e("HiAdHelper", "system error,NoSuchMethodError" + HwLog.printException(e));
        } catch (NoSuchMethodError e3) {
            e = e3;
            HwLog.e("HiAdHelper", "system error,NoSuchMethodError" + HwLog.printException(e));
        }
    }

    public static void a(Context context, boolean z) {
        IHiAd iHiAdA = a(context);
        if (iHiAdA == null) {
            return;
        }
        e4.b("HEALTHUSERINFOKEY", iHiAdA.isEnableUserInfo());
        iHiAdA.enableUserInfo(z);
    }
}
