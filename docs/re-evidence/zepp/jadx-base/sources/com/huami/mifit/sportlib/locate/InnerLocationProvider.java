package com.huami.mifit.sportlib.locate;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.mifit.sportlib.LocationListener;
import com.huami.mifit.sportlib.LocationProvider;
import com.huami.mifit.sportlib.locate.InnerLocationProvider;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/mifit/sportlib/locate/InnerLocationProvider;", "Lcom/huami/mifit/sportlib/LocationProvider$Stub;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "e", "Lcom/huami/mifit/sportlib/locate/ILocationMonitor;", GoogleApiAvailabilityLight.a, "Lcom/huami/mifit/sportlib/LocationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "f", "startLocation", "stopLocation", "Lcom/huami/mifit/sportlib/locate/ILocationInfoListener;", "locationInfoListener", "startOrInitLocationMonitorFromDevice", "", "key", "releaseLocationByMonitor", "Landroid/content/Context;", "Lcom/huami/mifit/sportlib/locate/ILocationMonitor;", "locationMonitor", "<init>", "(Landroid/content/Context;)V", "Companion", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final class InnerLocationProvider extends LocationProvider.Stub {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LISTENER_KEY_FOR_DEVICE = "device-sport";

    @NotNull
    private static final String f = "sport-service";

    @NotNull
    private static final String g = "InnerLocationProvider";

    @Nullable
    private static volatile InnerLocationProvider h;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ILocationMonitor locationMonitor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/mifit/sportlib/locate/InnerLocationProvider$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/mifit/sportlib/locate/InnerLocationProvider;", "getInstance", "", "deinit", DefaultSettingsSpiCall.n, "Lcom/huami/mifit/sportlib/locate/InnerLocationProvider;", "()Lcom/huami/mifit/sportlib/locate/InnerLocationProvider;", "setInstance", "(Lcom/huami/mifit/sportlib/locate/InnerLocationProvider;)V", "", "LISTENER_KEY_FOR_APP_SPORT", "Ljava/lang/String;", "LISTENER_KEY_FOR_DEVICE", "TAG", "<init>", "()V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deinit() {
            setInstance(null);
        }

        @Nullable
        public final InnerLocationProvider getInstance() {
            return InnerLocationProvider.h;
        }

        public final void setInstance(@Nullable InnerLocationProvider innerLocationProvider) {
            InnerLocationProvider.h = innerLocationProvider;
        }

        @NotNull
        public final InnerLocationProvider getInstance(@NotNull Context context) {
            if (getInstance() == null) {
                synchronized (Reflection.getOrCreateKotlinClass(InnerLocationProvider.class)) {
                    Companion companion = InnerLocationProvider.INSTANCE;
                    if (companion.getInstance() == null) {
                        companion.setInstance(new InnerLocationProvider(context.getApplicationContext()));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return getInstance();
        }
    }

    public InnerLocationProvider(@NotNull Context context) {
        this.context = context;
    }

    private final ILocationMonitor d() {
        LogKit.w2f(g, "initLocationMonitor");
        return RunnerData.getRunner().isMainlandUser() ? AmapLocationMonitor.getInstance(this.context) : GPSLocationMonitor.getInstance(this.context);
    }

    private final boolean e(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    private final void f(final LocationListener listener) {
        LogKit.w2f(g, "startLocationByMonitor");
        ILocationMonitor iLocationMonitor = this.locationMonitor;
        if (iLocationMonitor == null) {
            return;
        }
        if (!iLocationMonitor.hasRegisterLocationListener(f)) {
            iLocationMonitor.registerLocationListener(f, new ILocationInfoListener() { // from class: lf4
                @Override // com.huami.mifit.sportlib.locate.ILocationInfoListener
                public final void onLocationChanged(Location location) throws RemoteException {
                    InnerLocationProvider.g(listener, location);
                }
            });
        }
        LogKit.w2f(g, "try requestLocation");
        iLocationMonitor.requestLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(LocationListener locationListener, Location location) throws RemoteException {
        if (locationListener == null) {
            return;
        }
        locationListener.onLocationChanged(location);
    }

    public final void releaseLocationByMonitor(@NotNull String key) {
        LogKit.w2f(g, "releaseLocationByMonitor");
        ILocationMonitor iLocationMonitor = this.locationMonitor;
        if (iLocationMonitor == null) {
            return;
        }
        LogKit.w2f(g, "releaseLocation");
        iLocationMonitor.releaseLocation();
        iLocationMonitor.unregisterLocationListener(key);
    }

    @Override // com.huami.mifit.sportlib.LocationProvider
    public void startLocation(@Nullable LocationListener listener) {
        LogKit.w2f(g, "startLocation");
        if (this.locationMonitor == null) {
            this.locationMonitor = d();
        }
        f(listener);
    }

    public final void startOrInitLocationMonitorFromDevice(@NotNull ILocationInfoListener locationInfoListener) {
        if (this.locationMonitor == null) {
            this.locationMonitor = d();
        }
        ILocationMonitor iLocationMonitor = this.locationMonitor;
        if (iLocationMonitor == null) {
            return;
        }
        if (!iLocationMonitor.hasRegisterLocationListener(LISTENER_KEY_FOR_DEVICE)) {
            iLocationMonitor.registerLocationListener(LISTENER_KEY_FOR_DEVICE, locationInfoListener);
        }
        iLocationMonitor.requestLocation();
    }

    @Override // com.huami.mifit.sportlib.LocationProvider
    public void stopLocation() {
        LogKit.w2f(g, "stopLocation");
        if (this.locationMonitor == null) {
            return;
        }
        releaseLocationByMonitor(f);
    }
}
