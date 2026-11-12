package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lsx {
    public static void c(Intent intent, Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("SecurityUtils", "startActivitySecurity can not get packageManager");
            return;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            LogUtil.j("SecurityUtils", "startActivitySecurity can not find activity");
        } else {
            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
            context.startActivity(intent);
        }
    }
}
