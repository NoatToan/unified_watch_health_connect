package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import com.huawei.openalliance.ad.constant.OsType;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cpp {
    private cpp() {
    }

    public static boolean e(Context context, String[] strArr) {
        for (String str : strArr) {
            if (!b(context, str)) {
                ReleaseLogUtil.c("R_PermissionUtil", "isHasPermissions permissions are not granted: ", str);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    private static boolean b(Context context, String str) {
        boolean z;
        synchronized (cpp.class) {
            if (context == null) {
                z = false;
            } else if (ActivityCompat.checkSelfPermission(context, str) == 0 || !c(context, str)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private static boolean c(Context context, String str) {
        PermissionInfo permissionInfo;
        try {
            permissionInfo = context.getPackageManager().getPermissionInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("PermissionUtil", "cannot found permission: ", str);
            permissionInfo = null;
        }
        if (permissionInfo == null) {
            return false;
        }
        LogUtil.b("PermissionUtil", "hwext res: ", Boolean.valueOf(OsType.ANDROID.equals(permissionInfo.packageName)), " android res: ", Boolean.valueOf("androidhwext".equals(permissionInfo.packageName)));
        return OsType.ANDROID.equals(permissionInfo.packageName) || "androidhwext".equals(permissionInfo.packageName);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
