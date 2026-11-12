package defpackage;

import android.text.TextUtils;
import android.util.Log;
import health.compact.a.LogUtil;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class azq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f849b;

    public azq(String str) {
        this.f849b = str;
    }

    public void d(String str, Object... objArr) {
        e(4, str, objArr);
    }

    public void e(String str, Object... objArr) {
        e(3, str, objArr);
    }

    public void a(String str, Object... objArr) {
        e(5, str, objArr);
    }

    public void c(String str, Object... objArr) {
        e(6, str, objArr);
    }

    public void c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("Bundle_Logger", 6)) {
            LogUtil.d("Bundle_Logger", c(this.f849b, str, objArr), ", ex=", LogUtil.c(th));
        }
    }

    private void e(int i, String str, Object[] objArr) {
        if (Log.isLoggable("Bundle_Logger", i)) {
            LogUtil.b("Bundle_Logger", c(this.f849b, str, objArr));
        }
    }

    private static String c(String str, String str2, Object... objArr) {
        String str3 = str + ":" + str2;
        if (objArr == null || objArr.length <= 0) {
            return str3;
        }
        try {
            return String.format(Locale.ENGLISH, str3, objArr);
        } catch (IllegalFormatException e) {
            LogUtil.d("Bundle_Logger", "Unable to format ", str3, ", ex=", LogUtil.c(e));
            return str3 + " [" + TextUtils.join(", ", objArr) + "]";
        }
    }
}
