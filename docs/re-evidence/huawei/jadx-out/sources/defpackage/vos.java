package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class vos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f51422a = -1;

    public static int a() {
        int i = f51422a;
        if (i > 0) {
            return i;
        }
        e();
        return f51422a;
    }

    private static void e() {
        Context context = BaseApplication.getContext();
        try {
            if (context.getPackageManager().getPackageInfo(context.getPackageName(), 0) != null) {
                f51422a = 20504000;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            f51422a = -1;
            LogUtil.j("VersionInfo", "PackageManager.NameNotFoundException");
        }
    }
}
