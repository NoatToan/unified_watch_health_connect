package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.Value;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.SettingsService;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import d53.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import lc.u0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 M2\u00020\u0001:\u0003MNOB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005JA\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J%\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u0019\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J5\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0011\u0010/J-\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u00101\u001a\u0002002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u00102J\u000f\u00105\u001a\u00020\u0006H\u0000¢\u0006\u0004\b3\u00104R\u001c\u0010\u0003\u001a\n 6*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\u00060;R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010@\u001a\u0012\u0012\u0004\u0012\u00020&0>j\b\u0012\u0004\u0012\u00020&`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR:\u0010G\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100F0E0D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl;", "Lcom/mapbox/common/location/LocationService;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "registerModeChangedReceiver", "Lcom/mapbox/common/location/DeviceLocationProviderType;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/common/location/LocationProviderRequest;", "request", "", "locationProviderName", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "getDeviceLocationProvider", "(Landroid/content/Context;Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", "existing", "requestedType", "requested", "", "googlePlayAvailable", "allowUserDefined", "providerName", "isLocationProviderRequestCompatible", "(Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;ZZLjava/lang/String;)Z", "isAvailable", "()Z", "Lcom/mapbox/common/location/PermissionStatus;", "getPermissionStatus", "()Lcom/mapbox/common/location/PermissionStatus;", "Lcom/mapbox/common/location/AccuracyAuthorization;", "getAccuracyAuthorization", "()Lcom/mapbox/common/location/AccuracyAuthorization;", "(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationServiceObserver;", "observer", "registerObserver", "(Lcom/mapbox/common/location/LocationServiceObserver;)V", "unregisterObserver", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "factory", "setUserDefinedDeviceLocationProviderFactory", "(Lcom/mapbox/common/location/DeviceLocationProviderFactory;)V", "(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Z)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;", "extendedParameters", "(Lcom/mapbox/common/location/ExtendedLocationProviderParameters;Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;", "resetLocationServices$common_release", "()V", "resetLocationServices", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "Landroid/location/LocationManager;", "locationManager", "Landroid/location/LocationManager;", "Lcom/mapbox/common/location/LocationServiceImpl$LocationModeChangedBroadcastReceiver;", "locationModeChangedReceiver", "Lcom/mapbox/common/location/LocationServiceImpl$LocationModeChangedBroadcastReceiver;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "observers", "Ljava/util/HashSet;", "userDefinedFactory", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lo13/p;", "Ljava/lang/ref/WeakReference;", "locationProviders", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getLocationProviders$common_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setLocationProviders$common_release", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "Companion", "DeviceLocationProviderParams", "LocationModeChangedBroadcastReceiver", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationServiceImpl implements LocationService {
    public static final String ERROR_MESSAGE_FAILED_TO_GET_LAST_LOCATION = "failed to get last known location";
    public static final String ERROR_MESSAGE_GOOGLE_PLAY_NOT_AVAILABLE = "Google Play Location Services are not available on this device";
    public static final String ERROR_MESSAGE_LAST_LOCATION_NOT_AVAILABLE = "no last known location available";
    public static final String TAG = "LocationService";
    private final Context context;
    private final LocationManager locationManager;
    private LocationModeChangedBroadcastReceiver locationModeChangedReceiver;
    private CopyOnWriteArrayList<p<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> locationProviders;
    private final HashSet<LocationServiceObserver> observers;
    private DeviceLocationProviderFactory userDefinedFactory;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static final LocationServiceImpl INSTANCE = new LocationServiceImpl(MapboxSDKCommon.INSTANCE.getContext());

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$LocationModeChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/mapbox/common/location/LocationServiceImpl;)V", "onReceive", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class LocationModeChangedBroadcastReceiver extends BroadcastReceiver {
        public LocationModeChangedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (action != null) {
                    LocationServiceImpl locationServiceImpl = LocationServiceImpl.this;
                    if (action.hashCode() == -511271086 && action.equals("android.location.MODE_CHANGED")) {
                        Iterator it = locationServiceImpl.observers.iterator();
                        while (it.hasNext()) {
                            ((LocationServiceObserver) it.next()).onAvailabilityChanged(locationServiceImpl.isAvailable());
                        }
                    }
                }
            }
        }
    }

    private LocationServiceImpl(Context context) {
        this.context = context.getApplicationContext();
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        systemService.getClass();
        this.locationManager = (LocationManager) systemService;
        this.observers = new HashSet<>();
        this.locationProviders = new CopyOnWriteArrayList<>();
        registerModeChangedReceiver(context);
    }

    public static final LocationService createPlatformLocationService() {
        return INSTANCE.createPlatformLocationService();
    }

    private final boolean isLocationProviderRequestCompatible(DeviceLocationProviderParams existing, DeviceLocationProviderType requestedType, LocationProviderRequest requested, boolean googlePlayAvailable, boolean allowUserDefined, String providerName) {
        if (existing instanceof DeviceLocationProviderParams.Custom) {
            if (!allowUserDefined) {
                return false;
            }
            DeviceLocationProviderParams.Custom custom = (DeviceLocationProviderParams.Custom) existing;
            DeviceLocationProviderFactory deviceLocationProviderFactory = custom.getFactory().get();
            DeviceLocationProviderFactory deviceLocationProviderFactory2 = this.userDefinedFactory;
            if (deviceLocationProviderFactory2 == null || deviceLocationProviderFactory == null || !deviceLocationProviderFactory.equals(deviceLocationProviderFactory2)) {
                return false;
            }
            if (requested == null) {
                return true;
            }
            return requested.equals(custom.getRequest());
        }
        if (!(existing instanceof DeviceLocationProviderParams.Default)) {
            u0.r();
            return false;
        }
        if (allowUserDefined && this.userDefinedFactory != null) {
            return false;
        }
        DeviceLocationProviderParams.Default r14 = (DeviceLocationProviderParams.Default) existing;
        if (requestedType != r14.getType()) {
            DeviceLocationProviderType type = r14.getType();
            DeviceLocationProviderType deviceLocationProviderType = DeviceLocationProviderType.GOOGLE_PLAY_SERVICES;
            if (type == deviceLocationProviderType && requestedType == DeviceLocationProviderType.ANDROID) {
                return false;
            }
            DeviceLocationProviderType type2 = r14.getType();
            DeviceLocationProviderType deviceLocationProviderType2 = DeviceLocationProviderType.ANDROID;
            if (type2 == deviceLocationProviderType2 && requestedType == deviceLocationProviderType) {
                return false;
            }
            if (r14.getType() == deviceLocationProviderType2 && requestedType == DeviceLocationProviderType.BEST && googlePlayAvailable) {
                return false;
            }
        }
        boolean z14 = providerName == null || s.g(r14.getName(), providerName);
        if (requested == null && z14) {
            return true;
        }
        return Objects.equals(requested, r14.getRequest()) && z14;
    }

    private final void registerModeChangedReceiver(Context context) {
        this.locationModeChangedReceiver = new LocationModeChangedBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter("android.location.MODE_CHANGED");
        LocationModeChangedBroadcastReceiver locationModeChangedBroadcastReceiver = this.locationModeChangedReceiver;
        if (locationModeChangedBroadcastReceiver != null) {
            context.registerReceiver(locationModeChangedBroadcastReceiver, intentFilter);
        } else {
            s.m("locationModeChangedReceiver");
            throw null;
        }
    }

    @Override // com.mapbox.common.location.LocationService
    public AccuracyAuthorization getAccuracyAuthorization() {
        Context context = this.context;
        context.getClass();
        return LocationServiceUtils.getAccuracyAuthorization(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedParameters, LocationProviderRequest request) {
        boolean zIsAvailable;
        extendedParameters.getClass();
        try {
            zIsAvailable = GoogleDeviceLocationProvider.INSTANCE.isAvailable();
        } catch (IncompatibleGooglePlayServicesLocationVersion unused) {
            zIsAvailable = false;
        }
        boolean z14 = zIsAvailable;
        DeviceLocationProviderType deviceLocationProviderType = extendedParameters.getDeviceLocationProviderType();
        if (deviceLocationProviderType == null) {
            deviceLocationProviderType = DeviceLocationProviderType.BEST;
        }
        DeviceLocationProviderType deviceLocationProviderType2 = deviceLocationProviderType;
        deviceLocationProviderType2.getClass();
        Boolean allowUserDefined = extendedParameters.getAllowUserDefined();
        if (allowUserDefined == null) {
            allowUserDefined = Boolean.TRUE;
        }
        boolean zBooleanValue = allowUserDefined.booleanValue();
        String locationProviderName = deviceLocationProviderType2 == DeviceLocationProviderType.ANDROID ? extendedParameters.getLocationProviderName() : null;
        CopyOnWriteArrayList<p<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> copyOnWriteArrayList = this.locationProviders;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (((WeakReference) ((p) obj).f128595b).get() != null) {
                arrayList.add(obj);
            }
        }
        CopyOnWriteArrayList<p<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(arrayList);
        this.locationProviders = copyOnWriteArrayList2;
        for (p<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>> pVar : copyOnWriteArrayList2) {
            DeviceLocationProvider deviceLocationProvider = pVar.f128595b.get();
            if (deviceLocationProvider != null) {
                LocationProviderRequest locationProviderRequest = request;
                if (isLocationProviderRequestCompatible(pVar.f128594a, deviceLocationProviderType2, locationProviderRequest, z14, zBooleanValue, locationProviderName)) {
                    Expected<LocationError, DeviceLocationProvider> expectedCreateValue = ExpectedFactory.createValue(deviceLocationProvider);
                    expectedCreateValue.getClass();
                    return expectedCreateValue;
                }
                request = locationProviderRequest;
            }
        }
        LocationProviderRequest locationProviderRequest2 = request;
        DeviceLocationProviderFactory deviceLocationProviderFactory = this.userDefinedFactory;
        if (deviceLocationProviderFactory != null && zBooleanValue) {
            Expected<LocationError, DeviceLocationProvider> expectedBuild = deviceLocationProviderFactory.build(locationProviderRequest2);
            expectedBuild.getClass();
            if (expectedBuild.isValue()) {
                this.locationProviders.add(new p<>(new DeviceLocationProviderParams.Custom(new WeakReference(deviceLocationProviderFactory), locationProviderRequest2), new WeakReference(expectedBuild.getValue())));
            }
            return expectedBuild;
        }
        Context context = this.context;
        context.getClass();
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider2 = getDeviceLocationProvider(context, deviceLocationProviderType2, locationProviderRequest2, locationProviderName);
        if (deviceLocationProvider2.isValue()) {
            this.locationProviders.add(new p<>(new DeviceLocationProviderParams.Default(deviceLocationProvider2.getValue() instanceof GoogleDeviceLocationProvider ? DeviceLocationProviderType.GOOGLE_PLAY_SERVICES : DeviceLocationProviderType.ANDROID, locationProviderRequest2, locationProviderName), new WeakReference(deviceLocationProvider2.getValue())));
        }
        return deviceLocationProvider2;
    }

    public final CopyOnWriteArrayList<p<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> getLocationProviders$common_release() {
        return this.locationProviders;
    }

    @Override // com.mapbox.common.location.LocationService
    public PermissionStatus getPermissionStatus() {
        Context context = this.context;
        context.getClass();
        return LocationServiceUtils.getPermissionStatus(context);
    }

    @Override // com.mapbox.common.location.LocationService
    public boolean isAvailable() {
        LocationManager locationManager = this.locationManager;
        int i14 = f7.b.f69398a;
        return locationManager.isLocationEnabled();
    }

    @Override // com.mapbox.common.location.LocationService
    public synchronized void registerObserver(LocationServiceObserver observer) {
        observer.getClass();
        this.observers.add(observer);
    }

    public final void resetLocationServices$common_release() {
        this.locationProviders.clear();
    }

    public final void setLocationProviders$common_release(CopyOnWriteArrayList<p<DeviceLocationProviderParams, WeakReference<DeviceLocationProvider>>> copyOnWriteArrayList) {
        copyOnWriteArrayList.getClass();
        this.locationProviders = copyOnWriteArrayList;
    }

    @Override // com.mapbox.common.location.LocationService
    public synchronized void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory factory) {
        try {
            this.userDefinedFactory = factory;
            SettingsService settingsServiceFactory = SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT);
            Long lJ = t.j(String.valueOf(settingsServiceFactory.get("com.mapbox.common.internal.location_service.userdefinedfactory_changed", Value.valueOf(0L)).getValue()));
            settingsServiceFactory.set("com.mapbox.common.internal.location_service.userdefinedfactory_changed", Value.valueOf((lJ != null ? lJ.longValue() : 0L) + 1));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.location.LocationService
    public synchronized void unregisterObserver(LocationServiceObserver observer) {
        observer.getClass();
        this.observers.remove(observer);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$Companion;", "", "()V", "ERROR_MESSAGE_FAILED_TO_GET_LAST_LOCATION", "", "ERROR_MESSAGE_GOOGLE_PLAY_NOT_AVAILABLE", "ERROR_MESSAGE_LAST_LOCATION_NOT_AVAILABLE", "INSTANCE", "Lcom/mapbox/common/location/LocationServiceImpl;", "TAG", "createPlatformLocationService", "Lcom/mapbox/common/location/LocationService;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final LocationService createPlatformLocationService() {
            return LocationServiceImpl.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", "", "()V", "Custom", "Default", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Custom;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Default;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class DeviceLocationProviderParams {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Custom;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", "factory", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "(Ljava/lang/ref/WeakReference;Lcom/mapbox/common/location/LocationProviderRequest;)V", "getFactory", "()Ljava/lang/ref/WeakReference;", "getRequest", "()Lcom/mapbox/common/location/LocationProviderRequest;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Custom extends DeviceLocationProviderParams {
            private final WeakReference<DeviceLocationProviderFactory> factory;
            private final LocationProviderRequest request;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Custom(WeakReference<DeviceLocationProviderFactory> weakReference, LocationProviderRequest locationProviderRequest) {
                super(null);
                weakReference.getClass();
                this.factory = weakReference;
                this.request = locationProviderRequest;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Custom copy$default(Custom custom, WeakReference weakReference, LocationProviderRequest locationProviderRequest, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    weakReference = custom.factory;
                }
                if ((i14 & 2) != 0) {
                    locationProviderRequest = custom.request;
                }
                return custom.copy(weakReference, locationProviderRequest);
            }

            public final WeakReference<DeviceLocationProviderFactory> component1() {
                return this.factory;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public final Custom copy(WeakReference<DeviceLocationProviderFactory> factory, LocationProviderRequest request) {
                factory.getClass();
                return new Custom(factory, request);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) other;
                return s.g(this.factory, custom.factory) && s.g(this.request, custom.request);
            }

            public final WeakReference<DeviceLocationProviderFactory> getFactory() {
                return this.factory;
            }

            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public int hashCode() {
                int iHashCode = this.factory.hashCode() * 31;
                LocationProviderRequest locationProviderRequest = this.request;
                return iHashCode + (locationProviderRequest == null ? 0 : locationProviderRequest.hashCode());
            }

            public String toString() {
                return "Custom(factory=" + this.factory + ", request=" + this.request + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams$Default;", "Lcom/mapbox/common/location/LocationServiceImpl$DeviceLocationProviderParams;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/common/location/DeviceLocationProviderType;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "name", "", "(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRequest", "()Lcom/mapbox/common/location/LocationProviderRequest;", "getType", "()Lcom/mapbox/common/location/DeviceLocationProviderType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Default extends DeviceLocationProviderParams {
            private final String name;
            private final LocationProviderRequest request;
            private final DeviceLocationProviderType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, String str) {
                super(null);
                deviceLocationProviderType.getClass();
                this.type = deviceLocationProviderType;
                this.request = locationProviderRequest;
                this.name = str;
            }

            public static /* synthetic */ Default copy$default(Default r14, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, String str, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    deviceLocationProviderType = r14.type;
                }
                if ((i14 & 2) != 0) {
                    locationProviderRequest = r14.request;
                }
                if ((i14 & 4) != 0) {
                    str = r14.name;
                }
                return r14.copy(deviceLocationProviderType, locationProviderRequest, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DeviceLocationProviderType getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final Default copy(DeviceLocationProviderType type, LocationProviderRequest request, String name) {
                type.getClass();
                return new Default(type, request, name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Default)) {
                    return false;
                }
                Default r14 = (Default) other;
                return this.type == r14.type && s.g(this.request, r14.request) && s.g(this.name, r14.name);
            }

            public final String getName() {
                return this.name;
            }

            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public final DeviceLocationProviderType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                LocationProviderRequest locationProviderRequest = this.request;
                int iHashCode2 = (iHashCode + (locationProviderRequest == null ? 0 : locationProviderRequest.hashCode())) * 31;
                String str = this.name;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb3 = new StringBuilder("Default(type=");
                sb3.append(this.type);
                sb3.append(", request=");
                sb3.append(this.request);
                sb3.append(", name=");
                return a0.m(sb3, this.name, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        public /* synthetic */ DeviceLocationProviderParams(j jVar) {
            this();
        }

        private DeviceLocationProviderParams() {
        }
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType type, LocationProviderRequest request, boolean allowUserDefined) {
        type.getClass();
        ExtendedLocationProviderParameters extendedLocationProviderParametersBuild = new ExtendedLocationProviderParameters.Builder().deviceLocationProviderType(type).allowUserDefined(Boolean.valueOf(allowUserDefined)).build();
        extendedLocationProviderParametersBuild.getClass();
        return getDeviceLocationProvider(extendedLocationProviderParametersBuild, request);
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest request) {
        return LocationService.DefaultImpls.getDeviceLocationProvider$default(this, DeviceLocationProviderType.BEST, request, false, 4, null);
    }

    private final Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(Context context, DeviceLocationProviderType type, LocationProviderRequest request, String locationProviderName) {
        boolean zIsAvailable;
        try {
            zIsAvailable = GoogleDeviceLocationProvider.INSTANCE.isAvailable();
        } catch (IncompatibleGooglePlayServicesLocationVersion unused) {
            MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "Skipping incompatible Google Play Services location version");
            zIsAvailable = false;
        }
        if (type == null) {
            type = DeviceLocationProviderType.BEST;
        }
        DeviceLocationProviderType deviceLocationProviderType = DeviceLocationProviderType.BEST;
        if ((type == deviceLocationProviderType || type == DeviceLocationProviderType.GOOGLE_PLAY_SERVICES) && zIsAvailable) {
            Expected<LocationError, DeviceLocationProvider> expectedCreateValue = ExpectedFactory.createValue(new GoogleDeviceLocationProvider(context, request));
            expectedCreateValue.getClass();
            return expectedCreateValue;
        }
        if (type != deviceLocationProviderType && type != DeviceLocationProviderType.ANDROID) {
            LocationError locationError = new LocationError(LocationErrorCode.NOT_AVAILABLE, ERROR_MESSAGE_GOOGLE_PLAY_NOT_AVAILABLE);
            MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to get device location provider: " + locationError.getMessage());
            Expected<LocationError, DeviceLocationProvider> expectedCreateError = ExpectedFactory.createError(locationError);
            expectedCreateError.getClass();
            return expectedCreateError;
        }
        Expected<LocationError, DeviceLocationProvider> expectedCreateValue2 = ExpectedFactory.createValue(new AndroidDeviceLocationProvider(context, request, locationProviderName));
        expectedCreateValue2.getClass();
        return expectedCreateValue2;
    }
}
