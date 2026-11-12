package defpackage;

import com.xiaomi.mimotion.MimotionUtils;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class evf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f17101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f17102b;
    public static evf c;
    public static boolean d;

    static {
        boolean z = Boolean.parseBoolean(SystemProperties.get("ro.display.mimotion", "false"));
        f17101a = z;
        if (z) {
            f17102b = Boolean.parseBoolean(SystemProperties.get("persist.mimotion.debug", "false"));
            a();
        }
    }

    public static void a() {
        if (abk.c("com.xiaomi.mimotion.MimotionUtils") == null) {
            return;
        }
        d = true;
    }

    public static evf b() {
        if (c == null) {
            c = new evf();
        }
        return c;
    }

    public static boolean d() {
        return f17101a;
    }

    public boolean c() {
        if (!d) {
            return false;
        }
        boolean zIsEnabled = MimotionUtils.isEnabled();
        if (f17102b) {
            StringBuilder sb = new StringBuilder();
            sb.append("MimotionHelper isEnabled: ");
            sb.append(zIsEnabled);
        }
        return zIsEnabled;
    }

    public boolean e(Object obj, int i) {
        if (!d) {
            return false;
        }
        if (f17102b) {
            StringBuilder sb = new StringBuilder();
            sb.append("setPreferredRefreshRate: ");
            sb.append(i);
        }
        return MimotionUtils.setPreferredRefreshRate(obj, i);
    }
}
