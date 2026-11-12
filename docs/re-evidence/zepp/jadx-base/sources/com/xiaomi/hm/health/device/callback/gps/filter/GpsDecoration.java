package com.xiaomi.hm.health.device.callback.gps.filter;

import com.huami.core.device.feature.gps.filter.GpsPointWrapper;
import com.huami.nfc.web.Constant;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/callback/gps/filter/GpsDecoration;", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "", "altitude", Constant.KEY_LATITUDE, Constant.KEY_LONGITUDE, "pace", "", "state", "time", "", "toString", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "getPoint", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "point", "", "b", "J", "firstTime", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;J)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsDecoration implements GpsPointWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float c = 3000000.0f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final GpsPoint point;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long firstTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/callback/gps/filter/GpsDecoration$Companion;", "", "", "value", "", "a", "b", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "source", "", "firstTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsPoint;", "convertToGpsPoint", "", "pointValueFormatterMut", "F", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(double value) {
            return (int) (value * ((double) GpsDecoration.c));
        }

        private final double b(int value) {
            return ((double) value) / ((double) GpsDecoration.c);
        }

        @NotNull
        public final GpsPoint convertToGpsPoint(@NotNull GpsPointWrapper source, long firstTime) {
            GpsPoint gpsPoint = new GpsPoint();
            gpsPoint.setAltitude(b(source.altitude()));
            gpsPoint.setLatitude(b(source.latitude()));
            gpsPoint.setLongitude(b(source.longitude()));
            gpsPoint.setPace(source.pace());
            gpsPoint.setTime(((long) source.time()) + firstTime);
            gpsPoint.setState(source.state());
            HMLog.d("GpsFilterHelper", "data --> " + gpsPoint, new Object[0]);
            return gpsPoint;
        }
    }

    public GpsDecoration(@NotNull GpsPoint gpsPoint, long j) {
        this.point = gpsPoint;
        this.firstTime = j;
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int altitude() {
        return INSTANCE.a(this.point.getAltitude());
    }

    @NotNull
    public final GpsPoint getPoint() {
        return this.point;
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int latitude() {
        return INSTANCE.a(this.point.getLatitude());
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int longitude() {
        return INSTANCE.a(this.point.getLongitude());
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int pace() {
        return this.point.getPace();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public short state() {
        return (short) this.point.getState();
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointWrapper
    public int time() {
        return (int) this.point.getTime();
    }

    @NotNull
    public String toString() {
        return "GpsDecoration(point=" + this.point + ")";
    }
}
