package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxCommonLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o13.e;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p13.x;
import q6.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u00011\b\u0000\u0018\u0000 :2\u00020\u0001:\u0002:;B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0015¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0015¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010'\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00105\u001a\u0002048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010\f\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/mapbox/common/location/AndroidDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/common/location/LocationProviderRequest;", "request", "", "locationProviderName", "<init>", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;Ljava/lang/String;)V", "", "createLocationManagerWithHandlerThread", "()V", "Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;", "extractAttributesFromRequest", "()Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;", "doStart", "doStop", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "requestLocationUpdates", "(Landroid/app/PendingIntent;)V", "removeLocationUpdates", "Lcom/mapbox/common/location/GetLocationCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "getLastLocation", "(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;", "Landroid/content/Intent;", "intent", "", "Lcom/mapbox/common/location/Location;", "extractResult", "(Landroid/content/Intent;)Ljava/util/List;", "getName", "()Ljava/lang/String;", "getLocationProviderName", "toString", "Ljava/lang/String;", "providerName", "Landroid/location/LocationManager;", "locationManager$delegate", "Lo13/l;", "getLocationManager", "()Landroid/location/LocationManager;", "locationManager", "Landroid/os/HandlerThread;", "locationManagerHandlerThread", "Landroid/os/HandlerThread;", "com/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1", "locationListener", "Lcom/mapbox/common/location/AndroidDeviceLocationProvider$locationListener$1;", "", "persistentId", "I", "getPersistentId", "()I", "getPersistentId$annotations", "Companion", "LocationRequestAttributes", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AndroidDeviceLocationProvider extends BaseDeviceLocationProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "AndroidDeviceLocationProvider";
    private final AndroidDeviceLocationProvider$locationListener$1 locationListener;

    /* JADX INFO: renamed from: locationManager$delegate, reason: from kotlin metadata */
    private final l locationManager;
    private HandlerThread locationManagerHandlerThread;
    private final String locationProviderName;
    private final int persistentId;
    private final String providerName;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mapbox/common/location/AndroidDeviceLocationProvider$LocationRequestAttributes;", "", "criteria", "Landroid/location/Criteria;", "minInterval", "", "minDisplacement", "", "(Landroid/location/Criteria;JF)V", "getCriteria", "()Landroid/location/Criteria;", "getMinDisplacement", "()F", "getMinInterval", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class LocationRequestAttributes {
        private final Criteria criteria;
        private final float minDisplacement;
        private final long minInterval;

        public LocationRequestAttributes(Criteria criteria, long j8, float f14) {
            criteria.getClass();
            this.criteria = criteria;
            this.minInterval = j8;
            this.minDisplacement = f14;
        }

        public static /* synthetic */ LocationRequestAttributes copy$default(LocationRequestAttributes locationRequestAttributes, Criteria criteria, long j8, float f14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                criteria = locationRequestAttributes.criteria;
            }
            if ((i14 & 2) != 0) {
                j8 = locationRequestAttributes.minInterval;
            }
            if ((i14 & 4) != 0) {
                f14 = locationRequestAttributes.minDisplacement;
            }
            return locationRequestAttributes.copy(criteria, j8, f14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Criteria getCriteria() {
            return this.criteria;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getMinInterval() {
            return this.minInterval;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getMinDisplacement() {
            return this.minDisplacement;
        }

        public final LocationRequestAttributes copy(Criteria criteria, long minInterval, float minDisplacement) {
            criteria.getClass();
            return new LocationRequestAttributes(criteria, minInterval, minDisplacement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationRequestAttributes)) {
                return false;
            }
            LocationRequestAttributes locationRequestAttributes = (LocationRequestAttributes) other;
            return s.g(this.criteria, locationRequestAttributes.criteria) && this.minInterval == locationRequestAttributes.minInterval && Float.compare(this.minDisplacement, locationRequestAttributes.minDisplacement) == 0;
        }

        public final Criteria getCriteria() {
            return this.criteria;
        }

        public final float getMinDisplacement() {
            return this.minDisplacement;
        }

        public final long getMinInterval() {
            return this.minInterval;
        }

        public int hashCode() {
            return Float.hashCode(this.minDisplacement) + f.e(this.criteria.hashCode() * 31, 31, this.minInterval);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("LocationRequestAttributes(criteria=");
            sb3.append(this.criteria);
            sb3.append(", minInterval=");
            sb3.append(this.minInterval);
            sb3.append(", minDisplacement=");
            return f.p(sb3, this.minDisplacement, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionStatus.values().length];
            try {
                iArr[PermissionStatus.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionStatus.GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionStatus.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseDeviceLocationProvider.DeviceLocationProviderMode.values().length];
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.mapbox.common.location.AndroidDeviceLocationProvider$locationListener$1] */
    public AndroidDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest, String str) {
        super(context, locationProviderRequest);
        context.getClass();
        this.locationProviderName = str;
        if (str == null) {
            str = null;
            if ((locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null) == AccuracyLevel.PASSIVE) {
                str = "passive";
            }
        }
        this.providerName = str;
        this.locationManager = m.b(new AndroidDeviceLocationProvider$locationManager$2(context));
        this.locationListener = new LocationListener() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$locationListener$1
            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location location) {
                location.getClass();
                this.this$0.notifyLocationUpdate(x.d(LocationServiceUtils.toCommonLocation(location)));
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String provider) {
                provider.getClass();
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String provider) {
                provider.getClass();
            }

            @Override // android.location.LocationListener
            @e
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }
        };
        this.persistentId = Objects.hash(DeviceLocationProviderType.ANDROID.name(), str, String.valueOf(locationProviderRequest));
    }

    private final void createLocationManagerWithHandlerThread() {
        this.locationManagerHandlerThread = new HandlerThread("locationManagerHandlerThread");
    }

    private final LocationRequestAttributes extractAttributesFromRequest() {
        Criteria criteria;
        Long minimumInterval;
        Float fValueOf;
        IntervalSettings interval;
        Expected<LocationError, Criteria> criteria2;
        LocationProviderRequest request = getRequest();
        if (request == null || (criteria2 = LocationProviderSettingsExtKt.toCriteria(request)) == null || (criteria = criteria2.getValue()) == null) {
            criteria = new Criteria();
        }
        LocationProviderRequest request2 = getRequest();
        if (request2 == null || (interval = request2.getInterval()) == null || (minimumInterval = interval.getMinimumInterval()) == null) {
            minimumInterval = 1000L;
        }
        long jLongValue = minimumInterval.longValue();
        LocationProviderRequest request3 = getRequest();
        if (request3 == null || (fValueOf = request3.getDisplacement()) == null) {
            fValueOf = Float.valueOf(0.0f);
        }
        return new LocationRequestAttributes(criteria, jLongValue, fValueOf.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$2(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, android.location.Location location) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new AndroidDeviceLocationProvider$getLastLocation$1$1(getLocationCallback, location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$3(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new AndroidDeviceLocationProvider$getLastLocation$2$1(getLocationCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$4(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new AndroidDeviceLocationProvider$getLastLocation$3$1(getLocationCallback));
    }

    private final LocationManager getLocationManager() {
        return (LocationManager) this.locationManager.getValue();
    }

    public static /* synthetic */ void getPersistentId$annotations() {
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public synchronized void doStart() {
        BaseDeviceLocationProvider.DeviceLocationProviderMode deviceLocationProviderMode;
        MapboxCommonLogger mapboxCommonLogger;
        createLocationManagerWithHandlerThread();
        LocationRequestAttributes locationRequestAttributesExtractAttributesFromRequest = extractAttributesFromRequest();
        Criteria criteria = locationRequestAttributesExtractAttributesFromRequest.getCriteria();
        long minInterval = locationRequestAttributesExtractAttributesFromRequest.getMinInterval();
        float minDisplacement = locationRequestAttributesExtractAttributesFromRequest.getMinDisplacement();
        PermissionStatus permissionStatus = LocationServiceUtils.getPermissionStatus(getContext());
        MapboxCommonLogger mapboxCommonLogger2 = MapboxCommonLogger.INSTANCE;
        mapboxCommonLogger2.logD$common_release(TAG, "Permission status: " + permissionStatus);
        BaseDeviceLocationProvider.DeviceLocationProviderMode deviceLocationProviderMode2 = BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE;
        int i14 = WhenMappings.$EnumSwitchMapping$0[permissionStatus.ordinal()];
        if (i14 == 1 || i14 == 2) {
            deviceLocationProviderMode = BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK;
            HandlerThread handlerThread = this.locationManagerHandlerThread;
            if (handlerThread != null) {
                handlerThread.start();
            }
            if (this.providerName != null) {
                Looper looper = null;
                LocationManager locationManager = getLocationManager();
                String str = this.providerName;
                AndroidDeviceLocationProvider$locationListener$1 androidDeviceLocationProvider$locationListener$1 = this.locationListener;
                HandlerThread handlerThread2 = this.locationManagerHandlerThread;
                if (handlerThread2 != null) {
                    looper = handlerThread2.getLooper();
                }
                locationManager.requestLocationUpdates(str, minInterval, minDisplacement, androidDeviceLocationProvider$locationListener$1, looper);
                mapboxCommonLogger = mapboxCommonLogger2;
            } else {
                Looper looper2 = null;
                LocationManager locationManager2 = getLocationManager();
                AndroidDeviceLocationProvider$locationListener$1 androidDeviceLocationProvider$locationListener$2 = this.locationListener;
                HandlerThread handlerThread3 = this.locationManagerHandlerThread;
                if (handlerThread3 != null) {
                    looper2 = handlerThread3.getLooper();
                }
                mapboxCommonLogger = mapboxCommonLogger2;
                locationManager2.requestLocationUpdates(minInterval, minDisplacement, criteria, androidDeviceLocationProvider$locationListener$2, looper2);
            }
        } else {
            if (i14 != 3) {
                this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
                return;
            }
            deviceLocationProviderMode = BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT;
            if (this.providerName != null) {
                getLocationManager().requestLocationUpdates(this.providerName, minInterval, minDisplacement, getLocationUpdatePendingIntent());
            } else {
                getLocationManager().requestLocationUpdates(minInterval, minDisplacement, criteria, getLocationUpdatePendingIntent());
            }
            mapboxCommonLogger = mapboxCommonLogger2;
        }
        setCurrentMode(deviceLocationProviderMode);
        this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STARTED;
        mapboxCommonLogger.logD$common_release(TAG, "Started location updates with mode " + getCurrentMode());
        if (permissionStatus == PermissionStatus.BACKGROUND) {
            LocationUpdatesReceiver.INSTANCE.addDeviceLocationProvider$common_release(getPersistentId(), this);
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public synchronized void doStop() {
        try {
            int i14 = WhenMappings.$EnumSwitchMapping$1[getCurrentMode().ordinal()];
            if (i14 == 1) {
                getLocationManager().removeUpdates(this.locationListener);
                HandlerThread handlerThread = this.locationManagerHandlerThread;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
            } else if (i14 == 2) {
                getLocationManager().removeUpdates(getLocationUpdatePendingIntent());
                LocationUpdatesReceiver.INSTANCE.removeDeviceLocationProvider$common_release(getPersistentId());
            } else if (i14 == 3) {
                MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to stop: Cannot stop Android device location provider. Invalid mode: " + getCurrentMode());
            }
            this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public List<Location> extractResult(Intent intent) {
        Bundle extras;
        intent.getClass();
        if (!intent.hasExtra(FirebaseAnalytics.Param.LOCATION) || (extras = intent.getExtras()) == null) {
            return j0.f134944a;
        }
        Object obj = extras.get(FirebaseAnalytics.Param.LOCATION);
        obj.getClass();
        return w.c(LocationServiceUtils.toCommonLocation((android.location.Location) obj));
    }

    @Override // com.mapbox.common.location.LocationProvider
    @SuppressLint({"MissingPermission"})
    public Cancelable getLastLocation(GetLocationCallback callback) {
        Object obj;
        callback.getClass();
        Handler handler = new Handler(Looper.getMainLooper());
        BaseDeviceLocationProvider.LocationCancelable locationCancelable = new BaseDeviceLocationProvider.LocationCancelable();
        try {
            List<String> allProviders = getLocationManager().getAllProviders();
            allProviders.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = allProviders.iterator();
            while (it.hasNext()) {
                android.location.Location lastKnownLocation = getLocationManager().getLastKnownLocation((String) it.next());
                if (lastKnownLocation != null) {
                    arrayList.add(lastKnownLocation);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                Object next = it3.next();
                if (it3.hasNext()) {
                    long elapsedRealtimeNanos = ((android.location.Location) next).getElapsedRealtimeNanos() / 1000000;
                    do {
                        Object next2 = it3.next();
                        long elapsedRealtimeNanos2 = ((android.location.Location) next2).getElapsedRealtimeNanos() / 1000000;
                        if (elapsedRealtimeNanos < elapsedRealtimeNanos2) {
                            next = next2;
                            elapsedRealtimeNanos = elapsedRealtimeNanos2;
                        }
                    } while (it3.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            android.location.Location location = (android.location.Location) obj;
            if (location != null) {
                handler.post(new c(locationCancelable, callback, location, 1));
                return locationCancelable;
            }
            LocationError locationError = new LocationError(LocationErrorCode.NOT_AVAILABLE, LocationServiceImpl.ERROR_MESSAGE_LAST_LOCATION_NOT_AVAILABLE);
            MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "failed to get last known location: " + locationError.getMessage());
            handler.post(new d(1, locationCancelable, callback));
            return locationCancelable;
        } catch (Exception e4) {
            MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "failed to get last known location: " + e4.getMessage());
            handler.post(new d(2, locationCancelable, callback));
            return locationCancelable;
        }
    }

    public final String getLocationProviderName() {
        return this.locationProviderName;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public String getName() {
        return "mapbox-android";
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public int getPersistentId() {
        return this.persistentId;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        getLocationManager().removeUpdates(pendingIntent);
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        String str;
        pendingIntent.getClass();
        LocationRequestAttributes locationRequestAttributesExtractAttributesFromRequest = extractAttributesFromRequest();
        Criteria criteria = locationRequestAttributesExtractAttributesFromRequest.getCriteria();
        long minInterval = locationRequestAttributesExtractAttributesFromRequest.getMinInterval();
        float minDisplacement = locationRequestAttributesExtractAttributesFromRequest.getMinDisplacement();
        if (criteria != null) {
            String bestProvider = getLocationManager().getBestProvider(criteria, true);
            if (bestProvider != null) {
                str = bestProvider;
            } else {
                MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "Provider not found for criteria [" + criteria + "]. Using PASSIVE_PROVIDER");
                str = "passive";
            }
        } else {
            str = "passive";
        }
        getLocationManager().requestLocationUpdates(str, minInterval, minDisplacement, pendingIntent);
    }

    public String toString() {
        return "AndroidDeviceLocationProvider(" + getPersistentId() + "): [providerName: " + this.locationProviderName + ", request: " + getRequest() + ']';
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/location/AndroidDeviceLocationProvider$Companion;", "", "()V", "TAG", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
