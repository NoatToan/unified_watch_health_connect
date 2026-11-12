package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes21.dex */
class sd {
    sd() {
    }

    boolean c(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
