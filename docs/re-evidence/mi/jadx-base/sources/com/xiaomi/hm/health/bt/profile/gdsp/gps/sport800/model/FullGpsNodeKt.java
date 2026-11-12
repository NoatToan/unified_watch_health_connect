package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"GPS_SCALE", "", "toGpsPoint", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "timeAnchor", "", "bluetooth_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class FullGpsNodeKt {
    public static final double GPS_SCALE = 3000000.0d;

    @NotNull
    public static final GpsPoint toGpsPoint(@NotNull FullGpsNode fullGpsNode, long j) {
        Intrinsics.checkNotNullParameter(fullGpsNode, "<this>");
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setTime(j + fullGpsNode.getTimeDiff());
        gpsPoint.setLongitude(((double) fullGpsNode.getLng()) / 3000000.0d);
        gpsPoint.setLatitude(((double) fullGpsNode.getLat()) / 3000000.0d);
        return gpsPoint;
    }
}
