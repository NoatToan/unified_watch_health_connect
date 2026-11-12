package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class rdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f47179a = new Object();
    private static rdi d;

    private rdi() {
    }

    public static rdi c() {
        rdi rdiVar;
        LogUtil.a("WearOsConnectionInteractors", "getInstance");
        synchronized (f47179a) {
            LogUtil.a("WearOsConnectionInteractors", "getInstance() LOCK");
            if (d == null) {
                d = new rdi();
            }
            LogUtil.a("WearOsConnectionInteractors", "getInstance");
            rdiVar = d;
        }
        return rdiVar;
    }

    public String b() {
        PackageInfo packageInfo;
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app.cn", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.a("WearOsConnectionInteractors", "com.google.android.wearable.app.cn not installed");
            try {
                packageInfo = packageManager.getPackageInfo("com.google.android.wearable.app", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                LogUtil.a("WearOsConnectionInteractors", "com.google.android.wearable.app not installed");
                packageInfo = null;
            }
        }
        return packageInfo == null ? "" : packageInfo.packageName;
    }
}
