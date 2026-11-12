package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mtk {
    public static boolean e() {
        return true;
    }

    public static boolean b() {
        return b("com.huawei.hwvoipservice.PRIVACY_READ") || b("com.huawei.meetime.PRIVACY_READ");
    }

    public static boolean d() {
        return b("android.permission.READ_CONTACTS");
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29 && CommonUtil.bg();
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ContactPermissionUtils", "isPermissionGranted: permission is null or empty.");
            return false;
        }
        Context context = BaseApplication.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.checkPermission(str, context.getPackageName()) == 0;
        }
        LogUtil.j("ContactPermissionUtils", "isPermissionGranted: packageManager is null or empty.");
        return false;
    }
}
