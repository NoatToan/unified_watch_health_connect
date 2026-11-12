package defpackage;

import android.os.Build;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class b63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3842a = SystemProperties.get("ro.product.mod_device", "").contains("_global");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f3843b = b();
    public static final boolean c = a();
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    public static final boolean h;
    public static final boolean i;

    static {
        i = SystemProperties.getInt("ro.debuggable", 0) == 1;
        if (Build.VERSION.SDK_INT > 33) {
            int i2 = SystemProperties.getInt("persist.sys.multi_display_type", 1);
            if (i2 > 1) {
                int i3 = i2 & 15;
                g = i3 == 2;
                e = i3 == 3;
                f = i3 == 4;
                h = i3 == 5;
            } else {
                int i4 = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0);
                g = i4 == 1;
                e = i4 == 2;
                f = false;
                h = false;
            }
        } else {
            int i5 = SystemProperties.getInt("persist.sys.muiltdisplay_type", 0);
            g = i5 == 1;
            e = i5 == 2;
            f = false;
            h = false;
        }
        d = e || h || f;
    }

    public static boolean a() {
        return SystemProperties.get("ro.build.characteristics").contains("automotive");
    }

    public static boolean b() {
        return SystemProperties.get("ro.build.characteristics").contains("tablet");
    }
}
