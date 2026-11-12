package com.xiaomi.hm.health.locweather.location;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/locweather/location/LocationUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "provider", "", "isProviderEnable", "<init>", "()V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class LocationUtils {

    @NotNull
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    @JvmStatic
    public static final boolean isProviderEnable(@NotNull Context context, @NotNull String provider) {
        try {
            android.location.LocationManager locationManager = (android.location.LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                return locationManager.isProviderEnabled(provider);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
