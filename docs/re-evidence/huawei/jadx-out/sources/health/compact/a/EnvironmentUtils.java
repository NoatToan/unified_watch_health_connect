package health.compact.a;

import android.os.Process;
import com.huawei.haf.application.BaseApplication;

/* JADX INFO: loaded from: classes.dex */
public class EnvironmentUtils {
    private EnvironmentUtils() {
    }

    public static boolean d() {
        return ProcessUtil.b();
    }

    public static boolean b() {
        return c().endsWith(":DaemonService");
    }

    public static boolean e() {
        return c().endsWith(":PhoneService");
    }

    public static String c() {
        return ProcessUtil.c();
    }

    public static String a() {
        return BaseApplication.i();
    }

    static String b(int i) {
        return i == Process.myPid() ? ProcessUtil.c() : ProcessUtil.c(i);
    }
}
