package com.mapbox.common.location;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.MapboxCommonLogger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class GoogleDeviceLocationProvider$getLastLocation$1$1 extends w implements e23.a<Unit> {
    final /* synthetic */ GetLocationCallback $callback;
    final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable $cancelable;
    final /* synthetic */ Task<android.location.Location> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceLocationProvider$getLastLocation$1$1(Task<android.location.Location> task, BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback) {
        super(0);
        this.$it = task;
        this.$cancelable = locationCancelable;
        this.$callback = getLocationCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, android.location.Location location) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1$1$1(getLocationCallback, location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1$2$1(getLocationCallback));
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        android.location.Location result;
        if (this.$it.isCanceled()) {
            MapboxCommonLogger.INSTANCE.logW$common_release("GoogleDeviceLocationProvider", "The operation to get last location from GoogleFusedLocationProvider was cancelled.");
        } else if (!this.$it.isSuccessful() || (result = this.$it.getResult()) == null) {
            new Handler(Looper.getMainLooper()).post(new d(0, this.$cancelable, this.$callback));
        } else {
            new Handler(Looper.getMainLooper()).post(new c(this.$cancelable, this.$callback, result, 0));
        }
    }

    @Override // e23.a
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
