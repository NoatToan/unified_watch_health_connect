package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/FullGpsNode;", "", "timeAnchor", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "toGpsPoint", "", "GPS_SCALE", LogUtil.D, "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class FullGpsNodeKt {
    public static final double GPS_SCALE = 3000000.0d;

    @NotNull
    public static final GpsPoint toGpsPoint(@NotNull FullGpsNode fullGpsNode, long j) {
        GpsPoint gpsPoint = new GpsPoint();
        gpsPoint.setTime(j + fullGpsNode.getTimeDiff());
        gpsPoint.setLongitude(((double) fullGpsNode.getLng()) / 3000000.0d);
        gpsPoint.setLatitude(((double) fullGpsNode.getLat()) / 3000000.0d);
        return gpsPoint;
    }
}
