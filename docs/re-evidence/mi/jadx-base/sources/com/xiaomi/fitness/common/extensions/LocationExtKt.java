package com.xiaomi.fitness.common.extensions;

import android.content.Context;
import android.location.LocationManager;
import com.xiaomi.fitness.common.utils.UIUtils;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"isGpsEnable", "", "Landroid/content/Context;", "supportsOutdoorSportPositionService", "isLocationEnable", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocationExtKt {
    public static final boolean isGpsEnable(@NotNull Context context) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(Boolean.valueOf(locationManager.isProviderEnabled("gps")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        Boolean bool = (Boolean) objM886constructorimpl;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isLocationEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        try {
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean supportsOutdoorSportPositionService(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return UIUtils.INSTANCE.isTablet(context) ? isLocationEnable(context) : isGpsEnable(context);
    }
}
