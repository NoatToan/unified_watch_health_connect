package com.huawei.watchface;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HwColumnSystem f30636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f30637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f30638c;

    public static void a(Configuration configuration, String str) {
        if (f30636a == null || configuration == null) {
            HwLog.e("HwColumnSystemHelper", "updateColumnSystem the method params is null return ");
            return;
        }
        Application applicationContext = Environment.getApplicationContext();
        int iDip2px = DensityUtil.dip2px(configuration.screenWidthDp);
        int iDip2px2 = DensityUtil.dip2px(configuration.screenHeightDp);
        float f = applicationContext.getResources().getDisplayMetrics().density;
        if (f30637b == iDip2px && f30638c == iDip2px2) {
            HwLog.i("HwColumnSystemHelper", "updateColumnSystem the same params return");
            return;
        }
        HwLog.i("HwColumnSystemHelper", "updateColumnSystem ,caller = " + str + ",width =" + iDip2px + ",height = " + iDip2px2);
        f30637b = iDip2px;
        f30638c = iDip2px2;
        f30636a.d(applicationContext, iDip2px, iDip2px2, f);
    }

    public static int b() {
        HwColumnSystem hwColumnSystem = f30636a;
        if (hwColumnSystem != null) {
            return hwColumnSystem.b();
        }
        HwLog.e("HwColumnSystemHelper", "getGutter: mHwColumnSystem == null");
        return 0;
    }

    public static int c() {
        HwColumnSystem hwColumnSystem = f30636a;
        if (hwColumnSystem == null) {
            HwLog.e("HwColumnSystemHelper", "HwColumnSystemHelper, getScreenMode: hwColumnSystem = null");
            return 0;
        }
        int iJ = hwColumnSystem.j();
        if (iJ != 8) {
            return iJ != 12 ? 0 : 2;
        }
        return 1;
    }

    public static int d() {
        int iRound;
        HwLog.i("HwColumnSystemHelper", "getSingleButtonWidth: columnNum: " + a());
        int iC = c();
        HwLog.i("HwColumnSystemHelper", "getSingleButtonWidth: screenMode: " + iC);
        int iB = b();
        float fE = e();
        HwLog.i("HwColumnSystemHelper", "getSingleButtonWidth: gutter: " + iB + " colu: " + fE + " density: " + Environment.getApplicationContext().getResources().getDisplayMetrics().density);
        if (iC != 1) {
            iRound = iC != 2 ? Math.round(fE * 4.0f) + (iB * 3) : Math.round(a(8));
        } else {
            iRound = Math.round(a(6));
        }
        HwLog.i("HwColumnSystemHelper", "getSingleButtonWidth: width: " + iRound);
        return iRound;
    }

    public static float e() {
        HwColumnSystem hwColumnSystem = f30636a;
        if (hwColumnSystem != null) {
            return hwColumnSystem.f();
        }
        HwLog.e("HwColumnSystemHelper", "getGutter: mHwColumnSystem == null");
        return 0.0f;
    }

    public static void a(Context context) {
        if (f30636a != null) {
            return;
        }
        HwLog.i("HwColumnSystemHelper", "init column system");
        f30636a = new HwColumnSystem(context);
    }

    public static int a() {
        HwColumnSystem hwColumnSystem = f30636a;
        if (hwColumnSystem == null) {
            HwLog.e("HwColumnSystemHelper", "HwColumnSystemHelper, getColumnNum: hwColumnSystem = null");
            return 4;
        }
        return hwColumnSystem.j();
    }

    public static float a(int i) {
        HwColumnSystem hwColumnSystem = f30636a;
        if (hwColumnSystem == null) {
            HwLog.e("HwColumnSystemHelper", "getGutter: mHwColumnSystem == null");
            return 0.0f;
        }
        return hwColumnSystem.a(i);
    }
}
