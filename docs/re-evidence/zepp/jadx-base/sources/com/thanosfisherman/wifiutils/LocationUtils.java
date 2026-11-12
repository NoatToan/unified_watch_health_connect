package com.thanosfisherman.wifiutils;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.thanosfisherman.elvis.Elvis;
import com.thanosfisherman.elvis.interfaces.Function;
import com.thanosfisherman.wifiutils.LocationUtils;

/* JADX INFO: loaded from: classes18.dex */
public class LocationUtils {
    public static final int GOOD_TO_GO = 1000;
    public static final int LOCATION_DISABLED = 1112;
    public static final int NO_LOCATION_AVAILABLE = 1111;
    private static final String a = "LocationUtils";

    private static boolean c(@NonNull Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return Elvis.of(locationManager).next(new Function() { // from class: kr4
            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function andThen(Function function) {
                return fc2.a(this, function);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public final Object apply(Object obj) {
                return LocationUtils.d((LocationManager) obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function compose(Function function) {
                return fc2.b(this, function);
            }
        }).getBoolean() || Elvis.of(locationManager).next(new Function() { // from class: lr4
            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function andThen(Function function) {
                return fc2.a(this, function);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public final Object apply(Object obj) {
                return LocationUtils.e((LocationManager) obj);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Function
            public /* synthetic */ Function compose(Function function) {
                return fc2.b(this, function);
            }
        }).getBoolean();
    }

    public static int checkLocationAvailability(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (!context.getPackageManager().hasSystemFeature("android.hardware.location")) {
                Log.d(a, "NO GPS SENSOR");
                return NO_LOCATION_AVAILABLE;
            }
            if (!c(context)) {
                Log.d(a, "Location DISABLED");
                return LOCATION_DISABLED;
            }
        }
        Log.d(a, "GPS GOOD TO GO");
        return 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d(LocationManager locationManager) {
        return Boolean.valueOf(locationManager.isProviderEnabled("gps"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean e(LocationManager locationManager) {
        return Boolean.valueOf(locationManager.isProviderEnabled("network"));
    }
}
