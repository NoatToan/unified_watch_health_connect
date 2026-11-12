package com.huami.watch.dataflow.sync.gps.filter;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.web.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006,"}, d2 = {"Lcom/huami/watch/dataflow/sync/gps/filter/GpsFilterPoint;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "state", "pace", "time", "altitude", Constant.KEY_LATITUDE, Constant.KEY_LONGITUDE, "copy", "", "toString", "hashCode", "other", "", "equals", "a", ExifInterface.LATITUDE_SOUTH, "getState", "()S", "b", LogUtil.I, "getPace", "()I", "c", "getTime", GoogleApiAvailabilityLight.a, "getAltitude", "e", LogUtil.D, "getLatitude", "()D", "f", "getLongitude", "<init>", "(SIIIDD)V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class GpsFilterPoint {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final short state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int pace;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int altitude;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final double latitude;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final double longitude;

    public GpsFilterPoint(short s, int i, int i2, int i3, double d, double d2) {
        this.state = s;
        this.pace = i;
        this.time = i2;
        this.altitude = i3;
        this.latitude = d;
        this.longitude = d2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPace() {
        return this.pace;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final GpsFilterPoint copy(short state, int pace, int time, int altitude, double latitude, double longitude) {
        return new GpsFilterPoint(state, pace, time, altitude, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            if (other instanceof GpsFilterPoint) {
                GpsFilterPoint gpsFilterPoint = (GpsFilterPoint) other;
                if (this.state == gpsFilterPoint.state) {
                    if (this.pace == gpsFilterPoint.pace) {
                        if (this.time == gpsFilterPoint.time) {
                            if (!(this.altitude == gpsFilterPoint.altitude) || Double.compare(this.latitude, gpsFilterPoint.latitude) != 0 || Double.compare(this.longitude, gpsFilterPoint.longitude) != 0) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getAltitude() {
        return this.altitude;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
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
        int i = ((((((this.state * 31) + this.pace) * 31) + this.time) * 31) + this.altitude) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i2 = (i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return i2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "GpsFilterPoint(state=" + ((int) this.state) + ", pace=" + this.pace + ", time=" + this.time + ", altitude=" + this.altitude + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
