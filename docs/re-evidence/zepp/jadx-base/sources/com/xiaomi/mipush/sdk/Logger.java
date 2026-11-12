package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.aq;
import com.xiaomi.push.ar;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class Logger {
    private static boolean a = false;
    private static LoggerInterface b;

    private static boolean a(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void disablePushFileLog(Context context) {
        a = true;
        setPushLog(context);
    }

    public static void enablePushFileLog(Context context) {
        a = false;
        setPushLog(context);
    }

    @Deprecated
    public static File getLogFile(String str) {
        return null;
    }

    public static LoggerInterface getUserLogger() {
        return b;
    }

    public static void setLogger(Context context, LoggerInterface loggerInterface) {
        b = loggerInterface;
        setPushLog(context);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v1 boolean) = (r2v0 boolean), (r2v6 boolean) binds: [B:7:0x000b, B:10:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    public static void setPushLog(Context context) {
        boolean z;
        boolean z2 = false;
        boolean z3 = b != null;
        if (!a) {
            z2 = z3;
            z = a(context);
        }
        com.xiaomi.channel.commonutils.logger.b.a(new aq(z2 ? b : null, z ? ar.a(context) : null));
    }

    @Deprecated
    public static void uploadLogFile(Context context, boolean z) {
    }
}
