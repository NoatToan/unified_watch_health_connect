package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import com.huawei.android.app.PackageManagerEx;

/* JADX INFO: loaded from: classes4.dex */
public class bhw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f1117c = -1;

    private static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    private static boolean e(Context context) {
        return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4;
    }

    private static boolean d(Context context) {
        return context.getPackageManager().hasSystemFeature("com.huawei.software.features.car");
    }

    private static boolean b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    private static boolean a(String str) {
        try {
            return PackageManagerEx.hasHwSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean c() {
        return a("com.huawei.software.features.kidpad");
    }

    public static int c(Context context) {
        int i;
        int i2 = f1117c;
        if (i2 >= 0) {
            return i2;
        }
        if (e(context)) {
            i = 1;
        } else if (a(context)) {
            i = 2;
        } else if (b(context)) {
            i = 3;
        } else if (c()) {
            i = 4;
        } else {
            i = d(context) ? 7 : 0;
        }
        f1117c = i;
        return i;
    }
}
