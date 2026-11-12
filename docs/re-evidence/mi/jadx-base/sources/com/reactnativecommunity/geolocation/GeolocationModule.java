package com.reactnativecommunity.geolocation;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import defpackage.cm8;
import defpackage.ndj;
import defpackage.ni4;
import defpackage.q4i;
import defpackage.uvo;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = GeolocationModule.NAME)
@SuppressLint({"MissingPermission"})
public class GeolocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNCGeolocation";
    private static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    private final LocationListener mLocationListener;
    private String mWatchedProvider;

    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) GeolocationModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", GeolocationModule.locationToMap(location));
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                GeolocationModule.this.emitError(q4i.f31092b, "Provider " + str + " is out of service.");
                return;
            }
            if (i == 1) {
                GeolocationModule.this.emitError(q4i.c, "Provider " + str + " is temporarily unavailable.");
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f10514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f10515b;
        public final /* synthetic */ Callback c;

        public b(ReadableMap readableMap, Callback callback, Callback callback2) {
            this.f10514a = readableMap;
            this.f10515b = callback;
            this.c = callback2;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (((String) objArr[0]) == "granted") {
                GeolocationModule.this.getCurrentLocationData(this.f10514a, this.f10515b, this.c);
            } else {
                this.c.invoke(q4i.a(q4i.f31091a, "Location permission was not granted."));
            }
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10516a;

        public c(Callback callback) {
            this.f10516a = callback;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            this.f10516a.invoke(q4i.a(q4i.f31091a, "Failed to request location permission."));
        }
    }

    public class d implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10518a;

        public d(Callback callback) {
            this.f10518a = callback;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            this.f10518a.invoke(q4i.a(q4i.f31091a, "Failed to check location permission."));
        }
    }

    public class e implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PermissionsModule f10520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f10521b;
        public final /* synthetic */ Callback c;
        public final /* synthetic */ ReadableMap d;
        public final /* synthetic */ Callback e;
        public final /* synthetic */ Callback f;

        public e(PermissionsModule permissionsModule, Callback callback, Callback callback2, ReadableMap readableMap, Callback callback3, Callback callback4) {
            this.f10520a = permissionsModule;
            this.f10521b = callback;
            this.c = callback2;
            this.d = readableMap;
            this.e = callback3;
            this.f = callback4;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (((Boolean) objArr[0]).booleanValue()) {
                GeolocationModule.this.getCurrentLocationData(this.d, this.e, this.f);
            } else {
                this.f10520a.requestPermission("android.permission.ACCESS_FINE_LOCATION", new PromiseImpl(this.f10521b, this.c));
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f10523b;
        public final boolean c;
        public final float d;

        public f(long j, double d, boolean z, float f) {
            this.f10522a = j;
            this.f10523b = d;
            this.c = z;
            this.d = f;
        }

        public static f f(ReadableMap readableMap) {
            return new f(readableMap.hasKey("timeout") ? (long) readableMap.getDouble("timeout") : Long.MAX_VALUE, readableMap.hasKey("maximumAge") ? readableMap.getDouble("maximumAge") : Double.POSITIVE_INFINITY, readableMap.hasKey("enableHighAccuracy") && readableMap.getBoolean("enableHighAccuracy"), readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : 100.0f);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f10524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callback f10525b;
        public final LocationManager c;
        public final String d;
        public final long e;
        public Location f;
        public final Handler g;
        public final Runnable h;
        public final LocationListener i;
        public boolean j;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (g.this) {
                    try {
                        if (!g.this.j) {
                            g.this.f10525b.invoke(q4i.a(q4i.c, "Location request timed out"));
                            g.this.c.removeUpdates(g.this.i);
                            cm8.n("ReactNative", "LocationModule: Location request timed out");
                            g.this.j = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public class b implements LocationListener {
            public b() {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                synchronized (g.this) {
                    try {
                        if (!g.this.j) {
                            g gVar = g.this;
                            if (gVar.m(location, gVar.f)) {
                                g.this.f10524a.invoke(GeolocationModule.locationToMap(location));
                                g.this.g.removeCallbacks(g.this.h);
                                g.this.j = true;
                                g.this.c.removeUpdates(g.this.i);
                            }
                        }
                        g.this.f = location;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
            }
        }

        public /* synthetic */ g(LocationManager locationManager, String str, long j, Callback callback, Callback callback2, a aVar) {
            this(locationManager, str, j, callback, callback2);
        }

        public void l(Location location) {
            this.f = location;
            this.c.requestLocationUpdates(this.d, 100L, 1.0f, this.i);
            this.g.postDelayed(this.h, this.e);
        }

        public final boolean m(Location location, Location location2) {
            if (location2 == null) {
                return true;
            }
            long time = location.getTime() - location2.getTime();
            boolean z = time > 120000;
            boolean z2 = time < -120000;
            boolean z3 = time > 0;
            if (z) {
                return true;
            }
            if (z2) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = accuracy > 200;
            boolean zN = n(location.getProvider(), location2.getProvider());
            if (z5) {
                return true;
            }
            if (!z3 || z4) {
                return z3 && !z6 && zN;
            }
            return true;
        }

        public final boolean n(String str, String str2) {
            if (str == null) {
                return str2 == null;
            }
            return str.equals(str2);
        }

        public g(LocationManager locationManager, String str, long j, Callback callback, Callback callback2) {
            this.g = new Handler();
            this.h = new a();
            this.i = new b();
            this.c = locationManager;
            this.d = str;
            this.e = j;
            this.f10524a = callback;
            this.f10525b = callback2;
        }
    }

    public GeolocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mLocationListener = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitError(int i, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", q4i.a(i, str));
    }

    private String getValidProvider(LocationManager locationManager, boolean z) {
        String str = z ? "gps" : "network";
        if (!locationManager.isProviderEnabled(str)) {
            String str2 = str.equals("gps") ? "network" : "gps";
            if (!locationManager.isProviderEnabled(str2)) {
                return null;
            }
            str = str2;
        }
        int iA = ni4.a(getReactApplicationContext(), "android.permission.ACCESS_FINE_LOCATION");
        if (!str.equals("gps") || iA == 0) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap locationToMap(Location location) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("latitude", location.getLatitude());
        writableMapCreateMap2.putDouble("longitude", location.getLongitude());
        writableMapCreateMap2.putDouble("altitude", location.getAltitude());
        writableMapCreateMap2.putDouble("accuracy", location.getAccuracy());
        writableMapCreateMap2.putDouble("heading", location.getBearing());
        writableMapCreateMap2.putDouble("speed", location.getSpeed());
        writableMapCreateMap.putMap("coords", writableMapCreateMap2);
        writableMapCreateMap.putDouble("timestamp", location.getTime());
        writableMapCreateMap.putBoolean("mocked", location.isFromMockProvider());
        return writableMapCreateMap;
    }

    private static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    public void getCurrentLocationData(ReadableMap readableMap, Callback callback, Callback callback2) {
        f fVarF = f.f(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, fVarF.c);
            if (validProvider == null) {
                callback2.invoke(q4i.a(q4i.f31092b, "No location provider available."));
                return;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(validProvider);
            if (lastKnownLocation == null || uvo.a() - lastKnownLocation.getTime() >= fVarF.f10523b) {
                new g(locationManager, validProvider, fVarF.f10522a, callback, callback2, null).l(lastKnownLocation);
            } else {
                callback.invoke(locationToMap(lastKnownLocation));
            }
        } catch (SecurityException e2) {
            throwLocationPermissionMissing(e2);
        }
    }

    @ReactMethod
    public void getCurrentPosition(ReadableMap readableMap, Callback callback, Callback callback2) {
        PermissionsModule permissionsModule = (PermissionsModule) getReactApplicationContext().getNativeModule(PermissionsModule.class);
        b bVar = new b(readableMap, callback, callback2);
        c cVar = new c(callback2);
        permissionsModule.checkPermission("android.permission.ACCESS_FINE_LOCATION", new PromiseImpl(new e(permissionsModule, bVar, cVar, readableMap, callback, callback2), new d(callback2)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void startObserving(ReadableMap readableMap) {
        if ("gps".equals(this.mWatchedProvider)) {
            return;
        }
        f fVarF = f.f(readableMap);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, fVarF.c);
            if (validProvider == null) {
                emitError(q4i.f31092b, "No location provider available.");
                return;
            }
            if (!validProvider.equals(this.mWatchedProvider)) {
                locationManager.removeUpdates(this.mLocationListener);
                locationManager.requestLocationUpdates(validProvider, 1000L, fVarF.d, this.mLocationListener);
            }
            this.mWatchedProvider = validProvider;
        } catch (SecurityException e2) {
            throwLocationPermissionMissing(e2);
        }
    }

    @ReactMethod
    public void stopObserving() {
        ((LocationManager) getReactApplicationContext().getSystemService("location")).removeUpdates(this.mLocationListener);
        this.mWatchedProvider = null;
    }
}
