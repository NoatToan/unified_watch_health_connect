package com.huami.moving.datacenter.filter;

import com.huami.core.device.feature.gps.filter.GpsPointWrapper;
import com.huami.core.device.feature.gps.filter.PointDataTypeUtil;
import com.huami.nfc.web.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/moving/datacenter/filter/GpsWrapper;", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "", "altitude", Constant.KEY_LATITUDE, Constant.KEY_LONGITUDE, "pace", "", "state", "time", "Lcom/huami/moving/datacenter/filter/GpsFilterPoint;", "a", "Lcom/huami/moving/datacenter/filter/GpsFilterPoint;", "point", "<init>", "(Lcom/huami/moving/datacenter/filter/GpsFilterPoint;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GpsWrapper implements GpsPointWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GpsFilterPoint point;

    public GpsWrapper(@NotNull GpsFilterPoint gpsFilterPoint) {
        this.point = gpsFilterPoint;
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int altitude() {
        return this.point.getAltitude();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int latitude() {
        return PointDataTypeUtil.INSTANCE.encodeValue(this.point.getLatitude());
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int longitude() {
        return PointDataTypeUtil.INSTANCE.encodeValue(this.point.getLongitude());
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int pace() {
        return this.point.getPace();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public short state() {
        return this.point.getState();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int time() {
        return this.point.getTime();
    }
}
