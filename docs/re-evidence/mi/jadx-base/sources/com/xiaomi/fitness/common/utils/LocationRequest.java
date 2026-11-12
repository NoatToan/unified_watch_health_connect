package com.xiaomi.fitness.common.utils;

import android.annotation.SuppressLint;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.ni4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0011\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0007J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/common/utils/LocationRequest;", "Landroid/os/Handler$Callback;", "<init>", "()V", "handler", "Landroid/os/Handler;", "locationManager", "Landroid/location/LocationManager;", "foreignListener", "Lcom/xiaomi/fitness/common/utils/ILocationListener;", "hasLocateSuccess", "", "getHasLocateSuccess", "()Z", "setHasLocateSuccess", "(Z)V", "locationListener", "com/xiaomi/fitness/common/utils/LocationRequest$locationListener$1", "Lcom/xiaomi/fitness/common/utils/LocationRequest$locationListener$1;", "requestLocation", "", "provider", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "handleMessage", "msg", "Landroid/os/Message;", "isHasLocationPermission", "removeLocationUpdates", "Landroid/location/LocationListener;", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationRequest implements Handler.Callback {
    public static final int FAIL = 2;

    @NotNull
    public static final String LOCATION = "location";
    public static final int SUCCESS = 1;

    @NotNull
    public static final String TAG = "LocationRequest";
    public static final long timeout = 15000;

    @Nullable
    private ILocationListener foreignListener;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper(), this);
    private boolean hasLocateSuccess;

    @NotNull
    private final LocationRequest$locationListener$1 locationListener;

    @NotNull
    private final LocationManager locationManager;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.fitness.common.utils.LocationRequest$locationListener$1] */
    public LocationRequest() {
        Object systemService = AppUtil.getApp().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (LocationManager) systemService;
        this.locationListener = new LocationListener() { // from class: com.xiaomi.fitness.common.utils.LocationRequest$locationListener$1
            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                Logger.i(LocationRequest.TAG, "LocationRequest SUCCESS");
                if (!this.this$0.getHasLocateSuccess()) {
                    this.this$0.setHasLocateSuccess(true);
                    ILocationListener iLocationListener = this.this$0.foreignListener;
                    if (iLocationListener != null) {
                        iLocationListener.onSuccess(new Location(location.getLongitude(), location.getLatitude(), location.getAltitude()));
                    }
                }
                this.this$0.removeLocationUpdates(this);
                this.this$0.handler.removeMessages(2);
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Logger.i(LocationRequest.TAG, "onProviderDisabled , provider:" + provider);
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Logger.i(LocationRequest.TAG, "onProviderEnabled , provider:" + provider);
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String provider, int status, Bundle extras) {
                Logger.i(LocationRequest.TAG, "onStatusChanged , provider:" + provider);
            }
        };
    }

    private final boolean isHasLocationPermission() {
        return ni4.a(AppUtil.getApp(), "android.permission.ACCESS_FINE_LOCATION") == 0 && ni4.a(AppUtil.getApp(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public final boolean getHasLocateSuccess() {
        return this.hasLocateSuccess;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 2) {
            return false;
        }
        if (!this.hasLocateSuccess) {
            this.hasLocateSuccess = true;
            Logger.i(TAG, "LocationRequest FAIL");
            ILocationListener iLocationListener = this.foreignListener;
            if (iLocationListener != null) {
                iLocationListener.onFail("fail");
            }
        }
        removeLocationUpdates(this.locationListener);
        return false;
    }

    public final void removeLocationUpdates(@NotNull LocationListener locationListener) {
        Intrinsics.checkNotNullParameter(locationListener, "locationListener");
        Logger.d(TAG, "removeLocationUpdates");
        this.locationManager.removeUpdates(locationListener);
    }

    @SuppressLint({"MissingPermission"})
    public final void requestLocation(@NotNull String provider, @NotNull ILocationListener listener) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.foreignListener = listener;
        String str = Intrinsics.areEqual(provider, "NET") ? "network" : "gps";
        if (!isHasLocationPermission()) {
            Logger.i(TAG, "no location permission");
            return;
        }
        try {
            this.locationManager.requestLocationUpdates(str, 500L, 1.0f, this.locationListener, Looper.getMainLooper());
            this.handler.sendEmptyMessageDelayed(2, 15000L);
        } catch (Exception e) {
            Logger.e(TAG, "Exception:" + e);
            ILocationListener iLocationListener = this.foreignListener;
            if (iLocationListener != null) {
                iLocationListener.onFail(String.valueOf(e));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void setHasLocateSuccess(boolean z) {
        this.hasLocateSuccess = z;
    }
}
