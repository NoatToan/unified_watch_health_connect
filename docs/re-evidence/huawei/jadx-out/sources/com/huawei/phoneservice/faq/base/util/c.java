package com.huawei.phoneservice.faq.base.util;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.huawei.hms.android.SystemUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Pattern f21582b = Pattern.compile("\\d");
    private static int e = 0;

    public static void d(Activity activity, int[] iArr, int i) {
        int i2 = i();
        if (i2 == 0) {
            FaqHwFrameworkUtil.a(activity, new e(activity, iArr, i));
        } else if (3 == i2) {
            c(activity, iArr, i);
        }
    }

    public static String j() {
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            return "MagicUI_" + strG;
        }
        String strF = f();
        if (TextUtils.isEmpty(strF)) {
            return a();
        }
        Matcher matcher = f21582b.matcher(strF);
        return matcher.find() ? strF.substring(matcher.start()) : strF;
    }

    public static String e() {
        return Build.MODEL;
    }

    public static String c() {
        return d.d() ? "TABLET" : DeviceTypes.PHONE;
    }

    public static String d() {
        try {
            String strF = f();
            if (!TextUtils.isEmpty(strF)) {
                if (strF.contains("_")) {
                    return "EMUI" + strF.split("_")[1];
                }
                return "EMUI" + strF;
            }
        } catch (Exception e2) {
            g.c("DeviceUtils", "getEmui()  Exception..." + e2.getMessage());
        }
        return a();
    }

    public static String b() {
        return com.huawei.phoneservice.faq.base.e.a(SystemUtils.PRODUCT_BRAND);
    }

    public static String a() {
        return "Android " + Build.VERSION.RELEASE;
    }

    private static int i() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Activity activity, int[] iArr, int i) {
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(i);
        for (int i2 : iArr) {
            View viewFindViewById = activity.findViewById(i2);
            if (viewFindViewById != null) {
                viewFindViewById.setPadding(dimensionPixelSize, viewFindViewById.getPaddingTop(), dimensionPixelSize, viewFindViewById.getPaddingBottom());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(int i) {
        e = i;
    }

    private static String g() {
        return com.huawei.phoneservice.faq.base.e.a("ro.build.version.magic");
    }

    class e implements FaqHwFrameworkUtil.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f21583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f21584c;
        final /* synthetic */ int d;

        @Override // com.huawei.phoneservice.faq.base.util.FaqHwFrameworkUtil.b
        public void a(int i) {
            c.e(i);
            if (3 == i) {
                c.c(this.f21584c, this.f21583b, this.d);
            }
        }

        e(Activity activity, int[] iArr, int i) {
            this.f21584c = activity;
            this.f21583b = iArr;
            this.d = i;
        }
    }

    private static String f() {
        return com.huawei.phoneservice.faq.base.e.a("ro.build.version.emui");
    }
}
