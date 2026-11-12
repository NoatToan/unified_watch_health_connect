package zg2;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static final boolean a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return ((locationManager != null && locationManager.isProviderEnabled("gps")) || (locationManager != null && locationManager.isProviderEnabled("network"))) && (a7.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && (Build.VERSION.SDK_INT < 29 || a7.b.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0));
    }
}
