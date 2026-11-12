package com.xiaomi.fitness.route.export.track;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003Jc\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0018R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0018¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/WptRecorderPoint;", "", "no", "", "name", "", "lon", "lat", "ele", "cumulativeIncrease", "", "cumulativeDecrease", "disToNextWptPoint", "disToStartPoint", "<init>", "(I[BIIIDDII)V", "getNo", "()I", "getName", "()[B", "getLon", "getLat", "getEle", "setEle", "(I)V", "getCumulativeIncrease", "()D", "setCumulativeIncrease", "(D)V", "getCumulativeDecrease", "setCumulativeDecrease", "getDisToNextWptPoint", "setDisToNextWptPoint", "getDisToStartPoint", "setDisToStartPoint", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WptRecorderPoint {
    private double cumulativeDecrease;
    private double cumulativeIncrease;
    private int disToNextWptPoint;
    private int disToStartPoint;
    private int ele;
    private final int lat;
    private final int lon;

    @NotNull
    private final byte[] name;
    private final int no;

    public WptRecorderPoint(int i, @NotNull byte[] name, int i2, int i3, int i4, double d, double d2, int i5, int i6) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.no = i;
        this.name = name;
        this.lon = i2;
        this.lat = i3;
        this.ele = i4;
        this.cumulativeIncrease = d;
        this.cumulativeDecrease = d2;
        this.disToNextWptPoint = i5;
        this.disToStartPoint = i6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNo() {
        return this.no;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLon() {
        return this.lon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getEle() {
        return this.ele;
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
    public final int getDisToNextWptPoint() {
        return this.disToNextWptPoint;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDisToStartPoint() {
        return this.disToStartPoint;
    }

    @NotNull
    public final WptRecorderPoint copy(int no2, @NotNull byte[] name, int lon, int lat, int ele, double cumulativeIncrease, double cumulativeDecrease, int disToNextWptPoint, int disToStartPoint) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WptRecorderPoint(no2, name, lon, lat, ele, cumulativeIncrease, cumulativeDecrease, disToNextWptPoint, disToStartPoint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WptRecorderPoint)) {
            return false;
        }
        WptRecorderPoint wptRecorderPoint = (WptRecorderPoint) other;
        return this.no == wptRecorderPoint.no && Intrinsics.areEqual(this.name, wptRecorderPoint.name) && this.lon == wptRecorderPoint.lon && this.lat == wptRecorderPoint.lat && this.ele == wptRecorderPoint.ele && Double.compare(this.cumulativeIncrease, wptRecorderPoint.cumulativeIncrease) == 0 && Double.compare(this.cumulativeDecrease, wptRecorderPoint.cumulativeDecrease) == 0 && this.disToNextWptPoint == wptRecorderPoint.disToNextWptPoint && this.disToStartPoint == wptRecorderPoint.disToStartPoint;
    }

    public final double getCumulativeDecrease() {
        return this.cumulativeDecrease;
    }

    public final double getCumulativeIncrease() {
        return this.cumulativeIncrease;
    }

    public final int getDisToNextWptPoint() {
        return this.disToNextWptPoint;
    }

    public final int getDisToStartPoint() {
        return this.disToStartPoint;
    }

    public final int getEle() {
        return this.ele;
    }

    public final int getLat() {
        return this.lat;
    }

    public final int getLon() {
        return this.lon;
    }

    @NotNull
    public final byte[] getName() {
        return this.name;
    }

    public final int getNo() {
        return this.no;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.no) * 31) + Arrays.hashCode(this.name)) * 31) + Integer.hashCode(this.lon)) * 31) + Integer.hashCode(this.lat)) * 31) + Integer.hashCode(this.ele)) * 31) + Double.hashCode(this.cumulativeIncrease)) * 31) + Double.hashCode(this.cumulativeDecrease)) * 31) + Integer.hashCode(this.disToNextWptPoint)) * 31) + Integer.hashCode(this.disToStartPoint);
    }

    public final void setCumulativeDecrease(double d) {
        this.cumulativeDecrease = d;
    }

    public final void setCumulativeIncrease(double d) {
        this.cumulativeIncrease = d;
    }

    public final void setDisToNextWptPoint(int i) {
        this.disToNextWptPoint = i;
    }

    public final void setDisToStartPoint(int i) {
        this.disToStartPoint = i;
    }

    public final void setEle(int i) {
        this.ele = i;
    }

    @NotNull
    public String toString() {
        return "WptRecorderPoint(no=" + this.no + ", name=" + Arrays.toString(this.name) + ", lon=" + this.lon + ", lat=" + this.lat + ", ele=" + this.ele + ", cumulativeIncrease=" + this.cumulativeIncrease + ", cumulativeDecrease=" + this.cumulativeDecrease + ", disToNextWptPoint=" + this.disToNextWptPoint + ", disToStartPoint=" + this.disToStartPoint + ")";
    }

    public /* synthetic */ WptRecorderPoint(int i, byte[] bArr, int i2, int i3, int i4, double d, double d2, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bArr, i2, i3, i4, (i7 & 32) != 0 ? 0.0d : d, (i7 & 64) != 0 ? 0.0d : d2, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) != 0 ? 0 : i6);
    }
}
