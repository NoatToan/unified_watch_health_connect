package defpackage;

import android.util.Log;
import com.huawei.operation.utils.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ocq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Boolean f44154c = false;

    public static int a(String str, String str2) {
        return a(str, str2, false);
    }

    public static int a(String str, String str2, boolean z) {
        return Log.d("HwMultiSIM", c(str, str2, z));
    }

    public static int d(String str, String str2) {
        if (f44154c.booleanValue()) {
            return e(str, str2);
        }
        return 0;
    }

    public static int e(String str, String str2) {
        return d(str, str2, false);
    }

    public static int c(String str, String str2, String str3) {
        if (f44154c.booleanValue()) {
            return e(str, str2 + str3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str3 != null ? Integer.valueOf(str3.length()) : Constants.NULL);
        return e(str, sb.toString());
    }

    public static int b(String str, String str2) {
        return d(str, str2);
    }

    public static int d(String str, String str2, boolean z) {
        return Log.i("HwMultiSIM", c(str, str2, z));
    }

    public static int h(String str, String str2) {
        return b(str, str2, false);
    }

    public static int b(String str, String str2, boolean z) {
        return Log.w("HwMultiSIM", c(str, str2, z));
    }

    public static int c(String str, String str2) {
        return e(str, str2, false);
    }

    public static int a(String str, String str2, Exception exc) {
        if (f44154c.booleanValue()) {
            return c(str, str2 + Arrays.toString(exc.getStackTrace()));
        }
        return c(str, str2 + exc.getMessage());
    }

    public static int e(String str, String str2, boolean z) {
        return Log.e("HwMultiSIM", c(str, str2, z));
    }

    private static String c(String str, String str2, boolean z) {
        String str3;
        if (!z) {
            str3 = "";
        } else {
            str3 = c() + "->";
        }
        return str + "->" + str3 + str2;
    }

    private static String c() {
        return "thread id = " + Thread.currentThread().getId();
    }

    public static int b(String str, String str2, Object... objArr) {
        return Log.i("HwMultiSIM", c(str, String.format(str2, objArr), false));
    }

    public static int c(String str, String str2, Object... objArr) {
        return Log.w("HwMultiSIM", c(str, String.format(str2, objArr), false));
    }

    public static int a(String str, String str2, Object... objArr) {
        return Log.e("HwMultiSIM", c(str, String.format(str2, objArr), false));
    }
}
