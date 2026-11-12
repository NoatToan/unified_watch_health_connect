package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class fhh {
    public static int a(Context context, String str) throws Exception {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str) || (packageInfo = context.getPackageManager().getPackageInfo(str, 0)) == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }
}
