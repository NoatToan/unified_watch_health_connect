package com.huami.core.device.feature.gps.filter;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.web.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001a¨\u0006)"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/GpsPoint;", "", "", "component1", "component2", "component3", "component4", "", "component5", "component6", "time", Constant.KEY_LATITUDE, Constant.KEY_LONGITUDE, "altitude", "state", "pace", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getTime", "()I", "b", "getLatitude", "c", "getLongitude", GoogleApiAvailabilityLight.a, "getAltitude", "e", ExifInterface.LATITUDE_SOUTH, "getState", "()S", "f", "getPace", "<init>", "(IIIISI)V", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class GpsPoint {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int latitude;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int longitude;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int altitude;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final short state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int pace;

    public GpsPoint(int i, int i2, int i3, int i4, short s, int i5) {
        this.time = i;
        this.latitude = i2;
        this.longitude = i3;
        this.altitude = i4;
        this.state = s;
        this.pace = i5;
    }

    public static /* synthetic */ GpsPoint copy$default(GpsPoint gpsPoint, int i, int i2, int i3, int i4, short s, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = gpsPoint.time;
        }
        if ((i6 & 2) != 0) {
            i2 = gpsPoint.latitude;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = gpsPoint.longitude;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = gpsPoint.altitude;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            s = gpsPoint.state;
        }
        short s2 = s;
        if ((i6 & 32) != 0) {
            i5 = gpsPoint.pace;
        }
        return gpsPoint.copy(i, i7, i8, i9, s2, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final short getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPace() {
        return this.pace;
    }

    @NotNull
    public final GpsPoint copy(int time, int latitude, int longitude, int altitude, short state, int pace) {
        return new GpsPoint(time, latitude, longitude, altitude, state, pace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsPoint)) {
            return false;
        }
        GpsPoint gpsPoint = (GpsPoint) other;
        return this.time == gpsPoint.time && this.latitude == gpsPoint.latitude && this.longitude == gpsPoint.longitude && this.altitude == gpsPoint.altitude && this.state == gpsPoint.state && this.pace == gpsPoint.pace;
    }

    public final int getAltitude() {
        return this.altitude;
    }

    public final int getLatitude() {
        return this.latitude;
    }

    public final int getLongitude() {
        return this.longitude;
    }

    public final int getPace() {
        return this.pace;
    }

    public final short getState() {
        return this.state;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((((((this.time * 31) + this.latitude) * 31) + this.longitude) * 31) + this.altitude) * 31) + this.state) * 31) + this.pace;
    }

    @NotNull
    public String toString() {
        return "GpsPoint(time=" + this.time + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", state=" + ((int) this.state) + ", pace=" + this.pace + ")";
    }
}
