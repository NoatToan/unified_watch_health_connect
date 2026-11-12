package kd2;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    @SuppressLint({"NewApi"})
    public static final String a(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        return String.valueOf(applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).getLongVersionCode());
    }
}
