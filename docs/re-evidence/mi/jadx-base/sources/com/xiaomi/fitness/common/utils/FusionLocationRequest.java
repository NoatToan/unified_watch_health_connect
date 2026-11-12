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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0018\u001b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/common/utils/FusionLocationRequest;", "Landroid/os/Handler$Callback;", "<init>", "()V", "handler", "Landroid/os/Handler;", "locationManager", "Landroid/location/LocationManager;", "preType", "", "foreignListener", "Lcom/xiaomi/fitness/common/utils/ILocationListener;", "handleMessage", "", "msg", "Landroid/os/Message;", "requestLocation", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "destory", "removeLocationUpdates", "locationListener", "Landroid/location/LocationListener;", "netLocationListener", "com/xiaomi/fitness/common/utils/FusionLocationRequest$netLocationListener$1", "Lcom/xiaomi/fitness/common/utils/FusionLocationRequest$netLocationListener$1;", "gnssLocationListener", "com/xiaomi/fitness/common/utils/FusionLocationRequest$gnssLocationListener$1", "Lcom/xiaomi/fitness/common/utils/FusionLocationRequest$gnssLocationListener$1;", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FusionLocationRequest implements Handler.Callback {
    public static final int GNSS = 1;

    @NotNull
    public static final String LOCATION = "location";
    public static final int NET = 2;
    public static final int NONE = 0;

    @NotNull
    public static final String TAG = "FusionLocationRequest";
    public static final int TIMEOUT = 3;
    public static final long timeout = 8000;

    @Nullable
    private ILocationListener foreignListener;

    @NotNull
    private final FusionLocationRequest$gnssLocationListener$1 gnssLocationListener;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper(), this);

    @NotNull
    private final LocationManager locationManager;

    @NotNull
    private final FusionLocationRequest$netLocationListener$1 netLocationListener;
    private int preType;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.fitness.common.utils.FusionLocationRequest$netLocationListener$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.xiaomi.fitness.common.utils.FusionLocationRequest$gnssLocationListener$1] */
    public FusionLocationRequest() {
        Object systemService = AppUtil.getApp().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (LocationManager) systemService;
        this.netLocationListener = new LocationListener() { // from class: com.xiaomi.fitness.common.utils.FusionLocationRequest$netLocationListener$1
            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                Message messageObtainMessage = this.this$0.handler.obtainMessage();
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                messageObtainMessage.what = 2;
                Bundle bundle = new Bundle();
                bundle.putParcelable("location", new Location(location.getLongitude(), location.getLatitude(), 0.0d, 4, null));
                messageObtainMessage.setData(bundle);
                this.this$0.handler.sendMessage(messageObtainMessage);
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Logger.i(FusionLocationRequest.TAG, "onProviderDisabled , provider:" + provider);
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Logger.i(FusionLocationRequest.TAG, "onProviderEnabled , provider:" + provider);
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String provider, int status, Bundle extras) {
                Logger.i(FusionLocationRequest.TAG, "onStatusChanged , provider:" + provider);
            }
        };
        this.gnssLocationListener = new LocationListener() { // from class: com.xiaomi.fitness.common.utils.FusionLocationRequest$gnssLocationListener$1
            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                Message messageObtainMessage = this.this$0.handler.obtainMessage();
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                messageObtainMessage.what = 1;
                Bundle bundle = new Bundle();
                bundle.putParcelable("location", new Location(location.getLongitude(), location.getLatitude(), 0.0d, 4, null));
                messageObtainMessage.setData(bundle);
                this.this$0.handler.sendMessage(messageObtainMessage);
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }
        };
    }

    public final void destory() {
        this.foreignListener = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == 1) {
            int i2 = this.preType;
            if (i2 == 0 || i2 == 2) {
                Logger.i(TAG, "gnss location success");
                Location location = (Location) msg.getData().getParcelable("location");
                ILocationListener iLocationListener = this.foreignListener;
                if (iLocationListener != null) {
                    iLocationListener.onSuccess(location);
                }
                this.preType = 1;
                this.handler.removeMessages(3);
            }
            removeLocationUpdates(this.gnssLocationListener);
            removeLocationUpdates(this.netLocationListener);
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            ILocationListener iLocationListener2 = this.foreignListener;
            if (iLocationListener2 != null) {
                iLocationListener2.onFail("locate timeout");
            }
            removeLocationUpdates(this.netLocationListener);
            removeLocationUpdates(this.gnssLocationListener);
            return false;
        }
        if (this.preType == 0) {
            Location location2 = (Location) msg.getData().getParcelable("location");
            Logger.i(TAG, "net location success");
            ILocationListener iLocationListener3 = this.foreignListener;
            if (iLocationListener3 != null) {
                iLocationListener3.onSuccess(location2);
            }
            this.preType = 2;
        }
        removeLocationUpdates(this.netLocationListener);
        return false;
    }

    public final void removeLocationUpdates(@NotNull LocationListener locationListener) {
        Intrinsics.checkNotNullParameter(locationListener, "locationListener");
        Logger.d(TAG, "removeLocationUpdates");
        this.locationManager.removeUpdates(locationListener);
    }

    @SuppressLint({"MissingPermission"})
    public final void requestLocation(@NotNull ILocationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logger.i(TAG, "requestLocation");
        this.foreignListener = listener;
        if (!FusionLocationRequestKt.isHasLocationPermission()) {
            Logger.i(TAG, "no location permission");
            return;
        }
        try {
            if (this.locationManager.isProviderEnabled("gps")) {
                this.locationManager.requestLocationUpdates("gps", 500L, 1.0f, this.netLocationListener, Looper.getMainLooper());
            }
        } catch (Exception e) {
            Logger.e(TAG, "gps_provider exception:" + e);
            ILocationListener iLocationListener = this.foreignListener;
            if (iLocationListener != null) {
                iLocationListener.onFail("gps provider exception:" + e);
            }
        }
        try {
            if (this.locationManager.isProviderEnabled("network")) {
                this.locationManager.requestLocationUpdates("network", 500L, 1.0f, this.gnssLocationListener, Looper.getMainLooper());
            }
        } catch (Exception e2) {
            Logger.e(TAG, "net provider exception:" + e2);
            ILocationListener iLocationListener2 = this.foreignListener;
            if (iLocationListener2 != null) {
                iLocationListener2.onFail("net provider exception " + e2);
            }
        }
        this.handler.sendEmptyMessageDelayed(3, timeout);
    }
}
