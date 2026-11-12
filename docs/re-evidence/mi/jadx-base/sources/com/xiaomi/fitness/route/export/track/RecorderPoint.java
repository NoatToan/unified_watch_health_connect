package com.xiaomi.fitness.route.export.track;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003Jw\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/RecorderPoint;", "", "no", "", "lon", "lat", "ele", "", "type", "cumulativeIncrease", "cumulativeDecrease", StepsInfo.KEY_DISTANCE, "originalLon", "originalLat", "flagSegment", "", "<init>", "(IIIDIDDIDDZ)V", "getNo", "()I", "getLon", "getLat", "getEle", "()D", "setEle", "(D)V", "getType", "setType", "(I)V", "getCumulativeIncrease", "getCumulativeDecrease", "getDis", "getOriginalLon", "getOriginalLat", "getFlagSegment", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecorderPoint {
    private final double cumulativeDecrease;
    private final double cumulativeIncrease;
    private final int dis;
    private double ele;
    private final boolean flagSegment;
    private final int lat;
    private final int lon;
    private final int no;
    private final double originalLat;
    private final double originalLon;
    private int type;

    public RecorderPoint() {
        this(0, 0, 0, 0.0d, 0, 0.0d, 0.0d, 0, 0.0d, 0.0d, false, 2047, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNo() {
        return this.no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getOriginalLat() {
        return this.originalLat;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getFlagSegment() {
        return this.flagSegment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLon() {
        return this.lon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getEle() {
        return this.ele;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getCumulativeIncrease() {
        return this.cumulativeIncrease;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getCumulativeDecrease() {
        return this.cumulativeDecrease;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDis() {
        return this.dis;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getOriginalLon() {
        return this.originalLon;
    }

    @NotNull
    public final RecorderPoint copy(int no2, int lon, int lat, double ele, int type, double cumulativeIncrease, double cumulativeDecrease, int dis, double originalLon, double originalLat, boolean flagSegment) {
        return new RecorderPoint(no2, lon, lat, ele, type, cumulativeIncrease, cumulativeDecrease, dis, originalLon, originalLat, flagSegment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecorderPoint)) {
            return false;
        }
        RecorderPoint recorderPoint = (RecorderPoint) other;
        return this.no == recorderPoint.no && this.lon == recorderPoint.lon && this.lat == recorderPoint.lat && Double.compare(this.ele, recorderPoint.ele) == 0 && this.type == recorderPoint.type && Double.compare(this.cumulativeIncrease, recorderPoint.cumulativeIncrease) == 0 && Double.compare(this.cumulativeDecrease, recorderPoint.cumulativeDecrease) == 0 && this.dis == recorderPoint.dis && Double.compare(this.originalLon, recorderPoint.originalLon) == 0 && Double.compare(this.originalLat, recorderPoint.originalLat) == 0 && this.flagSegment == recorderPoint.flagSegment;
    }

    public final double getCumulativeDecrease() {
        return this.cumulativeDecrease;
    }

    public final double getCumulativeIncrease() {
        return this.cumulativeIncrease;
    }

    public final int getDis() {
        return this.dis;
    }

    public final double getEle() {
        return this.ele;
    }

    public final boolean getFlagSegment() {
        return this.flagSegment;
    }

    public final int getLat() {
        return this.lat;
    }

    public final int getLon() {
        return this.lon;
    }

    public final int getNo() {
        return this.no;
    }

    public final double getOriginalLat() {
        return this.originalLat;
    }

    public final double getOriginalLon() {
        return this.originalLon;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.no) * 31) + Integer.hashCode(this.lon)) * 31) + Integer.hashCode(this.lat)) * 31) + Double.hashCode(this.ele)) * 31) + Integer.hashCode(this.type)) * 31) + Double.hashCode(this.cumulativeIncrease)) * 31) + Double.hashCode(this.cumulativeDecrease)) * 31) + Integer.hashCode(this.dis)) * 31) + Double.hashCode(this.originalLon)) * 31) + Double.hashCode(this.originalLat)) * 31) + Boolean.hashCode(this.flagSegment);
    }

    public final void setEle(double d) {
        this.ele = d;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "RecorderPoint(no=" + this.no + ", lon=" + this.lon + ", lat=" + this.lat + ", ele=" + this.ele + ", type=" + this.type + ", cumulativeIncrease=" + this.cumulativeIncrease + ", cumulativeDecrease=" + this.cumulativeDecrease + ", dis=" + this.dis + ", originalLon=" + this.originalLon + ", originalLat=" + this.originalLat + ", flagSegment=" + this.flagSegment + ")";
    }

    public RecorderPoint(int i, int i2, int i3, double d, int i4, double d2, double d3, int i5, double d4, double d5, boolean z) {
        this.no = i;
        this.lon = i2;
        this.lat = i3;
        this.ele = d;
        this.type = i4;
        this.cumulativeIncrease = d2;
        this.cumulativeDecrease = d3;
        this.dis = i5;
        this.originalLon = d4;
        this.originalLat = d5;
        this.flagSegment = z;
    }

    public /* synthetic */ RecorderPoint(int i, int i2, int i3, double d, int i4, double d2, double d3, int i5, double d4, double d5, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0.0d : d, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0.0d : d2, (i6 & 64) != 0 ? 0.0d : d3, (i6 & 128) != 0 ? 0 : i5, (i6 & 256) != 0 ? 0.0d : d4, (i6 & 512) == 0 ? d5 : 0.0d, (i6 & 1024) != 0 ? false : z);
    }
}
