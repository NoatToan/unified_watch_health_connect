package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public class npa {
    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        return packageManager.getApplicationLabel(context.getApplicationInfo()).toString();
    }
}
