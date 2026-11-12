package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import aq.s1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.i;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0015J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u001bH\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/mapbox/common/location/GoogleDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "request", "Lcom/mapbox/common/location/LocationProviderRequest;", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V", "fusedLocationClientHandlerThread", "Landroid/os/HandlerThread;", "fusedLocationProviderClient", "Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "getFusedLocationProviderClient$annotations", "()V", "getFusedLocationProviderClient", "()Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;)V", "locationCallback", "com/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1", "Lcom/mapbox/common/location/GoogleDeviceLocationProvider$locationCallback$1;", "persistentId", "", "getPersistentId", "()I", "createFusedLocationClientHandler", "Landroid/os/Looper;", "doStart", "", "doStop", "extractResult", "", "Lcom/mapbox/common/location/Location;", "intent", "Landroid/content/Intent;", "getLastLocation", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/common/location/GetLocationCallback;", "getName", "", "quitFusedLocationClientHandler", "removeLocationUpdates", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "requestLocationUpdates", "toString", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GoogleDeviceLocationProvider extends BaseDeviceLocationProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "GoogleDeviceLocationProvider";
    private HandlerThread fusedLocationClientHandlerThread;
    private ProxyGoogleFusedLocationProviderClient fusedLocationProviderClient;
    private final GoogleDeviceLocationProvider$locationCallback$1 locationCallback;
    private final int persistentId;

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
            try {
                iArr[PermissionStatus.DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseDeviceLocationProvider.DeviceLocationProviderMode.values().length];
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1] */
    public GoogleDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest) {
        super(context, locationProviderRequest);
        context.getClass();
        this.fusedLocationProviderClient = new ProxyGoogleFusedLocationProviderClient(context);
        this.locationCallback = new LocationCallback() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult result) {
                result.getClass();
                GoogleDeviceLocationProvider googleDeviceLocationProvider = this.this$0;
                List<android.location.Location> locations = result.getLocations();
                locations.getClass();
                ArrayList arrayList = new ArrayList(y.r(locations, 10));
                for (android.location.Location location : locations) {
                    location.getClass();
                    arrayList.add(LocationServiceUtils.toCommonLocation(location));
                }
                googleDeviceLocationProvider.notifyLocationUpdate(arrayList);
            }
        };
        this.persistentId = Objects.hash(DeviceLocationProviderType.GOOGLE_PLAY_SERVICES.name(), String.valueOf(locationProviderRequest));
    }

    private final Looper createFusedLocationClientHandler() {
        HandlerThread handlerThread = new HandlerThread("fusedLocationClientHandlerThread");
        this.fusedLocationClientHandlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.fusedLocationClientHandlerThread;
        if (handlerThread2 != null) {
            return handlerThread2.getLooper();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$0(l lVar, Object obj) {
        lVar.getClass();
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$1(PermissionStatus permissionStatus, GoogleDeviceLocationProvider googleDeviceLocationProvider, r0 r0Var, Exception exc) {
        permissionStatus.getClass();
        googleDeviceLocationProvider.getClass();
        r0Var.getClass();
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to start: " + exc);
        if (permissionStatus == PermissionStatus.DENIED) {
            FeatureTelemetryCounter.create("common/location/googleProviderNoPermissions").increment();
        } else {
            FeatureTelemetryCounter.create("common/location/googleProviderFailed").increment();
        }
        googleDeviceLocationProvider.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
        if (r0Var.f105810a == BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK) {
            googleDeviceLocationProvider.quitFusedLocationClientHandler();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$2(l lVar, Object obj) {
        lVar.getClass();
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$3(GoogleDeviceLocationProvider googleDeviceLocationProvider, Exception exc) {
        googleDeviceLocationProvider.getClass();
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to stop: " + exc);
        googleDeviceLocationProvider.quitFusedLocationClientHandler();
    }

    public static /* synthetic */ void getFusedLocationProviderClient$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$6(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, Task task) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        task.getClass();
        locationCancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1(task, locationCancelable, getLocationCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quitFusedLocationClientHandler() {
        HandlerThread handlerThread = this.fusedLocationClientHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$10(Exception exc) {
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to remove location updates: " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$9(l lVar, Object obj) {
        lVar.getClass();
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$7(l lVar, Object obj) {
        lVar.getClass();
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$8(Exception exc) {
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to request location updates: " + exc);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderMode] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderMode] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, com.mapbox.common.location.BaseDeviceLocationProvider$DeviceLocationProviderMode] */
    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint({"MissingPermission"})
    public synchronized void doStart() {
        LocationRequest locationRequestCreate;
        Task<Void> taskRequestLocationUpdates;
        Task<Void> taskAddOnSuccessListener;
        Expected<LocationError, LocationRequest> locationRequest;
        try {
            LocationProviderRequest request = getRequest();
            if (request == null || (locationRequest = LocationProviderSettingsExtKt.toLocationRequest(request)) == null || (locationRequestCreate = locationRequest.getValue()) == null) {
                locationRequestCreate = LocationRequest.create();
            }
            final PermissionStatus permissionStatus = LocationServiceUtils.getPermissionStatus(getContext());
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Permission status: " + permissionStatus);
            final r0 r0Var = new r0();
            r0Var.f105810a = BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE;
            int i14 = WhenMappings.$EnumSwitchMapping$0[permissionStatus.ordinal()];
            if (i14 == 1 || i14 == 2) {
                r0Var.f105810a = BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK;
                ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient = this.fusedLocationProviderClient;
                locationRequestCreate.getClass();
                taskRequestLocationUpdates = proxyGoogleFusedLocationProviderClient.requestLocationUpdates(locationRequestCreate, this.locationCallback, createFusedLocationClientHandler());
            } else if (i14 == 3) {
                r0Var.f105810a = BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT;
                ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient2 = this.fusedLocationProviderClient;
                locationRequestCreate.getClass();
                taskRequestLocationUpdates = proxyGoogleFusedLocationProviderClient2.requestLocationUpdates(locationRequestCreate, getLocationUpdatePendingIntent());
            } else {
                if (i14 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                taskRequestLocationUpdates = new FailedTask<>(new Exception("Cannot start Google device location provider: permission denied"));
            }
            if (taskRequestLocationUpdates != null && (taskAddOnSuccessListener = taskRequestLocationUpdates.addOnSuccessListener(new s1(new AnonymousClass1(r0Var), 3))) != null) {
                taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.mapbox.common.location.a
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        GoogleDeviceLocationProvider.doStart$lambda$1(permissionStatus, this, r0Var, exc);
                    }
                });
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public synchronized void doStop() {
        Task<Void> taskRemoveLocationUpdates;
        Task<Void> taskAddOnSuccessListener;
        try {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "doStop() called with currentMode: " + getCurrentMode());
            int i14 = WhenMappings.$EnumSwitchMapping$1[getCurrentMode().ordinal()];
            if (i14 == 1) {
                taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(this.locationCallback);
            } else if (i14 == 2) {
                taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(getLocationUpdatePendingIntent());
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                taskRemoveLocationUpdates = new FailedTask<>(new Exception("Cannot stop Google device location provider. Invalid mode: " + getCurrentMode()));
            }
            if (taskRemoveLocationUpdates != null && (taskAddOnSuccessListener = taskRemoveLocationUpdates.addOnSuccessListener(new s1(new C39501(), 2))) != null) {
                taskAddOnSuccessListener.addOnFailureListener(new i(this, 6));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public List<Location> extractResult(Intent intent) {
        intent.getClass();
        LocationResult locationResultExtractResult = LocationResult.extractResult(intent);
        if (locationResultExtractResult == null) {
            return j0.f134944a;
        }
        List<android.location.Location> locations = locationResultExtractResult.getLocations();
        locations.getClass();
        ArrayList arrayList = new ArrayList(y.r(locations, 10));
        for (android.location.Location location : locations) {
            location.getClass();
            arrayList.add(LocationServiceUtils.toCommonLocation(location));
        }
        return arrayList;
    }

    public final ProxyGoogleFusedLocationProviderClient getFusedLocationProviderClient() {
        return this.fusedLocationProviderClient;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public Cancelable getLastLocation(final GetLocationCallback callback) {
        callback.getClass();
        final BaseDeviceLocationProvider.LocationCancelable locationCancelable = new BaseDeviceLocationProvider.LocationCancelable();
        Task<android.location.Location> lastLocation = this.fusedLocationProviderClient.getLastLocation();
        if (lastLocation != null) {
            lastLocation.addOnCompleteListener(new OnCompleteListener() { // from class: com.mapbox.common.location.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    GoogleDeviceLocationProvider.getLastLocation$lambda$6(locationCancelable, callback, task);
                }
            });
        }
        return locationCancelable;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public String getName() {
        return "mapbox-google";
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public int getPersistentId() {
        return this.persistentId;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Task<Void> taskAddOnSuccessListener;
        pendingIntent.getClass();
        Task<Void> taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(pendingIntent);
        if (taskRemoveLocationUpdates == null || (taskAddOnSuccessListener = taskRemoveLocationUpdates.addOnSuccessListener(new s1(C39511.INSTANCE, 1))) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new com.google.protobuf.a(14));
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        LocationRequest locationRequestCreate;
        Task<Void> taskAddOnSuccessListener;
        Expected<LocationError, LocationRequest> locationRequest;
        pendingIntent.getClass();
        LocationProviderRequest request = getRequest();
        if (request == null || (locationRequest = LocationProviderSettingsExtKt.toLocationRequest(request)) == null || (locationRequestCreate = locationRequest.getValue()) == null) {
            locationRequestCreate = LocationRequest.create();
        }
        ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient = this.fusedLocationProviderClient;
        locationRequestCreate.getClass();
        Task<Void> taskRequestLocationUpdates = proxyGoogleFusedLocationProviderClient.requestLocationUpdates(locationRequestCreate, pendingIntent);
        if (taskRequestLocationUpdates == null || (taskAddOnSuccessListener = taskRequestLocationUpdates.addOnSuccessListener(new s1(C39521.INSTANCE, 4))) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new com.google.protobuf.a(15));
    }

    public final void setFusedLocationProviderClient(ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient) {
        proxyGoogleFusedLocationProviderClient.getClass();
        this.fusedLocationProviderClient = proxyGoogleFusedLocationProviderClient;
    }

    public String toString() {
        return "GoogleDeviceLocationProvider(" + getPersistentId() + "): [request: " + getRequest() + ']';
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/GoogleDeviceLocationProvider$Companion;", "", "()V", "TAG", "", "isAvailable", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final boolean isAvailable() {
            return LocationServiceUtils.getGooglePlayServicesBundled() && ProxyGoogleFusedLocationProviderClient.INSTANCE.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$removeLocationUpdates$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39511 extends w implements l<Void, Unit> {
        public static final C39511 INSTANCE = new C39511();

        public C39511() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r14) {
            MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location update removed");
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Void r14) {
            invoke2(r14);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$requestLocationUpdates$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39521 extends w implements l<Void, Unit> {
        public static final C39521 INSTANCE = new C39521();

        public C39521() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r14) {
            MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location update requested");
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Void r14) {
            invoke2(r14);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$doStop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39501 extends w implements l<Void, Unit> {
        public C39501() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r14) {
            GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
            if (googleDeviceLocationProvider.state == BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPING) {
                googleDeviceLocationProvider.quitFusedLocationClientHandler();
                GoogleDeviceLocationProvider.this.setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE);
                GoogleDeviceLocationProvider.this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
            } else {
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Skipped stop state change: current state is " + GoogleDeviceLocationProvider.this.state);
            }
            LocationUpdatesReceiver.INSTANCE.removeDeviceLocationProvider$common_release(GoogleDeviceLocationProvider.this.getPersistentId());
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Void r14) {
            invoke2(r14);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.location.GoogleDeviceLocationProvider$doStart$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Void, Unit> {
        final /* synthetic */ r0<BaseDeviceLocationProvider.DeviceLocationProviderMode> $pendingMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(r0<BaseDeviceLocationProvider.DeviceLocationProviderMode> r0Var) {
            super(1);
            this.$pendingMode = r0Var;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Void r14) {
            FeatureTelemetryCounter.create("common/location/googleProviderStarted").increment();
            GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
            if (googleDeviceLocationProvider.state == BaseDeviceLocationProvider.DeviceLocationProviderState.STARTING) {
                googleDeviceLocationProvider.setCurrentMode(this.$pendingMode.f105810a);
                GoogleDeviceLocationProvider.this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STARTED;
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Started location updates with mode " + GoogleDeviceLocationProvider.this.getCurrentMode());
            } else {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleDeviceLocationProvider.TAG, "Skipped start state change: current state is " + GoogleDeviceLocationProvider.this.state);
            }
            LocationUpdatesReceiver.INSTANCE.addDeviceLocationProvider$common_release(GoogleDeviceLocationProvider.this.getPersistentId(), GoogleDeviceLocationProvider.this);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(Void r14) {
            invoke2(r14);
            return Unit.INSTANCE;
        }
    }
}
