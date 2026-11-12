package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class lsc {
    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "setMetricUnit".equalsIgnoreCase(str);
    }
}
