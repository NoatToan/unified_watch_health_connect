package com.xiaomi.fitness.sport.utils;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/LocationUtil;", "", "<init>", "()V", "provider", "", "TAG", "getLocation", "Landroid/location/Location;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationUtil {

    @NotNull
    public static final LocationUtil INSTANCE = new LocationUtil();

    @NotNull
    public static final String TAG = "LocationUtil";

    @Nullable
    private static String provider;

    private LocationUtil() {
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final Location getLocation() {
        Object systemService = AppUtil.getApp().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        List<String> providers = locationManager.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
        String str = providers.contains("network") ? "network" : "gps";
        provider = str;
        if (!(!StringsKt__StringsKt.isBlank(str))) {
            FitnessLogUtils.i(TAG, "location fail , provider is null");
            return null;
        }
        if (!LocationExtKt.isGpsEnable(AppUtil.getApp()) || !PermissionExtKt.isPermissionGranted(AppUtil.getApp(), "android.permission.ACCESS_FINE_LOCATION")) {
            FitnessLogUtils.i(TAG, "location fail , no permission");
            return null;
        }
        String str2 = provider;
        if (str2 == null) {
            str2 = "";
        }
        return locationManager.getLastKnownLocation(str2);
    }
}
