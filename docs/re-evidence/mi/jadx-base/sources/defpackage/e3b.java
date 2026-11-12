package defpackage;

import android.location.LocationManager;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes10.dex */
public class e3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f16214a = "GpsStatusUtils";

    public static boolean a() {
        LocationManager locationManager = (LocationManager) AppUtil.getApp().getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        try {
            return locationManager.isProviderEnabled("gps");
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean b() {
        boolean zB = v84.b(AppUtil.getApp(), "android.permission.ACCESS_FINE_LOCATION");
        boolean zB2 = v84.b(AppUtil.getApp(), "android.permission.ACCESS_COARSE_LOCATION");
        boolean z = zB || zB2;
        FitnessLogUtils.i(f16214a, "hasFineGpsPer = " + zB + ", hasCoarsePer = " + zB2 + ", so hasGpsPer = " + z);
        return z;
    }

    public static int c(int i) {
        if (i > 3) {
            return 3;
        }
        return i >= 1 ? 2 : 0;
    }
}
