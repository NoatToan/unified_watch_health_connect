package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/Region;", "", "latitude", "", "longitude", "latitudeDelta", "longitudeDelta", "zoom", "", "<init>", "(DDDLjava/lang/Double;I)V", "getLatitude", "()D", "getLongitude", "getLatitudeDelta", "getLongitudeDelta", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getZoom", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(DDDLjava/lang/Double;I)Lcom/xiaomi/wearable/yrn/components/amap/Region;", "equals", "", "other", "hashCode", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Region {
    private final double latitude;
    private final double latitudeDelta;
    private final double longitude;

    @Nullable
    private final Double longitudeDelta;
    private final int zoom;

    public Region(double d, double d2, double d3, @Nullable Double d4, int i) {
        this.latitude = d;
        this.longitude = d2;
        this.latitudeDelta = d3;
        this.longitudeDelta = d4;
        this.zoom = i;
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
    public final double getLatitudeDelta() {
        return this.latitudeDelta;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLongitudeDelta() {
        return this.longitudeDelta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getZoom() {
        return this.zoom;
    }

    @NotNull
    public final Region copy(double latitude, double longitude, double latitudeDelta, @Nullable Double longitudeDelta, int zoom) {
        return new Region(latitude, longitude, latitudeDelta, longitudeDelta, zoom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Region)) {
            return false;
        }
        Region region = (Region) other;
        return Double.compare(this.latitude, region.latitude) == 0 && Double.compare(this.longitude, region.longitude) == 0 && Double.compare(this.latitudeDelta, region.latitudeDelta) == 0 && Intrinsics.areEqual((Object) this.longitudeDelta, (Object) region.longitudeDelta) && this.zoom == region.zoom;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLatitudeDelta() {
        return this.latitudeDelta;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final Double getLongitudeDelta() {
        return this.longitudeDelta;
    }

    public final int getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.latitudeDelta)) * 31;
        Double d = this.longitudeDelta;
        return ((iHashCode + (d == null ? 0 : d.hashCode())) * 31) + Integer.hashCode(this.zoom);
    }

    @NotNull
    public String toString() {
        return "Region(latitude=" + this.latitude + ", longitude=" + this.longitude + ", latitudeDelta=" + this.latitudeDelta + ", longitudeDelta=" + this.longitudeDelta + ", zoom=" + this.zoom + ")";
    }

    public /* synthetic */ Region(double d, double d2, double d3, Double d4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, (i2 & 16) != 0 ? 15 : i);
    }
}
