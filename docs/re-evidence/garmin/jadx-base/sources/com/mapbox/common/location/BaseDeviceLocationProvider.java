package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxCommonLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.l;
import o13.m;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b \u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0004@ABCB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010\u000bR\u001b\u00103\u001a\u00020\u00178DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00105\u001a\u0002048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010?\u001a\u00020;8&X§\u0004¢\u0006\f\u0012\u0004\b>\u0010\u000b\u001a\u0004\b<\u0010=¨\u0006D"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "Lcom/mapbox/common/location/BaseLocationProvider;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/common/location/LocationProviderRequest;", "request", "<init>", "(Landroid/content/Context;Lcom/mapbox/common/location/LocationProviderRequest;)V", "", "doStart", "()V", "doStop", TtmlNode.START, "stop", "Lcom/mapbox/common/location/LocationObserver;", "observer", "addLocationObserver", "(Lcom/mapbox/common/location/LocationObserver;)V", "Landroid/os/Looper;", "looper", "(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V", "removeLocationObserver", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "requestLocationUpdates", "(Landroid/app/PendingIntent;)V", "removeLocationUpdates", "Landroid/content/Intent;", "intent", "", "Lcom/mapbox/common/location/Location;", "extractResult", "(Landroid/content/Intent;)Ljava/util/List;", "locations", "notifyLocationUpdate", "(Ljava/util/List;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/mapbox/common/location/LocationProviderRequest;", "getRequest", "()Lcom/mapbox/common/location/LocationProviderRequest;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;", "getState$annotations", "locationUpdatePendingIntent$delegate", "Lo13/l;", "getLocationUpdatePendingIntent", "()Landroid/app/PendingIntent;", "locationUpdatePendingIntent", "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "currentMode", "Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "getCurrentMode", "()Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "setCurrentMode", "(Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;)V", "", "getPersistentId", "()I", "getPersistentId$annotations", "persistentId", "Companion", "DeviceLocationProviderMode", "DeviceLocationProviderState", "LocationCancelable", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseDeviceLocationProvider extends BaseLocationProvider implements DeviceLocationProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "DeviceLocationProvider";
    private final Context context;
    private DeviceLocationProviderMode currentMode;

    /* JADX INFO: renamed from: locationUpdatePendingIntent$delegate, reason: from kotlin metadata */
    private final l locationUpdatePendingIntent;
    private final LocationProviderRequest request;
    public DeviceLocationProviderState state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderMode;", "", "(Ljava/lang/String;I)V", "NONE", "CALLBACK", "PENDING_INTENT", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceLocationProviderMode {
        NONE,
        CALLBACK,
        PENDING_INTENT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$DeviceLocationProviderState;", "", "(Ljava/lang/String;I)V", "STOPPED", "STOPPING", "STARTED", "STARTING", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceLocationProviderState {
        STOPPED,
        STOPPING,
        STARTED,
        STARTING
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$LocationCancelable;", "Lcom/mapbox/common/Cancelable;", "<init>", "(Lcom/mapbox/common/location/BaseDeviceLocationProvider;)V", "", "cancel", "()V", "Lkotlin/Function0;", "cb", "invokeIfNotCanceled", "(Le23/a;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCanceled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class LocationCancelable implements Cancelable {
        private final AtomicBoolean isCanceled = new AtomicBoolean(false);

        public LocationCancelable() {
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.isCanceled.set(true);
        }

        public final void invokeIfNotCanceled(e23.a<Unit> cb3) {
            cb3.getClass();
            if (this.isCanceled.get()) {
                MapboxCommonLogger.INSTANCE.logW$common_release(LocationServiceImpl.TAG, "Operation to get last location was canceled");
            } else {
                cb3.invoke();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceLocationProviderState.values().length];
            try {
                iArr[DeviceLocationProviderState.STARTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceLocationProviderState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest) {
        context.getClass();
        this.context = context;
        this.request = locationProviderRequest;
        this.state = DeviceLocationProviderState.STOPPED;
        this.locationUpdatePendingIntent = m.b(new BaseDeviceLocationProvider$locationUpdatePendingIntent$2(this));
        this.currentMode = DeviceLocationProviderMode.NONE;
    }

    public static /* synthetic */ void getPersistentId$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void addLocationObserver(LocationObserver observer, Looper looper) {
        observer.getClass();
        looper.getClass();
        super.addLocationObserver(observer, looper);
        start();
    }

    public abstract void doStart();

    public abstract void doStop();

    public abstract List<Location> extractResult(Intent intent);

    public final Context getContext() {
        return this.context;
    }

    public final DeviceLocationProviderMode getCurrentMode() {
        return this.currentMode;
    }

    public final PendingIntent getLocationUpdatePendingIntent() {
        Object value = this.locationUpdatePendingIntent.getValue();
        value.getClass();
        return (PendingIntent) value;
    }

    public String getName() {
        return DeviceLocationProvider.DefaultImpls.getName(this);
    }

    public abstract int getPersistentId();

    public final LocationProviderRequest getRequest() {
        return this.request;
    }

    @Override // com.mapbox.common.location.BaseLocationProvider
    public synchronized void notifyLocationUpdate(List<? extends Location> locations) {
        locations.getClass();
        if (this.state == DeviceLocationProviderState.STARTED) {
            super.notifyLocationUpdate(locations);
        }
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void removeLocationObserver(LocationObserver observer) {
        observer.getClass();
        super.removeLocationObserver(observer);
        if (getObservers().isEmpty()) {
            stop();
        }
    }

    public abstract void removeLocationUpdates(PendingIntent pendingIntent);

    public abstract void requestLocationUpdates(PendingIntent pendingIntent);

    public final void setCurrentMode(DeviceLocationProviderMode deviceLocationProviderMode) {
        deviceLocationProviderMode.getClass();
        this.currentMode = deviceLocationProviderMode;
    }

    public final void start() {
        Object bVar;
        try {
            int i14 = q.f128596b;
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            mapboxCommonLogger.logD$common_release(TAG, "Start called for " + this);
            int i15 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i15 == 1 || i15 == 2) {
                mapboxCommonLogger.logW$common_release(TAG, "Skipping request to start: state == " + this.state);
            } else if (i15 == 3 || i15 == 4) {
                this.state = DeviceLocationProviderState.STARTING;
                doStart();
            }
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i16 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to start: " + thB);
            this.state = DeviceLocationProviderState.STOPPED;
        }
    }

    public final synchronized void stop() {
        Object bVar;
        try {
            int i14 = q.f128596b;
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            mapboxCommonLogger.logD$common_release(TAG, "Stop called for " + this);
            int i15 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i15 == 1 || i15 == 2) {
                this.state = DeviceLocationProviderState.STOPPING;
                doStop();
            } else if (i15 == 3 || i15 == 4) {
                mapboxCommonLogger.logW$common_release(TAG, "Skipping request to stop: state == " + this.state);
            }
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i16 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to stop: " + thB);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/location/BaseDeviceLocationProvider$Companion;", "", "()V", "TAG", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public synchronized void addLocationObserver(LocationObserver observer) {
        observer.getClass();
        super.addLocationObserver(observer);
        start();
    }
}
