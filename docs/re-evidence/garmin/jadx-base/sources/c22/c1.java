package c22;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes10.dex */
public class c1 {
    public static boolean a(Context context) {
        if (context != null) {
            try {
                LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
                return locationManager != null && locationManager.isProviderEnabled("gps");
            } catch (Exception e4) {
                com.garmin.android.apps.connectmobile.i2.i("GPSUtil", e4.getMessage());
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        if (context != null) {
            try {
                LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
                return locationManager != null && locationManager.isProviderEnabled("network");
            } catch (Exception e4) {
                com.garmin.android.apps.connectmobile.i2.i("GPSUtil", e4.getMessage());
            }
        }
        return false;
    }
}
