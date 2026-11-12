package com.huami.wallet.datasource.cloud;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RequiresPermission;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
class l {
    public static <T> void a(T t, String str) {
        Objects.requireNonNull(t, str);
    }

    public static void b(String str, Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            runnable.run();
            HMLog.i(Const.Tag.BENCHAMRK, String.format(Locale.CHINA, "%s 耗时 %s", str, c(System.currentTimeMillis() - jCurrentTimeMillis)), new Object[0]);
        } catch (Throwable th) {
            HMLog.i(Const.Tag.BENCHAMRK, String.format(Locale.CHINA, "%s 耗时 %s", str, c(System.currentTimeMillis() - jCurrentTimeMillis)), new Object[0]);
            throw th;
        }
    }

    public static String c(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(j);
        long seconds = timeUnit.toSeconds(j);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long seconds2 = seconds - timeUnit2.toSeconds(minutes);
        return String.format(Locale.getDefault(), "%02d:%02d.%03d", Long.valueOf(minutes), Long.valueOf(seconds2), Long.valueOf((j - timeUnit2.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds2)));
    }

    public static String d(Method method, Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        if (objArr == null || objArr.length == 0) {
            sb.append("()");
        } else {
            sb.append("(");
            for (int i = 0; i < objArr.length; i++) {
                sb.append(objArr[i]);
                if (i < objArr.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(")");
        }
        sb.append(" ");
        return sb.toString();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean e(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }
}
