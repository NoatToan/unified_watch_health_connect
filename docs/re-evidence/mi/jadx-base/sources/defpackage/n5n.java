package defpackage;

import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes.dex */
public class n5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f27577a = true;

    public static void a(String str, String str2, Object... objArr) {
        if (f27577a) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, str, str2);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (f27577a) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, str, str2);
        }
    }
}
