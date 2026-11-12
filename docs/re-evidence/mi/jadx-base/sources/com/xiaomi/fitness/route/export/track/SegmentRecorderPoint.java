package com.xiaomi.fitness.route.export.track;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0016¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/SegmentRecorderPoint;", "", "no", "", "lon", "lat", "ele", "", MediaStoreUtil.MediaInfo.SIZE, "distance", "<init>", "(IIIDII)V", "getNo", "()I", "getLon", "getLat", "getEle", "()D", "setEle", "(D)V", "getSize", "setSize", "(I)V", "getDistance", "setDistance", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SegmentRecorderPoint {
    private int distance;
    private double ele;
    private final int lat;
    private final int lon;
    private final int no;
    private int size;

    public SegmentRecorderPoint(int i, int i2, int i3, double d, int i4, int i5) {
        this.no = i;
        this.lon = i2;
        this.lat = i3;
        this.ele = d;
        this.size = i4;
        this.distance = i5;
    }

    public static /* synthetic */ SegmentRecorderPoint copy$default(SegmentRecorderPoint segmentRecorderPoint, int i, int i2, int i3, double d, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = segmentRecorderPoint.no;
        }
        if ((i6 & 2) != 0) {
            i2 = segmentRecorderPoint.lon;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = segmentRecorderPoint.lat;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            d = segmentRecorderPoint.ele;
        }
        double d2 = d;
        if ((i6 & 16) != 0) {
            i4 = segmentRecorderPoint.size;
        }
        int i9 = i4;
        if ((i6 & 32) != 0) {
            i5 = segmentRecorderPoint.distance;
        }
        return segmentRecorderPoint.copy(i, i7, i8, d2, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNo() {
        return this.no;
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
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    @NotNull
    public final SegmentRecorderPoint copy(int no2, int lon, int lat, double ele, int size, int distance) {
        return new SegmentRecorderPoint(no2, lon, lat, ele, size, distance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentRecorderPoint)) {
            return false;
        }
        SegmentRecorderPoint segmentRecorderPoint = (SegmentRecorderPoint) other;
        return this.no == segmentRecorderPoint.no && this.lon == segmentRecorderPoint.lon && this.lat == segmentRecorderPoint.lat && Double.compare(this.ele, segmentRecorderPoint.ele) == 0 && this.size == segmentRecorderPoint.size && this.distance == segmentRecorderPoint.distance;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final double getEle() {
        return this.ele;
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

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.no) * 31) + Integer.hashCode(this.lon)) * 31) + Integer.hashCode(this.lat)) * 31) + Double.hashCode(this.ele)) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.distance);
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setEle(double d) {
        this.ele = d;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    @NotNull
    public String toString() {
        return "SegmentRecorderPoint(no=" + this.no + ", lon=" + this.lon + ", lat=" + this.lat + ", ele=" + this.ele + ", size=" + this.size + ", distance=" + this.distance + ")";
    }

    public /* synthetic */ SegmentRecorderPoint(int i, int i2, int i3, double d, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i6 & 8) != 0 ? 0.0d : d, i4, i5);
    }
}
