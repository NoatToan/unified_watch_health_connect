package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.service.mi.common.util.a;

/* JADX INFO: loaded from: classes6.dex */
public final class li1 {
    public static String a() {
        try {
            return a.a().getPackageManager().getPackageInfo(a.a().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            fpe.f("get ClientVersionName failure:" + e.getMessage());
            return null;
        }
    }

    public static long b() {
        try {
            PackageInfo packageInfo = a.a().getPackageManager().getPackageInfo(a.a().getPackageName(), 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            fpe.f("get VersionCode failure:" + e.getMessage());
            return 0L;
        }
    }
}
