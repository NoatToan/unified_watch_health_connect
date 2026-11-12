package com.mapbox.common.location;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/location/LocationManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class AndroidDeviceLocationProvider$locationManager$2 extends w implements e23.a<LocationManager> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDeviceLocationProvider$locationManager$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final LocationManager invoke() {
        Object systemService = this.$context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        systemService.getClass();
        return (LocationManager) systemService;
    }
}
