package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class xkd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53142c = 0;

    public static xkd d() {
        return b.f53143c;
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final xkd f53143c = new xkd();
    }

    public static String e() {
        PackageInfo packageInfoA = a();
        if (packageInfoA != null) {
            return packageInfoA.packageName;
        }
        return "";
    }

    public static String c() {
        return Build.MODEL;
    }

    public static PackageInfo a() {
        try {
            return btx.c().getPackageManager().getPackageInfo(btx.c().getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.c("AppManager", e.getMessage());
            return null;
        }
    }

    public static boolean b() {
        return e() != null && e().equals("com.huawei.bone");
    }

    public boolean h() {
        int i = this.f53142c;
        if (i != 0) {
            return i != 2;
        }
        if (ContextCompat.checkSelfPermission(btx.c(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.f53142c = 2;
            return false;
        }
        this.f53142c = 1;
        return true;
    }
}
