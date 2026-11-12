package defpackage;

import android.os.Build;
import com.huawei.android.os.SystemPropertiesEx;

/* JADX INFO: loaded from: classes4.dex */
public class chz {
    public static int b(String str, int i) {
        if (!b()) {
            try {
                return SystemPropertiesEx.getInt(str, i);
            } catch (Throwable unused) {
                return cia.c(str, i);
            }
        }
        return cia.c(str, i);
    }

    public static String c(String str, String str2) {
        if (!b()) {
            try {
                return SystemPropertiesEx.get(str, str2);
            } catch (Throwable unused) {
                return cia.c(str, str2);
            }
        }
        return cia.c(str, str2);
    }

    private static boolean b() {
        return Build.VERSION.SDK_INT < 28;
    }
}
