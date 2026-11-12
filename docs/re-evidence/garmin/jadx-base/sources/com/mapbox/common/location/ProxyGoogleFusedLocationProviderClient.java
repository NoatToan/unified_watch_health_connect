package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.movement.GoogleActivityRecognition;
import java.lang.reflect.Method;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rJ\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R$\u0010\u0005\u001a\u00020\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "googleFusedLocationProviderClient", "getGoogleFusedLocationProviderClient$annotations", "()V", "getGoogleFusedLocationProviderClient", "()Ljava/lang/Object;", "setGoogleFusedLocationProviderClient", "(Ljava/lang/Object;)V", "getLastLocation", "Lcom/google/android/gms/tasks/Task;", "Landroid/location/Location;", "removeLocationUpdates", "Ljava/lang/Void;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "callback", "Lcom/google/android/gms/location/LocationCallback;", "requestLocationUpdates", "request", "Lcom/google/android/gms/location/LocationRequest;", "looper", "Landroid/os/Looper;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ProxyGoogleFusedLocationProviderClient {
    private static final String GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT = "com.google.android.gms.location.FusedLocationProviderClient";
    private static Method getLastLocation;
    public static Method removeLocationUpdatesCallback;
    public static Method removeLocationUpdatesPendingIntent;
    public static Method requestLocationUpdatesCallback;
    public static Method requestLocationUpdatesPendingIntent;
    private Object googleFusedLocationProviderClient;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<Boolean> available$delegate = m.b(ProxyGoogleFusedLocationProviderClient$Companion$available$2.INSTANCE);

    public ProxyGoogleFusedLocationProviderClient(Context context) {
        context.getClass();
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        fusedLocationProviderClient.getClass();
        this.googleFusedLocationProviderClient = fusedLocationProviderClient;
    }

    public static /* synthetic */ void getGoogleFusedLocationProviderClient$annotations() {
    }

    public final Object getGoogleFusedLocationProviderClient() {
        return this.googleFusedLocationProviderClient;
    }

    public final Task<android.location.Location> getLastLocation() {
        try {
            Method method = getLastLocation;
            if (method != null) {
                return (Task) method.invoke(this.googleFusedLocationProviderClient, null);
            }
            s.m("getLastLocation");
            throw null;
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    public final Task<Void> removeLocationUpdates(LocationCallback callback) {
        callback.getClass();
        try {
            return (Task) INSTANCE.getRemoveLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, callback);
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    public final Task<Void> requestLocationUpdates(LocationRequest request, LocationCallback callback, Looper looper) {
        request.getClass();
        callback.getClass();
        try {
            return (Task) INSTANCE.getRequestLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, request, callback, looper);
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    public final void setGoogleFusedLocationProviderClient(Object obj) {
        obj.getClass();
        this.googleFusedLocationProviderClient = obj;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\n\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0014\u0010\n\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR(\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0018\u0010\n\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001b\u0010\u001f\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lcom/mapbox/common/location/ProxyGoogleFusedLocationProviderClient$Companion;", "", "<init>", "()V", "", "verifyAndCacheMethods$common_release", "()Z", "verifyAndCacheMethods", "Ljava/lang/reflect/Method;", "requestLocationUpdatesCallback", "Ljava/lang/reflect/Method;", "getRequestLocationUpdatesCallback", "()Ljava/lang/reflect/Method;", "setRequestLocationUpdatesCallback", "(Ljava/lang/reflect/Method;)V", "getRequestLocationUpdatesCallback$annotations", "requestLocationUpdatesPendingIntent", "getRequestLocationUpdatesPendingIntent", "setRequestLocationUpdatesPendingIntent", "getRequestLocationUpdatesPendingIntent$annotations", "removeLocationUpdatesCallback", "getRemoveLocationUpdatesCallback", "setRemoveLocationUpdatesCallback", "getRemoveLocationUpdatesCallback$annotations", "removeLocationUpdatesPendingIntent", "getRemoveLocationUpdatesPendingIntent", "setRemoveLocationUpdatesPendingIntent", "getRemoveLocationUpdatesPendingIntent$annotations", "available$delegate", "Lo13/l;", "getAvailable$common_release", "available", "", "GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT", "Ljava/lang/String;", "getLastLocation", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getRemoveLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRemoveLocationUpdatesPendingIntent$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesPendingIntent$annotations() {
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleFusedLocationProviderClient.available$delegate.getValue()).booleanValue();
        }

        public final Method getRemoveLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            s.m("removeLocationUpdatesCallback");
            throw null;
        }

        public final Method getRemoveLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            s.m("removeLocationUpdatesPendingIntent");
            throw null;
        }

        public final Method getRequestLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            s.m("requestLocationUpdatesCallback");
            throw null;
        }

        public final Method getRequestLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            s.m("requestLocationUpdatesPendingIntent");
            throw null;
        }

        public final void setRemoveLocationUpdatesCallback(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback = method;
        }

        public final void setRemoveLocationUpdatesPendingIntent(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent = method;
        }

        public final void setRequestLocationUpdatesCallback(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback = method;
        }

        public final void setRequestLocationUpdatesPendingIntent(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent = method;
        }

        public final boolean verifyAndCacheMethods$common_release() throws IncompatibleGooglePlayServicesLocationVersion {
            try {
                if (FusedLocationProviderClient.class.isInterface()) {
                    FeatureTelemetryCounter.create("common/location/googlePlay21").increment();
                } else {
                    FeatureTelemetryCounter.create("common/location/googlePlay18to20").increment();
                }
                Companion companion = ProxyGoogleFusedLocationProviderClient.INSTANCE;
                Method method = FusedLocationProviderClient.class.getMethod("requestLocationUpdates", LocationRequest.class, LocationCallback.class, Looper.class);
                method.getClass();
                companion.setRequestLocationUpdatesCallback(method);
                Method method2 = FusedLocationProviderClient.class.getMethod("requestLocationUpdates", LocationRequest.class, PendingIntent.class);
                method2.getClass();
                companion.setRequestLocationUpdatesPendingIntent(method2);
                Method method3 = FusedLocationProviderClient.class.getMethod("removeLocationUpdates", LocationCallback.class);
                method3.getClass();
                companion.setRemoveLocationUpdatesCallback(method3);
                Method method4 = FusedLocationProviderClient.class.getMethod("removeLocationUpdates", PendingIntent.class);
                method4.getClass();
                companion.setRemoveLocationUpdatesPendingIntent(method4);
                Method method5 = FusedLocationProviderClient.class.getMethod("getLastLocation", null);
                method5.getClass();
                ProxyGoogleFusedLocationProviderClient.getLastLocation = method5;
                return true;
            } catch (ClassNotFoundException e4) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required class not found: " + e4.getMessage());
                return false;
            } catch (NoSuchMethodException e14) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required method not found: " + e14.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            } catch (SecurityException e15) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required method not accessible: " + e15.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            }
        }

        private Companion() {
        }
    }

    public final Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        try {
            return (Task) INSTANCE.getRemoveLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, pendingIntent);
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }

    public final Task<Void> requestLocationUpdates(LocationRequest request, PendingIntent pendingIntent) {
        request.getClass();
        pendingIntent.getClass();
        try {
            return (Task) INSTANCE.getRequestLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, request, pendingIntent);
        } catch (Exception e4) {
            return new FailedTask(e4);
        }
    }
}
