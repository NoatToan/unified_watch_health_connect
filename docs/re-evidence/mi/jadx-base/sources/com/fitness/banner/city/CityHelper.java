package com.fitness.banner.city;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/fitness/banner/city/CityHelper;", "", "<init>", "()V", "TAG", "", "getLastKnownLocation", "Landroid/location/Location;", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityHelper {

    @NotNull
    public static final CityHelper INSTANCE = new CityHelper();

    @NotNull
    private static final String TAG = "CityHelper";

    private CityHelper() {
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final Location getLastKnownLocation() {
        Object systemService = AppUtil.getApp().getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        if (!LocationExtKt.isLocationEnable(AppUtil.getApp())) {
            Logger.i(TAG, "get location fail, isLocationEnable is false");
            return null;
        }
        List<String> providers = locationManager.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
        String str = "network";
        if (!providers.contains("network")) {
            str = "gps";
            if (!providers.contains("gps")) {
                str = "";
            }
        }
        if (!(true ^ StringsKt__StringsKt.isBlank(str))) {
            Logger.i(TAG, "get location fail, provider is null");
            return null;
        }
        if (PermissionExtKt.isPermissionGranted(AppUtil.getApp(), "android.permission.ACCESS_FINE_LOCATION") && PermissionExtKt.isPermissionGranted(AppUtil.getApp(), "android.permission.ACCESS_COARSE_LOCATION")) {
            return locationManager.getLastKnownLocation(str);
        }
        Logger.i(TAG, "get location fail, no permission");
        return null;
    }
}
