package com.huami.core.device.feature.gps.filter.internal;

import com.huami.core.device.feature.gps.filter.GpsPoint;
import com.huami.core.device.feature.gps.filter.GpsPointWrapper;
import com.huami.nfc.web.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/internal/GpsPointConverter;", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "", "time", Constant.KEY_LATITUDE, Constant.KEY_LONGITUDE, "altitude", "", "state", "pace", "Lcom/huami/core/device/feature/gps/filter/GpsPoint;", "a", "Lcom/huami/core/device/feature/gps/filter/GpsPoint;", "gpsPoint", "<init>", "(Lcom/huami/core/device/feature/gps/filter/GpsPoint;)V", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public final class GpsPointConverter implements GpsPointWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final GpsPoint gpsPoint;

    public GpsPointConverter(@NotNull GpsPoint gpsPoint) {
        this.gpsPoint = gpsPoint;
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int altitude() {
        return this.gpsPoint.getAltitude();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int latitude() {
        return this.gpsPoint.getLatitude();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int longitude() {
        return this.gpsPoint.getLongitude();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int pace() {
        return this.gpsPoint.getPace();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public short state() {
        return this.gpsPoint.getState();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int time() {
        return this.gpsPoint.getTime();
    }
}
