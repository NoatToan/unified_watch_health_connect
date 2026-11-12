package zb0;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f203617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences.Editor f203618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q0 f203619c;

    public static q0 a(Context context) {
        if (f203617a == null) {
            f203617a = context.getSharedPreferences("com.garmin.android.apps.connectmobile.devices.NOTIFICATION_SHARED_PREF_NAME", 0);
        }
        if (f203618b == null) {
            f203618b = f203617a.edit();
        }
        if (f203619c == null) {
            f203619c = new q0();
        }
        return f203619c;
    }

    public static String b(long j8, String str) {
        return v.h.u(j8, "com.garmin.android.apps.connectmobile.devices.NOTIFICATION_SHARED_PREF_NAME_", "_", str);
    }
}
