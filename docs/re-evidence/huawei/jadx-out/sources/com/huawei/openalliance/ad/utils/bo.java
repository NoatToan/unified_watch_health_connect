package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.openalliance.ad.beans.inner.LocationSwitches;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20506a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static LocationManager f20507b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f20508c = null;
    private static Location d = null;
    private static long e = -1;
    private static long f = 1800000;
    private static volatile boolean g = false;

    private static boolean a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Context context) {
        cn.a(context).D("");
        fp.b(context).E("");
    }

    private static boolean m(Context context) {
        if (context == null) {
            return false;
        }
        if (!a()) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!cj.a(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    private static LocationSwitches l(Context context) {
        ?? M;
        boolean zL = com.huawei.openalliance.ad.cc.a(context).l();
        boolean zF = ab.f(context);
        boolean z = false;
        try {
            M = m(context);
        } catch (Throwable th) {
            hw.d("LocationUtils", "loc_tag hasLocationPermission = " + th.getClass().getSimpleName());
            M = 0;
        }
        if (hw.a()) {
            hw.a("LocationUtils", "loc_tag isBaseLocationSwitch = %s", Boolean.valueOf(zL));
            hw.a("LocationUtils", "loc_tag isGpsSwitchOpen = %s", Boolean.valueOf(zF));
            hw.a("LocationUtils", "loc_tag hasLocationPermission = %s", Boolean.valueOf((boolean) M));
        }
        LocationSwitches locationSwitches = new LocationSwitches();
        locationSwitches.a(zL ? 1 : 0);
        locationSwitches.b(zF ? 1 : 0);
        locationSwitches.c(M);
        if (zL && zF && M != 0) {
            z = true;
        }
        locationSwitches.b(z);
        return locationSwitches;
    }

    private static boolean k(Context context) {
        boolean z;
        try {
            z = (Class.forName("com.huawei.hms.location.LocationServices") == null || Class.forName("com.huawei.hms.location.FusedLocationProviderClient") == null) ? false : true;
        } catch (Throwable unused) {
            hw.d("LocationUtils", "loc_tag check location sdk available error");
        }
        return z && k.a(context, k.e(context));
    }

    private static void j(final Context context) {
        hw.a("LocationUtils", "loc_tag getLocationByKit");
        try {
            new bn(context, new bn.a() { // from class: com.huawei.openalliance.ad.utils.bo.5
                @Override // com.huawei.openalliance.ad.utils.bn.a
                public void a(android.location.Location location) {
                    try {
                        bo.a(context, location);
                    } catch (Throwable th) {
                        hw.b("LocationUtils", "onLocationAcquired ex: %s", th.getClass().getSimpleName());
                    }
                }

                @Override // com.huawei.openalliance.ad.utils.bn.a
                public void a() {
                    try {
                        bo.b(context, 2);
                    } catch (Throwable th) {
                        hw.b("LocationUtils", "onLocationAcquireFailed ex: %s", th.getClass().getSimpleName());
                    }
                }
            }).a();
        } catch (Throwable th) {
            hw.d("LocationUtils", "loc_tag getLocationByKit, exception = " + th.getClass().getSimpleName());
        }
    }

    private static void i(final Context context) {
        if (f(context)) {
            e = System.currentTimeMillis();
            hw.a("LocationUtils", "update lastRefreshTime");
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bo.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        bo.g(context);
                    } catch (Throwable th) {
                        hw.d("LocationUtils", "loc_tag asyncLocation exception: " + th.getClass().getSimpleName());
                    }
                }
            });
        }
    }

    private static void h(Context context) {
        if (d == null) {
            if (hw.a()) {
                hw.a("LocationUtils", "restoreLastKnownLocation");
            }
            Location locationCh = fp.b(context).ch();
            if (locationCh != null) {
                d = locationCh;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Context context) {
        if (k(context)) {
            hw.a("LocationUtils", "loc_tag asyncLocation has location-sdk");
            try {
                j(context);
                return;
            } catch (Throwable th) {
                hw.c("LocationUtils", "loc_tag get location by kit error, " + th.getClass().getSimpleName());
            }
        } else {
            hw.a("LocationUtils", "loc_tag asyncLocation has not location-sdk");
        }
        b(context, 2);
    }

    private static boolean f(Context context) {
        long jAbs = Math.abs(System.currentTimeMillis() - e);
        f = fp.b(context).aP();
        hw.a("LocationUtils", "loc_tag isRefreshOk intervalRefreshTime = " + f + ", intervalTime = " + jAbs);
        if (jAbs >= f) {
            return true;
        }
        hw.a("LocationUtils", "loc_tag isRefreshOk = false, too frequently (no ok)");
        return false;
    }

    public static boolean c(Context context) {
        if (fp.b(context).aE() != 0) {
            return com.huawei.openalliance.ad.cc.a(context).l() && com.huawei.openalliance.ad.cc.a(context).d();
        }
        hw.b("LocationUtils", "needFence false");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(LocationListener locationListener) {
        if (g || f20507b == null || locationListener == null) {
            return;
        }
        hw.b("LocationUtils", "loc_tag remove native location updates");
        try {
            f20507b.removeUpdates(locationListener);
        } catch (Throwable th) {
            hw.b("LocationUtils", "loc_tag remove native location updates ex: %s", th.getClass().getSimpleName());
        }
        g = true;
    }

    public static void b(final Context context, RequestOptions requestOptions) {
        if (a(context, requestOptions) && f(context)) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bo.1
                @Override // java.lang.Runnable
                public void run() {
                    if (bo.a(context).d()) {
                        bo.b(context, 1);
                    } else {
                        hw.b("LocationUtils", "loc_tag sendAsyncLocationByNative failed because switch is off");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, int i) {
        hw.a("LocationUtils", "loc_tag getLocationByNative");
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        f20507b = locationManager;
        if (locationManager == null) {
            hw.d("LocationUtils", "loc_tag getLocationByNative, nativeLocationManager is null, return");
            return;
        }
        List<String> providers = locationManager.getProviders(true);
        String str = "network";
        if (!providers.contains("network")) {
            str = GeocodeSearch.GPS;
            if (!providers.contains(GeocodeSearch.GPS)) {
                hw.c("LocationUtils", "loc_tag nativeLocationProvider wrong, return");
                return;
            }
        }
        f20508c = str;
        if (hw.a()) {
            hw.a("LocationUtils", "loc_tag native location provider is: %s", f20508c);
        }
        try {
            String str2 = f20508c;
            if (str2 != null) {
                if (1 == i) {
                    android.location.Location lastKnownLocation = f20507b.getLastKnownLocation(str2);
                    if (lastKnownLocation == null) {
                        hw.c("LocationUtils", "loc_tag getLocationByNative, but location is null");
                        return;
                    } else {
                        hw.a("LocationUtils", "loc_tag getLocationByNative getLastKnownLocation lat =  %s, lon = %s", ds.a(String.valueOf(lastKnownLocation.getLatitude())), ds.a(String.valueOf(lastKnownLocation.getLongitude())));
                        a(context, lastKnownLocation);
                        return;
                    }
                }
                if (2 != i) {
                    hw.a("LocationUtils", "loc_tag requestLocationByNative not correct type");
                    return;
                }
                hw.b("LocationUtils", "loc_tag getLocationByNative requestLocationUpdates");
                g = false;
                final LocationListener locationListener = new LocationListener() { // from class: com.huawei.openalliance.ad.utils.bo.3
                    @Override // android.location.LocationListener
                    public void onStatusChanged(String str3, int i2, Bundle bundle) {
                        hw.a("LocationUtils", "loc_tag getLocationByNative onStatusChanged");
                        bo.b(this);
                    }

                    @Override // android.location.LocationListener
                    public void onProviderEnabled(String str3) {
                        hw.a("LocationUtils", "loc_tag getLocationByNative onProviderEnabled");
                        bo.b(this);
                    }

                    @Override // android.location.LocationListener
                    public void onProviderDisabled(String str3) {
                        hw.a("LocationUtils", "loc_tag getLocationByNative onProviderDisabled");
                        bo.b(this);
                    }

                    @Override // android.location.LocationListener
                    public void onLocationChanged(android.location.Location location) {
                        try {
                            if (location != null) {
                                hw.a("LocationUtils", "loc_tag getLocationByNative Listener lat = %s, lon = %s", ds.a(String.valueOf(location.getLatitude())), ds.a(String.valueOf(location.getLongitude())));
                                bo.a(context, location);
                            } else {
                                hw.c("LocationUtils", "loc_tag getLocationByNative Listener, but location is null");
                            }
                        } catch (Throwable th) {
                            hw.b("LocationUtils", "onLocationChanged ex: %s", th.getClass().getSimpleName());
                        }
                        bo.b(this);
                    }
                };
                f20507b.requestSingleUpdate(f20508c, locationListener, Looper.getMainLooper());
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bo.4
                    @Override // java.lang.Runnable
                    public void run() {
                        bo.b(locationListener);
                    }
                }, 30000L);
            }
        } catch (Throwable th) {
            hw.d("LocationUtils", "loc_tag getLocationByNative, exception = " + th.getClass().getSimpleName());
        }
    }

    public static void b(final Context context) {
        if (c(context)) {
            long j = Settings.Global.getLong(context.getContentResolver(), Constants.UPDATE_FENCE_TIME, 0L);
            long jCM = fp.b(context).cM();
            if (j != 0 && j != jCM) {
                hw.a("LocationUtils", "syncFenceData");
                fp.b(context).s(j);
                o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bo.6
                    @Override // java.lang.Runnable
                    public void run() {
                        na.a(context).a(RTCMethods.QUERY_FENCE_DATA, null, new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.utils.bo.6.1
                            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                            public void onRemoteCallResult(String str, CallResult<String> callResult) {
                                Context context2;
                                if (callResult != null) {
                                    try {
                                        if (callResult.getCode() == 200) {
                                            String data = callResult.getData();
                                            if (dg.b(data)) {
                                                hw.b("LocationUtils", "query fence no data.");
                                                context2 = context;
                                            } else {
                                                JSONObject jSONObject = new JSONObject(data);
                                                String strOptString = jSONObject.optString("fenceId", "");
                                                String strOptString2 = jSONObject.optString("fenceExtra", "");
                                                if (!dg.b(strOptString) && !dg.b(strOptString2)) {
                                                    fp.b(context).h(false);
                                                    cn.a(context).D(strOptString);
                                                    fp.b(context).E(strOptString2);
                                                    return;
                                                }
                                                hw.b("LocationUtils", "query fence data invalid");
                                                context2 = context;
                                            }
                                            fp.b(context2).h(true);
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        hw.c("LocationUtils", "query fence data err: %s", th.getClass().getSimpleName());
                                        return;
                                    }
                                }
                                hw.b("LocationUtils", "query fence fail.");
                                fp.b(context).h(true);
                                if (callResult == null || callResult.getCode() != -40) {
                                    return;
                                }
                                bo.n(context);
                            }
                        }, String.class);
                    }
                });
            } else {
                hw.a("LocationUtils", "time tell no need query.");
                if (j == 0) {
                    n(context);
                }
            }
        }
    }

    public static boolean a(Context context, RequestOptions requestOptions) {
        Boolean boolD;
        if (requestOptions == null || requestOptions.d() == null) {
            RequestOptions requestConfiguration = HiAd.getInstance(context).getRequestConfiguration();
            if (requestConfiguration == null || requestConfiguration.d() == null) {
                return false;
            }
            boolD = requestConfiguration.d();
        } else {
            boolD = requestOptions.d();
        }
        return boolD.booleanValue();
    }

    public static Location a(Context context, RequestOptions requestOptions, Location location) {
        Location locationA;
        boolean zA = a(context, requestOptions);
        hw.b("LocationUtils", "loc_tag isMediaAllow: %s", Boolean.valueOf(zA));
        LocationSwitches locationSwitchesA = a(context);
        Location location2 = null;
        if (zA && locationSwitchesA.d()) {
            if (location == null) {
                i(context);
                Location location3 = d;
                if (location3 != null) {
                    locationA = location3.a();
                }
                h(context);
            } else {
                locationA = location.a();
                locationA.a(Long.valueOf(System.currentTimeMillis()));
                locationA.a(1);
            }
            location2 = locationA;
            h(context);
        } else {
            hw.b("LocationUtils", "loc_tag isLocationAvailable = false, return null");
        }
        if (location2 == null) {
            location2 = new Location();
        }
        location2.a(locationSwitchesA);
        return location2;
    }

    public static Location a(Context context, android.location.Location location) {
        if (location == null) {
            return null;
        }
        synchronized (f20506a) {
            if (d == null) {
                d = new Location();
            }
            d.a(Double.valueOf(location.getLongitude()));
            d.b(Double.valueOf(location.getLatitude()));
            d.a(Long.valueOf(System.currentTimeMillis()));
            fp.b(context).a(d);
        }
        return d;
    }

    public static LocationSwitches a(Context context) {
        boolean zBw;
        LocationSwitches locationSwitchesL = l(context);
        if (locationSwitchesL.e()) {
            zBw = fp.b(context).bw();
            hw.a("LocationUtils", "loc_tag isSdkServerLocationSwitch = %s", Boolean.valueOf(zBw));
        } else {
            zBw = false;
        }
        locationSwitchesL.a(zBw);
        return locationSwitchesL;
    }
}
