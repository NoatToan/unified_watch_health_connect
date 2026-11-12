package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class ghh {
    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }
}
