package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class ep5 {
    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && "MANUAL".equalsIgnoreCase(str);
    }

    public static boolean b(String str) {
        return "MANUAL".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "MI_HEALTH".equalsIgnoreCase(str);
    }

    public static boolean d(String str) {
        return "PHONE".equalsIgnoreCase(str);
    }
}
