package com.mi.health.utils;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;
import com.mi.health.utils.AmapLocation;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocationRequest;
import defpackage.s2b;
import defpackage.t4i;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0012\u001a\u00020\r2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010\u001c\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R=\u0010\u0006\u001a%\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/mi/health/utils/AmapLocation;", "", "<init>", "()V", "mLocationClient", "Lcom/amap/api/location/AMapLocationClient;", "weak", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "Lkotlin/ParameterName;", "name", "location", "", "getWeak", "()Ljava/lang/ref/SoftReference;", "setWeak", "(Ljava/lang/ref/SoftReference;)V", "startLocation", "locationCallback", "locationWeak", "Ljava/lang/ref/WeakReference;", "Lcom/mi/health/utils/AmapLocation$ILocationListener;", "getLocationWeak", "()Ljava/lang/ref/WeakReference;", "setLocationWeak", "(Ljava/lang/ref/WeakReference;)V", "callback", "stopLocation", "Companion", "ILocationListener", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmapLocation {

    @NotNull
    public static final String TAG = "LocationTag";

    @Nullable
    private WeakReference<ILocationListener> locationWeak;

    @Nullable
    private AMapLocationClient mLocationClient = new AMapLocationClient(AppUtil.getApp());

    @Nullable
    private SoftReference<Function1<Location, Unit>> weak;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mi/health/utils/AmapLocation$ILocationListener;", "", "onLocationCallback", "", "location", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ILocationListener {
        void onLocationCallback(@NotNull Location location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLocation$lambda$1(AmapLocation this$0, AMapLocation aMapLocation) {
        Function1<Location, Unit> function1;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int errorCode = aMapLocation.getErrorCode();
        SoftReference<Function1<Location, Unit>> softReference = this$0.weak;
        Logger.d(TAG, "amapLocation:" + aMapLocation + " , code:" + errorCode + " , callback:" + (softReference != null ? softReference.get() : null));
        if (aMapLocation.getErrorCode() == 0) {
            SoftReference<Function1<Location, Unit>> softReference2 = this$0.weak;
            Logger.d(TAG, " inner callback:" + (softReference2 != null ? softReference2.get() : null));
            SoftReference<Function1<Location, Unit>> softReference3 = this$0.weak;
            if (softReference3 != null && (function1 = softReference3.get()) != null) {
                Location location = new Location();
                location.longitude = aMapLocation.getLongitude();
                location.latitude = aMapLocation.getLatitude();
                function1.invoke2(location);
            }
        }
        this$0.stopLocation();
    }

    @Nullable
    public final WeakReference<ILocationListener> getLocationWeak() {
        return this.locationWeak;
    }

    @Nullable
    public final SoftReference<Function1<Location, Unit>> getWeak() {
        return this.weak;
    }

    public final void setLocationWeak(@Nullable WeakReference<ILocationListener> weakReference) {
        this.locationWeak = weakReference;
    }

    public final void setWeak(@Nullable SoftReference<Function1<Location, Unit>> softReference) {
        this.weak = softReference;
    }

    public final void startLocation(@NotNull Function1<? super Location, Unit> locationCallback) {
        Intrinsics.checkNotNullParameter(locationCallback, "locationCallback");
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        SoftReference<Function1<Location, Unit>> softReference = new SoftReference<>(locationCallback);
        this.weak = softReference;
        Logger.d(TAG, "callback:" + softReference.get());
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.startLocation();
        }
        AMapLocationClient aMapLocationClient2 = this.mLocationClient;
        if (aMapLocationClient2 != null) {
            aMapLocationClient2.setLocationListener(new AMapLocationListener() { // from class: a71
                @Override // com.amap.api.location.AMapLocationListener
                public final void onLocationChanged(AMapLocation aMapLocation) {
                    AmapLocation.startLocation$lambda$1(this.f699a, aMapLocation);
                }
            });
        }
    }

    public final void stopLocation() {
        Logger.i(TAG, "AmapLocation stopLocation");
        AMapLocationClient aMapLocationClient = this.mLocationClient;
        if (aMapLocationClient != null) {
            aMapLocationClient.stopLocation();
        }
        AMapLocationClient aMapLocationClient2 = this.mLocationClient;
        if (aMapLocationClient2 != null) {
            aMapLocationClient2.setLocationListener(null);
        }
        AMapLocationClient aMapLocationClient3 = this.mLocationClient;
        if (aMapLocationClient3 != null) {
            aMapLocationClient3.onDestroy();
        }
        this.mLocationClient = null;
    }

    public final void startLocation(@NotNull ILocationListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        WeakReference<ILocationListener> weakReference = new WeakReference<>(callback);
        this.locationWeak = weakReference;
        Logger.d(TAG, "startLocation , callback:" + weakReference.get() + " , locationWeak:" + this.locationWeak);
        new LocationRequest().requestLocation("NET", new com.xiaomi.fitness.common.utils.ILocationListener() { // from class: com.mi.health.utils.AmapLocation.startLocation.2
            @Override // com.xiaomi.fitness.common.utils.ILocationListener
            public void onFail(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Logger.d(AmapLocation.TAG, "locate fail");
            }

            @Override // com.xiaomi.fitness.common.utils.ILocationListener
            public void onSuccess(com.xiaomi.fitness.common.utils.Location location) {
                ILocationListener iLocationListener;
                if (location != null) {
                    Logger.d(AmapLocation.TAG, "lon:" + location.getLon() + ",lat:" + location.getLat());
                    s2b s2bVarB = t4i.b(location.getLat(), location.getLon());
                    WeakReference<ILocationListener> locationWeak = AmapLocation.this.getLocationWeak();
                    if (locationWeak == null || (iLocationListener = locationWeak.get()) == null) {
                        return;
                    }
                    Location location2 = new Location();
                    location2.longitude = s2bVarB.f33204b;
                    location2.latitude = s2bVarB.f33203a;
                    iLocationListener.onLocationCallback(location2);
                }
            }
        });
    }
}
