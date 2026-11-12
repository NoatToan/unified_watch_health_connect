package com.xiaomi.fit.fitness.parser.sport.track.parser;

import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointDescData;", "", "lat", "", "lon", BizTypeConstants.ELEVATION, "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLon", "getElevation", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointDescData;", "equals", "", "other", "hashCode", "", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WayPointDescData {

    @Nullable
    private final Double elevation;

    @Nullable
    private final Double lat;

    @Nullable
    private final Double lon;

    public WayPointDescData(@Nullable Double d, @Nullable Double d2, @Nullable Double d3) {
        this.lat = d;
        this.lon = d2;
        this.elevation = d3;
    }

    public static /* synthetic */ WayPointDescData copy$default(WayPointDescData wayPointDescData, Double d, Double d2, Double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = wayPointDescData.lat;
        }
        if ((i & 2) != 0) {
            d2 = wayPointDescData.lon;
        }
        if ((i & 4) != 0) {
            d3 = wayPointDescData.elevation;
        }
        return wayPointDescData.copy(d, d2, d3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getElevation() {
        return this.elevation;
    }

    @NotNull
    public final WayPointDescData copy(@Nullable Double lat, @Nullable Double lon, @Nullable Double elevation) {
        return new WayPointDescData(lat, lon, elevation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WayPointDescData)) {
            return false;
        }
        WayPointDescData wayPointDescData = (WayPointDescData) other;
        return Intrinsics.areEqual((Object) this.lat, (Object) wayPointDescData.lat) && Intrinsics.areEqual((Object) this.lon, (Object) wayPointDescData.lon) && Intrinsics.areEqual((Object) this.elevation, (Object) wayPointDescData.elevation);
    }

    @Nullable
    public final Double getElevation() {
        return this.elevation;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    public final Double getLon() {
        return this.lon;
    }

    public int hashCode() {
        Double d = this.lat;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.lon;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.elevation;
        return iHashCode2 + (d3 != null ? d3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WayPointDescData(lat=" + this.lat + ", lon=" + this.lon + ", elevation=" + this.elevation + ")";
    }
}
