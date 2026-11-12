package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.HarmonyBuild;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class npr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f43424c;
    private static Method d;
    private static int e;

    private npr() {
    }

    static {
        if (HarmonyBuild.e) {
            try {
                d = Class.forName("android.util.Jlog").getDeclaredMethod("d", Integer.TYPE, String.class);
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                ReleaseLogUtil.a("R_ScenarioJlogUtil", "Exception: ", ExceptionUtils.c(e2));
            }
        }
    }

    public static void a(int i) {
        synchronized (npr.class) {
            if (d == null) {
                return;
            }
            int i2 = f43424c;
            int i3 = i2 | i;
            if (i3 == i2) {
                ReleaseLogUtil.d("R_ScenarioJlogUtil", "enterCpu nothing todo, scenarioCode: 0x", Integer.toHexString(i));
            } else {
                f43424c = i3;
                a(i3, 570);
            }
        }
    }

    public static void d(int i) {
        synchronized (npr.class) {
            if (d == null) {
                return;
            }
            int i2 = f43424c;
            int i3 = (~i) & i2;
            if (i3 == i2) {
                ReleaseLogUtil.d("R_ScenarioJlogUtil", "exitCpu nothing todo, scenarioCode: 0x", Integer.toHexString(i));
            } else {
                f43424c = i3;
                a(i3, 570);
            }
        }
    }

    public static void c(int i) {
        synchronized (npr.class) {
            if (d == null) {
                return;
            }
            int i2 = e;
            int i3 = i2 | i;
            if (i3 == i2) {
                ReleaseLogUtil.d("R_ScenarioJlogUtil", "enterMem nothing todo, scenarioCode: 0x", Integer.toHexString(i));
            } else {
                e = i3;
                a(i3, 571);
            }
        }
    }

    public static void e(int i) {
        synchronized (npr.class) {
            if (d == null) {
                return;
            }
            int i2 = e;
            int i3 = (~i) & i2;
            if (i3 == i2) {
                ReleaseLogUtil.d("R_ScenarioJlogUtil", "exitMem nothing todo, scenarioCode: 0x", Integer.toHexString(i));
            } else {
                e = i3;
                a(i3, 571);
            }
        }
    }

    private static void a(int i, int i2) {
        String str = "#P:" + ProcessUtil.c() + "#SD:" + i + "#FRT:" + System.currentTimeMillis();
        ReleaseLogUtil.d("R_ScenarioJlogUtil", "report info: ", str, ", scenarioCode: 0x", Integer.toHexString(i), ", jlogId: ", Integer.valueOf(i2));
        try {
            d.invoke(null, Integer.valueOf(i2), str);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            ReleaseLogUtil.a("R_ScenarioJlogUtil", "JlogUtil Exception: ", ExceptionUtils.c(e2));
        }
    }
}
