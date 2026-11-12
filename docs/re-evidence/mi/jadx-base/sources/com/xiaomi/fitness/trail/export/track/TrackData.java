package com.xiaomi.fitness.trail.export.track;

import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/trail/export/track/TrackData;", "", "latitude", "", "longitude", BizTypeConstants.ELEVATION, "time", "", "<init>", "(DDDLjava/lang/Long;)V", "getLatitude", "()D", "getLongitude", "getElevation", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(DDDLjava/lang/Long;)Lcom/xiaomi/fitness/trail/export/track/TrackData;", "equals", "", "other", "hashCode", "", "toString", "", "sport-record-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrackData {
    private final double elevation;
    private final double latitude;
    private final double longitude;

    @Nullable
    private Long time;

    public TrackData(double d, double d2, double d3, @Nullable Long l) {
        this.latitude = d;
        this.longitude = d2;
        this.elevation = d3;
        this.time = l;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getElevation() {
        return this.elevation;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final TrackData copy(double latitude, double longitude, double elevation, @Nullable Long time) {
        return new TrackData(latitude, longitude, elevation, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackData)) {
            return false;
        }
        TrackData trackData = (TrackData) other;
        return Double.compare(this.latitude, trackData.latitude) == 0 && Double.compare(this.longitude, trackData.longitude) == 0 && Double.compare(this.elevation, trackData.elevation) == 0 && Intrinsics.areEqual(this.time, trackData.time);
    }

    public final double getElevation() {
        return this.elevation;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.elevation)) * 31;
        Long l = this.time;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final void setTime(@Nullable Long l) {
        this.time = l;
    }

    @NotNull
    public String toString() {
        return "TrackData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", elevation=" + this.elevation + ", time=" + this.time + ")";
    }

    public /* synthetic */ TrackData(double d, double d2, double d3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, (i & 8) != 0 ? 0L : l);
    }
}
