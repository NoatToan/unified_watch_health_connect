package com.xiaomi.fitness.route.track.utils;

import com.amap.api.maps.model.LatLng;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.sport.Location;
import defpackage.bxa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J&\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/AMapPathUtils;", "", "<init>", "()V", "createLatLng", "Lcom/amap/api/maps/model/LatLng;", "location", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "createLatLngList", "", "locationList", "EARTH_RADIUS", "", "rad", PluginDeviceInfo.FICONOFF, "getDistance", "lon1", "lat1", "lon2", "lat2", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AMapPathUtils {
    private static final double EARTH_RADIUS = 6371000.0d;

    @NotNull
    public static final AMapPathUtils INSTANCE = new AMapPathUtils();

    private AMapPathUtils() {
    }

    private final double rad(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    @NotNull
    public final LatLng createLatLng(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        double[] dArrC = bxa.c(location.latitude, location.longitude);
        return new LatLng(dArrC[0], dArrC[1]);
    }

    @NotNull
    public final List<LatLng> createLatLngList(@Nullable List<? extends Location> locationList) {
        ArrayList arrayList = new ArrayList();
        if (locationList != null && !locationList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = locationList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(createLatLng(locationList.get(i)));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final double getDistance(double lon1, double lat1, double lon2, double lat2) {
        double dRad = rad(lat1);
        double dRad2 = rad(lat2);
        double dRad3 = rad(lon1) - rad(lon2);
        double d = 2;
        return Math.round(((d * Math.asin(Math.sqrt(Math.pow(Math.sin((dRad - dRad2) / d), 2.0d) + ((Math.cos(dRad) * Math.cos(dRad2)) * Math.pow(Math.sin(dRad3 / d), 2.0d))))) * EARTH_RADIUS) * ((double) 10000)) / ((long) 10000);
    }
}
