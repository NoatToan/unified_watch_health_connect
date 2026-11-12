package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.text.TextUtils;
import com.huawei.hianalytics.core.transport.Utils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yiv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f53399c;

    public static void c(Context context) {
        if (context != null) {
            f53399c = context.getApplicationContext();
        }
    }

    public static Context a() {
        return f53399c;
    }

    public static boolean e(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 255;
    }

    public static boolean c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            yit.b(Utils.TAG, "isValidSrcPkgName srcPkgName is null");
            return false;
        }
        yit.e(Utils.TAG, "client srcPkgNames:" + str);
        String[] packagesForUid = a().getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null) {
            yit.e(Utils.TAG, "calling uid srcPkgNames:" + Arrays.toString(packagesForUid));
            int length = packagesForUid.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str2 = packagesForUid[i2];
                if ("com.huawei.health".equals(str2) || str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int e() {
        return Binder.getCallingUid();
    }

    public static int d() {
        return Binder.getCallingPid();
    }

    public static Intent d(Intent intent) {
        PackageManager packageManager = a().getPackageManager();
        if (packageManager == null) {
            yit.b(Utils.TAG, "getPackageManager is null");
            return null;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() != 1) {
            yit.c(Utils.TAG, "implicitIntent List are null");
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }
}
