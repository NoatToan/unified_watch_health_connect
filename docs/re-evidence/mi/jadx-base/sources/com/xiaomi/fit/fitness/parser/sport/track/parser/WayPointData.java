package com.xiaomi.fit.fitness.parser.sport.track.parser;

import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\tHÆ\u0003JF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "", "name", "", "lat", "", "lon", BizTypeConstants.ELEVATION, "desc", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointDescData;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointDescData;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getLat", "()Ljava/lang/Double;", "setLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLon", "setLon", "getElevation", "setElevation", "getDesc", "()Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointDescData;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointDescData;)Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "equals", "", "other", "hashCode", "", "toString", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WayPointData {

    @NotNull
    private final WayPointDescData desc;

    @Nullable
    private Double elevation;

    @Nullable
    private Double lat;

    @Nullable
    private Double lon;

    @NotNull
    private String name;

    public WayPointData(@NotNull String name, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @NotNull WayPointDescData desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.name = name;
        this.lat = d;
        this.lon = d2;
        this.elevation = d3;
        this.desc = desc;
    }

    public static /* synthetic */ WayPointData copy$default(WayPointData wayPointData, String str, Double d, Double d2, Double d3, WayPointDescData wayPointDescData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wayPointData.name;
        }
        if ((i & 2) != 0) {
            d = wayPointData.lat;
        }
        Double d4 = d;
        if ((i & 4) != 0) {
            d2 = wayPointData.lon;
        }
        Double d5 = d2;
        if ((i & 8) != 0) {
            d3 = wayPointData.elevation;
        }
        Double d6 = d3;
        if ((i & 16) != 0) {
            wayPointDescData = wayPointData.desc;
        }
        return wayPointData.copy(str, d4, d5, d6, wayPointDescData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getElevation() {
        return this.elevation;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final WayPointDescData getDesc() {
        return this.desc;
    }

    @NotNull
    public final WayPointData copy(@NotNull String name, @Nullable Double lat, @Nullable Double lon, @Nullable Double elevation, @NotNull WayPointDescData desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new WayPointData(name, lat, lon, elevation, desc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WayPointData)) {
            return false;
        }
        WayPointData wayPointData = (WayPointData) other;
        return Intrinsics.areEqual(this.name, wayPointData.name) && Intrinsics.areEqual((Object) this.lat, (Object) wayPointData.lat) && Intrinsics.areEqual((Object) this.lon, (Object) wayPointData.lon) && Intrinsics.areEqual((Object) this.elevation, (Object) wayPointData.elevation) && Intrinsics.areEqual(this.desc, wayPointData.desc);
    }

    @NotNull
    public final WayPointDescData getDesc() {
        return this.desc;
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

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Double d = this.lat;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.lon;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.elevation;
        return ((iHashCode3 + (d3 != null ? d3.hashCode() : 0)) * 31) + this.desc.hashCode();
    }

    public final void setElevation(@Nullable Double d) {
        this.elevation = d;
    }

    public final void setLat(@Nullable Double d) {
        this.lat = d;
    }

    public final void setLon(@Nullable Double d) {
        this.lon = d;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "WayPointData(name=" + this.name + ", lat=" + this.lat + ", lon=" + this.lon + ", elevation=" + this.elevation + ", desc=" + this.desc + ")";
    }
}
