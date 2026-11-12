package zb0;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f203518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences.Editor f203519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g1 f203520c;

    public static g1 a(Context context) {
        if (f203518a == null) {
            f203518a = context.getSharedPreferences("com.garmin.android.apps.connectmobile.devices.MapLastLocationPrefs", 0);
        }
        if (f203519b == null) {
            f203519b = f203518a.edit();
        }
        if (f203520c == null) {
            f203520c = new g1();
        }
        return f203520c;
    }

    public static String b(long j8, String str) {
        return v.h.u(j8, "com.garmin.android.apps.connectmobile.devices.MapLastLocationPrefs_", "_", str);
    }

    public static b0 c(long j8) {
        return new b0(j8, f203518a.getString(b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_LATITUDE"), "0"), f203518a.getString(b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_LONGITUDE"), "0"), f203518a.getLong(b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_TIME_STAMP"), 0L));
    }

    public static void d(b0 b0Var) {
        long j8 = b0Var.f203430a;
        f203519b.putString(b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_LATITUDE"), b0Var.f203431b);
        f203519b.putString(b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_LONGITUDE"), b0Var.f203432c);
        f203519b.putLong(b(j8, "com.garmin.android.apps.connectmobile.devices.KEY_TIME_STAMP"), b0Var.f203433d);
        f203519b.apply();
    }
}
