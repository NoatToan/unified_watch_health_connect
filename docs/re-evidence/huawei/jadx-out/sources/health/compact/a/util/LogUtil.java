package health.compact.a.util;

import android.util.Log;
import com.huawei.hihealth.api.LogApi;

/* JADX INFO: loaded from: classes.dex */
public class LogUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LogApi f36678b;

    private LogUtil() {
    }

    public static void b(LogApi logApi) {
        f36678b = logApi;
    }

    public static LogApi a() {
        return f36678b;
    }

    public static void e(String str, Object... objArr) {
        LogApi logApi = f36678b;
        if (logApi == null) {
            c(str, 1, objArr);
        } else {
            logApi.d(str, objArr);
        }
    }

    public static void a(String str, Object... objArr) {
        LogApi logApi = f36678b;
        if (logApi == null) {
            c(str, 2, objArr);
        } else {
            logApi.i(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        LogApi logApi = f36678b;
        if (logApi == null) {
            c(str, 3, objArr);
        } else {
            logApi.w(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        LogApi logApi = f36678b;
        if (logApi == null) {
            c(str, 4, objArr);
        } else {
            logApi.e(str, objArr);
        }
    }

    public static boolean d() {
        LogApi logApi = f36678b;
        if (logApi == null) {
            return false;
        }
        return logApi.isBeta();
    }

    private static void c(String str, int i, Object... objArr) {
        StringBuilder sb = new StringBuilder(32);
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        d(str, i, sb);
    }

    private static void d(String str, int i, StringBuilder sb) {
        if (i == 0) {
            Log.v(str, sb.toString());
            return;
        }
        if (i == 1) {
            Log.d(str, sb.toString());
            return;
        }
        if (i == 2) {
            Log.i(str, sb.toString());
        } else if (i == 3) {
            Log.w(str, sb.toString());
        } else {
            if (i != 4) {
                return;
            }
            Log.e(str, sb.toString());
        }
    }
}
