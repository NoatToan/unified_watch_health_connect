package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes23.dex */
public class bis {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f1131c = false;
    private static boolean e = false;

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return e;
    }

    public static boolean d() {
        return f1131c;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            z = Log.class.getField("HWLog").getBoolean(Log.class);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.e("LogConfig", "can not get HWLog");
            z = false;
        }
        try {
            z2 = Log.class.getField("HWModuleLog").getBoolean(Log.class);
        } catch (IllegalAccessException | NoSuchFieldException unused2) {
            Log.e("LogConfig", "can not get HWModuleLog");
            z2 = false;
        }
        f1131c = z || (z2 && Log.isLoggable("MarketInstallService", 3));
        try {
            if (Log.class.getField("HWINFO").getBoolean(Log.class)) {
                z3 = true;
            } else if (z2 && Log.isLoggable("MarketInstallService", 4)) {
                z3 = true;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused3) {
            Log.e("LogConfig", "can not get HWINFO");
        }
        e = z3;
    }
}
